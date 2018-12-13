package com.vangaurd;

/**
 * @Title: 现金收费工厂类
 * @Description: 根据不同的类型，实例化不同的现金收费对象
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
@Deprecated
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn("300", "100");
                break;
            case "打8折":
                cashSuper = new CashRebate("0.8");
                break;
            default:
        }
        return cashSuper;
    }
}
