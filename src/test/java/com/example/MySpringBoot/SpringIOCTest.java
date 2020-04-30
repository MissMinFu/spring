package com.example.MySpringBoot;

import com.example.MySpringBoot.Model.Wheel;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program:MySpringBoot用spring进行测试
 * @description:
 * @author: nevada
 * @create: 2020-04-22 17:14
 **/

public class SpringIOCTest {

    @Test
    public void getBean(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("simple-spring-ioc.xml");
        Wheel wheel = (Wheel) ac.getBean("wheel");
        System.out.println(wheel);
    }


}
