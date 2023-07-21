package com.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.entity.Employee;

@Component
public class EmployeeDaoJDBCTemplate {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean register(Employee e) {
		Object[] args = { e.getId(), e.getName(), e.getSal() };
		int result = jdbcTemplate.update("insert into emp values(?,?,?)", args);
		if (result == 1)
			return true;
		else
			return false;
	}

	public boolean update(int id, int sal) {
		Object[] args = { sal,id };
		int result = jdbcTemplate.update("update emp set age=? where id=?", args);
		if (result == 1)
			return true;
		else
			return false;

	}

	public Employee selectById(int id) {
		Object[] args = { id };
		return jdbcTemplate.queryForObject("select * from emp where id=?", args, new EmployeeRowMapper());
	}

	public List<Employee> allRecords() {

		return jdbcTemplate.query("select * from emp", new EmployeeRowMapper());
	}

	public boolean deleteByID(int id) {
		Object[] args = { id };
		int result = jdbcTemplate.update("insert into emp values(?,?,?)", args);
		if (result == 1)
			return true;
		else
			return false;

	}

}
