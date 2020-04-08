package com.vanguard.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @title: JDK实现的动态代理类
 * @description:
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    public DynamicProxy(Object source) {
        super();
        this.source = source;
    }

    public void before() {
        System.out.println("before method");
    }

    public void after() {
        System.out.println("after method");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object ret = method.invoke(this.source, args);
        after();
        return ret;
    }

    /**
     * 获得一个代理的对象
     * @return
     */
    public Object getAgent() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), source.getClass().getInterfaces(), this);
    }
}
