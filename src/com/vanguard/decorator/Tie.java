package com.vanguard.decorator;

/**
 * @Title: 领带具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Tie extends Finery {

    @Override
    public void show() {
        System.out.print("领带  ");
        super.show();
    }
}
