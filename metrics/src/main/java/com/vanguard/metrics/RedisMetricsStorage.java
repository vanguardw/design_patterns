package com.vanguard.metrics;

import java.util.List;
import java.util.Map;

/**
 * @Title:
 * @Description:
 * @Author: Vanguard
 * @Version: 1.0
 * @Date: 2023/03/22
 */
public class RedisMetricsStorage implements MetricsStorage {
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis) {
        return null;
    }
}
