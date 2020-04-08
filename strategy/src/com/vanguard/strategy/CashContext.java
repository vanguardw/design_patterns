package com.vanguard.strategy;

/**
 * @Title: 策略模式和简单工厂模式相结合
 * @Description: 根据传入的类型，选择不同的现金收费优惠方式，实例化相应的对象
 *               完全封装不同的收费优惠算法，客户端不用接触到这些算法对象，就可以通过传入的类型，使用相应的算法
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                this.cashSuper = new CashNormal();
                break;
            case "满300减100":
                this.cashSuper = new CashReturn("300", "100");
                break;
            case "打8折":
                this.cashSuper = new CashRebate("0.8");
                break;
            default:
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
