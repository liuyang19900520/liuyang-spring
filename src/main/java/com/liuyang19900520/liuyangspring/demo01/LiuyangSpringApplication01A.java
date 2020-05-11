package com.liuyang19900520.liuyangspring.demo01;

/**
 * @author liuya
 */
public class LiuyangSpringApplication01A {

    public static void main(String[] args) {
        Student zhang = new Student("张三");
        School school = new School(zhang);
        school.learnLesson();
    }

}
