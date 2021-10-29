package com.jun.injection;

import org.springframework.stereotype.Repository;

/**
 * @author HuangJun7
 * @date 2021-10-28 22:01
 */
@Repository
public class UserDAOImpl implements UserDAO{
    @Override
    public void save() {
        System.out.println("UserDAOImpl.save");
    }
}
