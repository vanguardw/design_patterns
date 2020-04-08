package com.vanguard.proxy.dynamic.jdk;

import com.vanguard.proxy.dynamic.bean.Apple;
import com.vanguard.proxy.dynamic.bean.Fruit;

/**
 * @title: JDK的动态代理
 * @description: 如果目标对象的实现类实现了接口，Spring AOP 将会采用 JDK 动态代理来生成 AOP 代理类；
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class DynamicJdkProxyDemo {

    public static void main(String[] args) {
        DynamicProxy proxy = new DynamicProxy(new Apple());
        //获得代理的对象
        Fruit fruit = (Fruit) proxy.getAgent();
        fruit.show();
    }
}
