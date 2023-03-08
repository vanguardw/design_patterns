package com.vanguard.design;

import com.vanguard.design.utils.MD5Utils;

import java.util.Map;

/**
 * @Title:
 * @Description:
 * @Author: Vanguard
 * @Version: 1.0
 * @Date: 2023/03/08
 */
public class AuthToken {

    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1*60*60;

    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken create(String baseUrl, String appId, long createTime, String password) {
        StringBuffer sb = new StringBuffer(baseUrl);
        sb.append("&").append("appId=").append(appId);
        sb.append("&").append("password=").append(password);
        sb.append("&").append("createTime=").append(createTime);
        return new AuthToken(MD5Utils.md5(sb.toString()), createTime);
    }

    public String getToken() {
        return this.token;
    }

    public boolean isExpired() {
        return this.createTime + expiredTimeInterval <= System.currentTimeMillis();
    }

    public boolean match(AuthToken authToken) {
        return this.token.equals(authToken.getToken());
    }


}
