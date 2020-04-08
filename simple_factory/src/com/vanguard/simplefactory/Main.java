package com.vanguard.simplefactory;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 20/3/15
 */
public class Main {

    public static void main(String[] args) {
        try {
            //工厂创建加法运算对象
            Operation operation = OperationFactory.createOperation("+");
            operation.setNumberA(5);
            operation.setNumberB(10);
            double result = operation.getResult();
            System.out.println("result:" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
