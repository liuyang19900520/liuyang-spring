package com.liuyang19900520.liuyangspring.demo03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuya
 */
@Configuration
public class StudentConfig {

    public void test() {
        System.out.println("Demo03 test");
    }

    @Bean({"student", "subsystemA-student", "subsystemB-student"})
    public Student findStudent() {
        return new Student("liuyang");
    }
}
