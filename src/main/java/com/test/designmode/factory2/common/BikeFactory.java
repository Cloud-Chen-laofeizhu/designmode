package com.test.designmode.factory2.common;

/**
 * @author 老肥猪
 * @since 2019/3/2
 * msg:
 */
public class BikeFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Bike();
    }
}
