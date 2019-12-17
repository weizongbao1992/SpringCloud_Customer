package com.web.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.entity.User;
import com.web.service.UserService;

@RestController
@RequestMapping(path = "customer")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("getUser")
	public User getUser(@RequestParam("id") Integer id) {
		return userService.getUser(id);
	}
	@RequestMapping("getUserByProducter/{id}")
	public User getUserByProducter(@PathVariable("id") Integer id) {
		User user = restTemplate.getForObject("http://Spring-Cloud-Producter/producter/getUser/"+id, User.class);
		return user;
	}
	@GetMapping("/addUser")
	@Transactional
	public void addUser(User user) {
		userService.addUser(user);
		String postForObject = restTemplate.postForObject("http://Spring-Cloud-Producter/producter/addUser",user, String.class);
		int i = 9/0;
		System.out.println("结果是==============="+postForObject);
	}
	
}
