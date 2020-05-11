package com.liuyang19900520.liuyangspring.demo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author liuya
 */
public class LiuyangSpringApplication01B {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring01.xml");
        School school = (School) applicationContext.getBean("school");
        school.learnLesson();
    }

}
