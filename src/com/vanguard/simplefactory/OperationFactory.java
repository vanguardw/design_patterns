package com.vanguard.simplefactory;


/**
 * @Title: 运算对象的工厂类
 * @Description: 运用了简单工厂模式，根据传过来的运算类型获得相应的对象
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class OperationFactory {

    /**
     * 根据传过来的运算类型获得相应的对象
     * @param operaType
     * @return
     */
    public static Operation createOperation(String operaType) throws Exception {
        Operation operation = null;
        switch (operaType) {
            case "+" :
                operation = new OperationAdd();
                break;
            case "-" :
                operation = new OperationSub();
                break;
            case "*" :
                operation = new OperationMul();
                break;
            case "/" :
                operation = new OperationDiv();
                break;
            default:
                throw new Exception("运算类型错误");

        }
        return operation;
    }
}
