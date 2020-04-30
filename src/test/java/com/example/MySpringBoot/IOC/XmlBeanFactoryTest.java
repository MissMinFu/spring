package com.example.MySpringBoot.IOC;

import com.example.MySpringBoot.IOC.XML.XmlBeanFactory;
import com.example.MySpringBoot.Model.Car;
import com.example.MySpringBoot.Model.HelloService;
import com.example.MySpringBoot.Model.HelloServiceImpl;
import com.example.MySpringBoot.Model.Wheel;
import org.junit.Test;

public class XmlBeanFactoryTest {

    @Test
    public void getBean() throws Exception {
        //resource来存储我们需要的信息来源和链接到需要的
//        String location = this.getClass().getClassLoader().getResource("simple-spring-ioc.xml").getFile();
        XmlBeanFactory bf = new XmlBeanFactory("simple-spring-ioc.xml");
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car.getWidth() + "m宽， " + car.getMoney());
        HelloService helloService = (HelloService) bf.getBean("helloService");
        helloService.sayHelloWorld();
    }
}
