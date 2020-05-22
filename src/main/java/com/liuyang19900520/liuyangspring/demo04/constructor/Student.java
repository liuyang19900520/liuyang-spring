package com.liuyang19900520.liuyangspring.demo04.constructor;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author liuya
 */
@Component
@NoArgsConstructor
public class Student {

    private String name;
    private Integer age;
    private Integer rank;


    public Student(String name, Integer age, Integer rank) {
        System.out.println("这是学生的构造方法 name=" + name + " age=" + age + " rank=" + rank);
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public void test(){
        System.out.println("这是学生的test方法");
    }
}
