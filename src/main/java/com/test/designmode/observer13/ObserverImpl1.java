package com.test.designmode.observer13;

/**
 * @author 老肥猪
 * @since 2019/3/2
 */
public class ObserverImpl1 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者1收到消息，正在更新");
    }
}
