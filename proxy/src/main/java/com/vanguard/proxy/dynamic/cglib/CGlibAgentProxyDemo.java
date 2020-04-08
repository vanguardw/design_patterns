package com.vanguard.proxy.dynamic.cglib;

import com.vanguard.proxy.dynamic.bean.Apple;

/**
 * @title: CGlib实现的动态代理
 * @description: 如果目标对象的实现类没有实现接口，Spring AOP 将会采用 CGLIB 来生成 AOP 代理类
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class CGlibAgentProxyDemo {

    public static void main(String[] args) {
        CGlibAgent cglib = new CGlibAgent();
        Apple apple = (Apple) cglib.getInstance(new Apple());
        apple.show();
    }
}
