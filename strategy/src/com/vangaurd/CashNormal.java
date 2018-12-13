package com.vangaurd;

/**
 * @Title: 正常收费
 * @Description: 没有优惠，直接返回money
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
