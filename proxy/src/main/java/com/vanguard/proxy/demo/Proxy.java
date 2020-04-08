package com.vanguard.proxy.demo;

/**
 * @title: 代理类
 * @description:
 * @author: vanguard
 * @version: 1.0
 * @date: 2020/04/08
 */
public class Proxy implements GiveGift {

    private Pursuit gg;

    public Proxy(SchoolGirl schoolGirl) {
        this.gg = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
