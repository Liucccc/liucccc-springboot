package com.liucccc.liuccccspringboot.service;


import com.liucccc.liuccccspringboot.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);
}
