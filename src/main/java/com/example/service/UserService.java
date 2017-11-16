package com.example.service;

import java.util.List;

import com.example.domain.User;


public interface UserService {
	/**
	 * 查询所有用户
	 */
	public List<User> findAll();
}
