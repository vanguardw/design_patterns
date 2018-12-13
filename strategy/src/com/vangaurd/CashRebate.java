package com.vangaurd;

/**
 * @Title: 打折收费类
 * @Description: 初始化必须传入折扣率
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class CashRebate implements CashSuper {

    /**
     * 折扣率
     */
    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
