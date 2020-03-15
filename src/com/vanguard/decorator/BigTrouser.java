package com.vanguard.decorator;

/**
 * @Title: 垮裤具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        System.out.print("垮裤  ");
        super.show();
    }
}
