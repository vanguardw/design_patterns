package com.vanguard.design;

import com.vanguard.design.storage.CredentialStorage;
import com.vanguard.design.storage.MysqlCredentialStorage;

public class DefaultApiAuthencator implements ApiAuthencator {

    private CredentialStorage storage;

    public DefaultApiAuthencator() {
        storage = new MysqlCredentialStorage();
    }

    public DefaultApiAuthencator(CredentialStorage storage) {
        this.storage = storage;
    }

    @Override
    public void auth(String url) {
        ApiRequest apiRequest = ApiRequest.createFormUrl(url);
        auth(apiRequest);
    }

    @Override
    public void auth(ApiRequest apiRequest) {
        String appId = apiRequest.getAppId();
        String token = apiRequest.getToken();
        long timestamp = apiRequest.getTimestamp();
        String originalUrl = apiRequest.getBaseUrl();

        AuthToken clientAuthToken = new AuthToken(token, timestamp);
        if (clientAuthToken.isExpired()) {
            throw new RuntimeException("Token is expired!!!");
        }
        String password = storage.getPasswordByAppId(appId);
        AuthToken serverAuthToken = AuthToken.create(originalUrl, appId, timestamp, password);
        if (!serverAuthToken.match(clientAuthToken)) {
            throw new RuntimeException("Token verfication failed!!!");
        }
    }

}
