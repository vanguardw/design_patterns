package com.vanguard;

/**
 * @Title: 皮鞋具体服饰类
 * @Description: ConcreteDecorator
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class LeatherShoes extends Finery {

    @Override
    public void show() {
        System.out.print("皮鞋  ");
        super.show();
    }
}
