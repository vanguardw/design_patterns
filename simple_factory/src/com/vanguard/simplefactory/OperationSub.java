package com.vanguard.simplefactory;

/**
 * @Title: 减法的运算类
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
