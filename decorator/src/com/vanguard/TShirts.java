package com.vanguard;

/**
 * @Title: T恤具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class TShirts extends Finery {

    @Override
    public void show() {
        System.out.print("大T恤  ");
        super.show();
    }
}
