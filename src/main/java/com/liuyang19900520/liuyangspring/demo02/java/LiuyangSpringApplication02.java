package com.liuyang19900520.liuyangspring.demo02.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author liuya
 */
@ComponentScan("com.liuyang19900520.liuyangspring.demo02.java")
public class LiuyangSpringApplication02 {
    public static void main(String[] args) {
        //传入class对象
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LiuyangSpringApplication02.class);
        School school = (School) applicationContext.getBean("school");
        school.learnLesson();
    }

}
