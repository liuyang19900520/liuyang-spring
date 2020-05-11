package com.liuyang19900520.liuyangspring.demo02.xml;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
