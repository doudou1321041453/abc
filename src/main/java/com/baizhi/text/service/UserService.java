package com.baizhi.text.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    public void save(User user);

    public List<User> queryAll();
}
