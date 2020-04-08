package com.vanguard.strategy;

/**
 * @Title: 满减收费类
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class CashReturn implements CashSuper {

    /**
     * 返利条件
     */
    private double moneyCondition;

    /**
     * 返利值
     */
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        //如果金额大于返利条件
        if(money > moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
