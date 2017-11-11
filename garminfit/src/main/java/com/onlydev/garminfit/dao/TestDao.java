package com.onlydev.garminfit.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {
	@Resource
	private JdbcTemplate jdbcTemplate;

	
	public List<Map<String,Object>> getUser(){
		String sql="select * from userinfo ";
		List<Map<String,Object>> his=jdbcTemplate.queryForList(sql);
		
		return his;
		
	}
}
