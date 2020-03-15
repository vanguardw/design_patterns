package com.vanguard.strategy;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class Main {
    public static void main(String[] args) {
        double totalPrice = 500;
        //工厂模式
        /*CashSuper cashSuper = CashFactory.createCashAccept("打8折");
        double payAmount = cashSuper.acceptCash(totalPrice);
        System.out.println(payAmount);*/

        //策略模式和工厂模式结合
        CashContext cashContext = new CashContext("满300减100");
        double payAmount = cashContext.getResult(totalPrice);
        System.out.println(payAmount);
    }
}
