package com.liuyang19900520.liuyangspring.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liuya
 */
@AllArgsConstructor
@Data
public class School {

    private Student student;

    public void learnLesson() {
        this.student.go2School();
        System.out.println("老师开始上课");
    }


}
