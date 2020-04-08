package com.vanguard.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @title: CGlib实现的动态代理
 * @description: CGlib是一个字节码增强库，为AOP等提供了底层支持。
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class CGlibAgent implements MethodInterceptor {

    private Object proxy;

    public Object getInstance(Object proxy) {
        this.proxy = proxy;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.proxy.getClass());
        enhancer.setCallback(this);
        //创建增强对象，并返回
        return enhancer.create();
    }

    public void before() {
        System.out.println("before method");
    }

    public void after() {
        System.out.println("after method");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object ret = methodProxy.invokeSuper(o, objects);
        after();

        return ret;
    }


}
