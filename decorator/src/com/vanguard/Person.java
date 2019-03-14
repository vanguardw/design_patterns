package com.vanguard;

/**
 * @Title: Person类
 * @Description: 装饰者模式需要被扩展的类
 *              ConcreteComponent
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
