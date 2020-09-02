package com.hui.service;

import com.hui.po.User;

/**
 * @author hui
 * @date 2020/9/1 19:28
 * 概要：
 */
public interface UserService {

    User checkUser(String username,String password);
}
