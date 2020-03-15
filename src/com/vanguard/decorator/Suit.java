package com.vanguard.decorator;

/**
 * @Title: 西装具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Suit extends Finery {

    @Override
    public void show() {
        System.out.print("西装  ");
        super.show();
    }
}
