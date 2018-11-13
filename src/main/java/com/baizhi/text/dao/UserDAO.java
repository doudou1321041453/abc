package com.baizhi.text.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {

    public void save(User user);

    public List<User> queryAll();

}
