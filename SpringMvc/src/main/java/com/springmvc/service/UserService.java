package com.springmvc.service;

import java.util.List;

import com.springmvc.model.User;

public interface UserService {
	User findById(Long id);
	User save(String name);
	List<User> findAll();
}
