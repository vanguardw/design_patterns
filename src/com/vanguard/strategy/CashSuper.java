package com.vanguard.strategy;

/**
 * @Title: 现金收费接口
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public interface CashSuper {

    /**
     * 现金收取的方法
     * @param money
     * @return
     */
    double acceptCash(double money);
}
