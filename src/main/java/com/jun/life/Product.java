package com.jun.life;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author HuangJun7
 * @date 2021-10-28 21:49
 */
@Component
public class Product {
    @PostConstruct
    public void myInit() {
        System.out.println("初始化myInit方法执行");
    }
    @PreDestroy
    public void myDestroy() {
        System.out.println("销毁方法myDestroy执行");
    }
}
