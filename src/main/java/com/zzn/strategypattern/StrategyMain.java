package com.zzn.strategypattern;


/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:45
 */
public class StrategyMain {
    public static void main(String[] args) {
        //策略模式,参考 java.util.concurrent.TimeUnit
        System.out.println(Math.OperationAdd.doOperation(3, 2));
        System.out.println(Math.OperationSubtract.doOperation(3, 2));
        System.out.println(Math.OperationMultiple.doOperation(3, 2));
    }
}
