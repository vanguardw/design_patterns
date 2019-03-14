package com.vanguard;

/**
 * @Title: 服饰类
 * @Description: 装饰抽象类Decorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Finery extends Person {

    protected Person component;

    public void decorator(Person person) {
        this.component = person;
    }

    @Override
    public void show() {
        if(component != null) {
            component.show();
        }
    }
}
