package com.hui.dao;

import com.hui.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hui
 * @date 2020/9/1 19:29
 * 概要：
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
