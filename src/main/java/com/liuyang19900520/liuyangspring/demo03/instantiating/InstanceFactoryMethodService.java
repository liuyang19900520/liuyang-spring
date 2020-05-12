package com.liuyang19900520.liuyangspring.demo03.instantiating;

/**
 * @author liuya
 */
public class InstanceFactoryMethodService {

    private InstanceFactoryMethodService() {
        System.out.println("InstanceFactoryMethodService=> 构造方法");
    }

    public InstanceFactoryMethodService createInstance() {

        System.out.println("InstanceFactoryMethodService>createInstance 方法");

        return new InstanceFactoryMethodService();
    }

}
