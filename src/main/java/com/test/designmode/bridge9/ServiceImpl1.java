package com.test.designmode.bridge9;

/**
 * @author 老肥猪
 * @since 2019/3/2
 */
public class ServiceImpl1 implements Implementor {
    /**
     * 操作
     */
    @Override
    public void operationImpl() {
        System.out.println("业务1的操作");
    }
}
