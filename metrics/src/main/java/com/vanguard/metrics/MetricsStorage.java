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
public interface MetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);

}
