package com.liuyang19900520.liuyangspring.demo02.java;

import org.springframework.stereotype.Component;

/**
 * @author liuya
 */
@Component("student")
public class Student {

    private String name;

    public void go2School() {
        System.out.println(this.name + "走进教室");
    }


    /**
     * Unsatisfied dependency expressed through constructor parameter 0;
     * 如果出现上述问题，需要加默认的无参构造
     */
    public Student() {
        this.name = "annotation";
    }


}
