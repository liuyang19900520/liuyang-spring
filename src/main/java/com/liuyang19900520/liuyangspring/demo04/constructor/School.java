package com.liuyang19900520.liuyangspring.demo04.constructor;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author liuya
 */
@AllArgsConstructor
@Component
public class School {

    //没有setter方法，不需要配置构造器，就可以注入
    private Student student;

    private Teacher teacher;


    public void test() {
        this.student.test();
        this.teacher.test();
    }

}
