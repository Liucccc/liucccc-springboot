package com.liucccc.liuccccspringboot.service.impl;

import com.liucccc.liuccccspringboot.dao.UserMapper;
import com.liucccc.liuccccspringboot.entity.User;
import com.liucccc.liuccccspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * userService
 * @author Liucccc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUser(Long id, String name) {
        return userMapper.getUserByIdAndName(id, name);
    }
}
