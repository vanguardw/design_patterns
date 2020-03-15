package com.vanguard.decorator;

/**
 * @Title: 破球鞋具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Sneakers extends Finery {

    @Override
    public void show() {
        System.out.print("破球鞋  ");
        super.show();
    }
}
