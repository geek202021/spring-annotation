package com.jun.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HuangJun7
 * @date 2021-10-28 22:11
 */
@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;
    public UserDAO getUserDAO() {
        return userDAO;
    }
    //注入UserDAO:基于类型进行注入：注入对象的类型，必须与目标成员变量类型相同或者是其子类（实现类）
    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void register() {
       userDAO.save();
    }
}
