package com.jun;

import com.jun.bean.User;
import com.jun.injection.Category;
import com.jun.injection.UserService;
import com.jun.injection.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @author HuangJun7
 * @date 2021-10-28 21:18
 */
public class TestAnnotation {
    /**
     * 用于测试Component注解
     */
    @Test
    public void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //User user = (User) ctx.getBean("user");
        User user = (User) ctx.getBean("u"); //.castvar
        System.out.println("user = " + user);//soutv
        System.out.println("id的值是：" + user.getId());
    }

    /**
     * 用于测试@PostConstruct和@PreDestroy
     */
    @Test
    public void test2() {
        //初始化方法在Product类被调用的时候就执行了，工厂创建的同时创建Product类。默认是scope=singleton
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        //想要PreDestroy起作用，必须使用ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ctx.close();
    }
    /**
     * 用于测试AutoWired注解
     */
    @Test
    public void test3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userServiceImpl = (UserService) ctx.getBean("userServiceImpl");
        userServiceImpl.register();
    }
    /**
     * 用于测试@Value注解
     */
    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Category category = (Category) ctx.getBean("category");
        System.out.println("category的id = " + category.getId());
        System.out.println("category的name = " + category.getName());
    }
}
