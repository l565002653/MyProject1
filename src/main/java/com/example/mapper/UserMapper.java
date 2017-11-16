package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.User;

@Mapper
public interface UserMapper {
	
	/**
	 * 查询所有用户
	 */
	public List<User> findAll();
}
