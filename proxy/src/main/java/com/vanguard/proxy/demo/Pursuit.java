package com.vanguard.proxy.demo;

/**
 * @title: 被代理的类：追求者
 * @description:
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class Pursuit implements GiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }


    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
