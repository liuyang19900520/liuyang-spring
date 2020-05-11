package com.liuyang19900520.liuyangspring.demo03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author liuya
 */
@ComponentScan("com.liuyang19900520.liuyangspring.demo03")
public class LiuyangSpringApplication03 {
    public static void main(String[] args) {
        //传入class对象
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LiuyangSpringApplication03.class);
        StudentConfig service = (StudentConfig) applicationContext.getBean("studentConfig");
        service.test();
        Student sa = (Student) applicationContext.getBean("subsystemA-student");
        Student sb = (Student) applicationContext.getBean("subsystemB-student");
        sa.go2School();
        sb.go2School();
    }

}
