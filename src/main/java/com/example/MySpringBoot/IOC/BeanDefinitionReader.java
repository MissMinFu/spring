package com.example.MySpringBoot.IOC;


public interface BeanDefinitionReader {

    public void loadBeanDefinitions(Resource location) throws Exception;

}
