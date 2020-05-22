package com.liuyang19900520.liuyangspring.demo04.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


/**
 * @author liuya
 */
@ComponentScan("com.liuyang19900520.liuyangspring.demo04.constructor")
@ImportResource("spring04-constructor.xml")
public class LiuyangSpringApplication04Constructor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LiuyangSpringApplication04Constructor.class);
        //获取school，内部直接获取Student，Teacher
        School test = (School) applicationContext.getBean("school");
        test.test();
    }

}
