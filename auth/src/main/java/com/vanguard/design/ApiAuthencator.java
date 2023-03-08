package com.vanguard.design;

public interface ApiAuthencator {

    void auth(String baseUrl);

    void auth(ApiRequest apiRequest);

}