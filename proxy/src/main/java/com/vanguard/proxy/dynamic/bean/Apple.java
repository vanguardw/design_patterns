package com.vanguard.proxy.dynamic.bean;

/**
 * @title:
 * @description:
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class Apple implements Fruit {
    @Override
    public void show() {
        System.out.println("<<<<show method is invoked");
    }
}
