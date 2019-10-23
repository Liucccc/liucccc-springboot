package com.liucccc.liuccccspringboot.controller;

import com.liucccc.liuccccspringboot.entity.User;
import com.liucccc.liuccccspringboot.http.ResponseResult;
import com.liucccc.liuccccspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * LoginController
 *
 * @author liuchao
 * @date 2019-10-02 15:42
 */
@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public ResponseResult login(@RequestBody User user) {
        String userName = user.getUsername();
        String pwd = user.getPassword();

        User userByName = userService.getUserByName(userName);

        if (userByName != null && userByName.getPassword().equals(pwd)) {
            return ResponseResult.ok();
        }
        return ResponseResult.error("用户名密码不正确！");
    }
}
