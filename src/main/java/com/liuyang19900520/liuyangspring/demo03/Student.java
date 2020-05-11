package com.liuyang19900520.liuyangspring.demo03;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liuya
 */
@Data
@AllArgsConstructor
public class Student {
    private String name;

    public void go2School() {
        System.out.println(this.name + "走进教室");
    }
}
