package com.zzn.strategypattern;

/**
 * @author zzn
 * @version 1.0 创建时间 2020/3/25 21:39
 */
public enum Math {

    /**
     * 加
     */
    OperationAdd{
        @Override
        public int doOperation(int num1, int num2) {
            return num1 + num2;
        }
    },
    /**
     * 减
     */
    OperationSubtract{
        @Override
        public int doOperation(int num1, int num2) {
            return num1 - num2;
        }
    },
    /**
     * 乘
     */
    OperationMultiple{
        @Override
        public int doOperation(int num1, int num2) {
            return num1 * num2;
        }
    };

    /**
     * 操作
     * @param num1 参数1
     * @param num2 参数2
     * @return 运行结果
     */
    public abstract int doOperation(int num1, int num2);
}
