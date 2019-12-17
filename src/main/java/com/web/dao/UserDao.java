package com.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
