package com.vanguard.proxy.demo;

/**
 * @title: 静态代理测试类
 * @description:
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class StaticProxyDemo {

    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("娇娇");

        Proxy proxy = new Proxy(schoolGirl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
