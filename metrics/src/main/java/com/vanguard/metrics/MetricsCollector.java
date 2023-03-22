package com.vanguard.metrics;

import org.apache.commons.lang3.StringUtils;

/**
 * @Title:
 * @Description:
 * @Author: Vanguard
 * @Version: 1.0
 * @Date: 2023/03/22
 */
public class MetricsCollector {

    private MetricsStorage metricsStorage;// 基于接口而非实现编程

    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    // 用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }

}
