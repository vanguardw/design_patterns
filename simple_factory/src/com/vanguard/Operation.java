package com.vanguard;

/**
 * @Title: 计算的基本运算抽象类
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public abstract class Operation {
    /**
     * 数字A
     */
    private double numberA;

    /**
     * 数字B
     */
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 运算结果方法
     * @return
     * @throws Exception
     */
    public abstract double getResult() throws Exception;
}
