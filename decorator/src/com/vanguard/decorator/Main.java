package com.vanguard.decorator;

/**
 * @Title:
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2019/03/14
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person("小王");
        System.out.println("第一种装扮：");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        //装饰过程
        sneakers.decorator(person);
        bigTrouser.decorator(sneakers);
        tShirts.decorator(bigTrouser);
        tShirts.show();

        System.out.println("第二种装扮：");

        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();

        //装饰过程
        leatherShoes.decorator(person);
        tie.decorator(leatherShoes);
        suit.decorator(tie);
        suit.show();
    }
}
