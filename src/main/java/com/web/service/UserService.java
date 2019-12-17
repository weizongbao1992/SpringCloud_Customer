package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.dao.UserDao;
import com.web.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUser(Integer id) {
		return userDao.findById(id).get();
	}
	public void addUser(User user) {
		userDao.save(user);
	}
}
