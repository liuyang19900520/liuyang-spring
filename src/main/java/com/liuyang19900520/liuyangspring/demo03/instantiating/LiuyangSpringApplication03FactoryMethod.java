package com.liuyang19900520.liuyangspring.demo03.instantiating;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author liuya
 */
public class LiuyangSpringApplication03FactoryMethod {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring03-factory-method.xml");
        FactoryMethodService test = (FactoryMethodService) applicationContext.getBean("service");
        System.out.println("=============");
        InstanceFactoryMethodService test2 = (InstanceFactoryMethodService) applicationContext.getBean("service2");
    }

}
