package com.vanguard.metrics;

import org.springframework.mail.javamail.JavaMailSender;

import java.util.*;

/**
 * @Title:
 * @Description:
 * @Author: Vanguard
 * @Version: 1.0
 * @Date: 2023/03/22
 */
public class EmailReporter {

    private static final Long DAY_HOURS_IN_SECONDS = 86400L;

    private MetricsStorage metricsStorage;

    private JavaMailSender emailSender;

    private List<String> toAddresses = new ArrayList<>();

    public EmailReporter(MetricsStorage metricsStorage) {
        // this(metricsStorage, new JavaMailSender(/* 省略参数 */));
    }

    public EmailReporter(MetricsStorage metricsStorage, JavaMailSender emailSender) {
        this.metricsStorage = metricsStorage;
        this.emailSender = emailSender;
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    }

    public void startDailyReport() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date firstTime = calendar.getTime();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                long durationInMillis = DAY_HOURS_IN_SECONDS * 1000;
                long endTimeInMillis = System.currentTimeMillis();
                long startTimeInMillis = endTimeInMillis - durationInMillis;
                Map<String, List<RequestInfo>> requestInfos =
                        metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
                Map<String, RequestStat> stats = new HashMap<>();
                for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                    String apiName = entry.getKey();
                    List<RequestInfo> requestInfosPerApi = entry.getValue();
                    RequestStat requestStat = Aggregator.aggregate(requestInfosPerApi, durationInMillis);
                    stats.put(apiName, requestStat);
                }
            }
            // TODO: 格式化为 html 格式，并且发送邮件
        }, firstTime, DAY_HOURS_IN_SECONDS * 1000);
    }

}
