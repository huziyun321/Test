package com.hzy.service;

import com.hzy.dao.UserDao;
import com.hzy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{


    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findall() {
        return userDao.findall();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }


}
