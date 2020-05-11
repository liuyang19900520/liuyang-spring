package com.liuyang19900520.liuyangspring.demo02.java;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liuya
 */
@NoArgsConstructor
@Component("school")
public class School {

    @Autowired()
    private Student student;

    public void learnLesson() {
        this.student.go2School();
        System.out.println("老师开始上课");
    }

}
