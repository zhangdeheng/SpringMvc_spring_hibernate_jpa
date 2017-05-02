package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class LoginUserController {
	 @Resource
	 UserService userService;
	 @RequestMapping("/")
	 @ResponseBody
	 public String index(){
	  return "index";
	 }
	 @RequestMapping("/info")
	 public String info(){
	  return "info";
	 }
	 @RequestMapping("/findall")
	 @ResponseBody
	 public Map<String, Object> getUser(){
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("state", "success");
	  map.put("data", userService.findAll());
	  return map;
	 }
	 @RequestMapping("/findbyid")
	 @ResponseBody
	 public Map<String, Object> findById(Long id){
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("state", "success");
	  map.put("data", userService.findById(id));
	  return map;
	 }
	 @RequestMapping("/add")
	 @ResponseBody
	 public Map<String, Object> save(String name){
	  Map<String, Object> map = new HashMap<String, Object>();
	  map.put("state", "success");
	  map.put("data", userService.save(name));
	  return map;
	 }
}
