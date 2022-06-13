package com.hzy.service;

import com.hzy.entity.User;

import java.util.List;

public interface UserService {
    List<User> findall();
    void save(User user);
}
