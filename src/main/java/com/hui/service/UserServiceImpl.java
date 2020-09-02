package com.hui.service;

import com.hui.dao.UserRepository;
import com.hui.po.User;
import com.hui.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hui
 * @date 2020/9/1 19:28
 * 概要：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User checkUser(String username, String password) {
        password = MD5Utils.code(password);
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user;
    }
}
