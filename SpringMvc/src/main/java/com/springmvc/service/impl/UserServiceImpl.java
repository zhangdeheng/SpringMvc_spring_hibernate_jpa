package com.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;
import com.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	UserDao userDao;

	@Override
	public User save(String name) {
		return userDao.save(new User(name));
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findById(Long id) {
		return userDao.findById(id);
	}

}
