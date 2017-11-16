package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.assertj.core.internal.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;


@RestController
public class UserController {
	
	//注入服务对象
	@Autowired
	private UserService userService;
	
	/**
	 * 需求：返回一个json格式的数据
	 */
	@RequestMapping("hello")
	public String showHello(){
		return "hello world";
	}
	
	/**
	 * 需求：返回一个pojo对象
	 */
	@RequestMapping("pojo")
	public User showUser(){
		User u=new User();
		u.setId(1);
		u.setUsername("张三丰");
		u.setSex("男");
		u.setBirthday(new Date());
		u.setAddress("武当山");
		
		return u;
	}
	
	/**
	 * 需求：返回一个Map集合对象
	 */
	@RequestMapping("maps")
	public Map<String,Object> showMaps(){
		Map<String,Object> m=new HashMap<String,Object>();
		m.put("username", "张无忌");
		m.put("age", "19");
		return m;
	}
	
	/**
	 * 需求：返回一个List集合对象
	 */
	@RequestMapping("List")
	public List<User> showList(){
		List<User> uList=new ArrayList<>();
		
		//创建user对象
		User u1=new User();
		u1.setId(1);
		u1.setUsername("张三");
		u1.setSex("男");
		u1.setBirthday(new Date());
		u1.setAddress("武当山1");
		
		User u2=new User();
		u2.setId(2);
		u2.setUsername("张三1");
		u2.setSex("男");
		u2.setBirthday(new Date());
		u2.setAddress("武当2");
		
		uList.add(u1);
		uList.add(u2);
		
		return uList;
	}
	
	/**
	 * 需求：整合ssm
	 */
	@RequestMapping("ssm")
	public List<User> findAll(){
		List<User> list = userService.findAll();
		return list;
	}
}
