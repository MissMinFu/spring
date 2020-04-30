package com.example.MySpringBoot.IOC.Factory;


/**
 * 用来管理Bean
 */
public interface BeanFactory {

    Object getBean(String beanId) throws Exception;

}
