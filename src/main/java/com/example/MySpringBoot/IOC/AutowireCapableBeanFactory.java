//package com.example.MySpringBoot.IOC;
//
//import com.example.MySpringBoot.IOC.Factory.BeanFactory;
//import com.example.MySpringBoot.IOC.Factory.BeanFactoryAware;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
///**
// * @program:MySpringBoot
// * @description:
// * @author: nevada
// * @create: 2020-04-22 16:19
// **/
//public class AutowireCapableBeanFactory implements BeanFactory {
//
//    private Map<String,BeanDefinition> beanDefinitionMap=new ConcurrentHashMap<String, BeanDefinition>();
//
//    @Override
//    public Object getBean(String name) throws Exception {
//        BeanDefinition beanDefinition=beanDefinitionMap.get(name);
//        Object bean=beanDefinition.getBean();
//        if(null==bean){
//            bean=createBean(beanDefinition);
////            bean = initializeBean(bean, name);
//            beanDefinition.setBean(bean);
//        }
//        return bean;
//    }
//    private Object createBean(BeanDefinition bd) throws Exception {
//        Object bean = bd.getBeanClass().newInstance();
//        applyPropertyValues(bean, bd); // 通过反射机制实例化填充对象属性
//        return bean;
//    }
//    private void applyPropertyValues(Object bean, BeanDefinition bd) throws Exception {
//        if (bean instanceof BeanFactoryAware) {
//            ((BeanFactoryAware) bean).setBeanFactory(this);
//        }
//        for (PropertyValue propertyValue : bd.getPropertyValues().getPropertyValues()) {
//            Object value = propertyValue.getValue();
//            if (value instanceof BeanReference) {
//                BeanReference beanReference = (BeanReference) value;
//                value = getBean(beanReference.getName());
//            }
//            try { // 调用 set 方法
//                Method declaredMethod = bean.getClass().getDeclaredMethod("set" +
//                        propertyValue.getName().substring(0, 1).toUpperCase()
//                        + propertyValue.getName().substring(1), value.getClass());
//
//                declaredMethod.setAccessible(true);
//                declaredMethod.invoke(bean, value);
//
//            } catch (NoSuchMethodException e) { // 操作属性
//                Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
//                declaredField.setAccessible(true);
//                try {
//                    int val = Integer.valueOf((String) value); // 看 value 是否能转换成 int 类型
//                    declaredField.set(bean, val);
//                } catch (Exception error) {
//                    declaredField.set(bean, value);
//                }
//
//            }
//        }
//    }
//
////    private Object initializeBean(Object bean, String name) throws Exception {
////        for (BeanPostProcessor beanPostProcessor : beanPostProcessors) {
////            bean = beanPostProcessor.postProcessBeforeInitialization(bean, name);
////        }
////        for (BeanPostProcessor beanPostProcessor : beanPostProcessors) {
////            bean = beanPostProcessor.postProcessAfterInitialization(bean, name);
////        }
////        return bean;
////    }
//}
