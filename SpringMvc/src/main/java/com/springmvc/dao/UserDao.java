package com.springmvc.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.model.User;

public interface UserDao extends JpaRepository<User,Serializable>{
	 User findById(Long id);
}
