package com.liuyang19900520.liuyangspring.demo02.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author liuya
 */
public class LiuyangSpringApplication02 {
    public static void main(String[] args) {
        //spring02xml.xml中bean的路径需要注意
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring02xml.xml");
        School school = (School) applicationContext.getBean("school");
        school.learnLesson();
    }

}
