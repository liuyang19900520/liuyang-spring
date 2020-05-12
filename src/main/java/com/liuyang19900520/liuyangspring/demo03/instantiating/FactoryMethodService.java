package com.liuyang19900520.liuyangspring.demo03.instantiating;

/**
 * @author liuya
 */
public class FactoryMethodService {

    public static FactoryMethodService clientService = new FactoryMethodService();

    private FactoryMethodService() {
        System.out.println("FactoryMethodService=> 构造方法");
    }

    public static FactoryMethodService createInstance() {

        System.out.println("FactoryMethodService>createInstance 方法");

        return clientService;
    }

}
