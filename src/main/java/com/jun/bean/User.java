package com.jun.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author HuangJun7
 * @date 2021-10-28 21:12
 */
//@Component("user")
@Component("u")
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
