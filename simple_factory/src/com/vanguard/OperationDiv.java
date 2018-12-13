package com.vanguard;

/**
 * @Title: 除法运算类
 * @Description:
 * @Author: vanguard
 * @Version: 1.0
 * @Date: 2018/12/13
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() throws Exception {
        if(getNumberB() == 0) {
            throw new Exception("除数不能为零！");
        }
        return getNumberA() / getNumberB();
    }
}
