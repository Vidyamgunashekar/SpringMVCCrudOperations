package com.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.entity.Employee;

@Component
public class EmployeeDaoJDBCTemplate 
{
//
//	@Autowired 
//	private JdbcTemplate jdbcTemplate;
//	public void register(Employee e)
//	{
//		Object[] args= {e.getId(),e.getName(),e.getSal()};
//		jdbcTemplate.update("insert into emp values(?,?,?)", args);
//	}
//	
//	public void update(int id,int sal )
//	{
//		Object[] args= {id,sal};
//		jdbcTemplate.update("update emp set sal=? where id=?", args);
//	}
//	
//	
//	
}
