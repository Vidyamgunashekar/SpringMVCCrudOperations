package com.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.dao.EmployeeDaoJDBCTemplate;
import com.springmvc.entity.Employee;

@Controller
public class HomeController {

	@Autowired
	private EmployeeDaoJDBCTemplate dao;

	// Public URL for index page
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	// Public URL for register, we will forward the url using forward: prefix
	@RequestMapping("/registerForm")
	public String registerForm() {
		return "forward:/WEB-INF/views/EmployeeForm.jsp?action=registerForm";
	}

	// public url
	@RequestMapping("/register")
	public String register(@RequestParam("id") int id, @RequestParam String name, @RequestParam("sal") int sal,
			Model model) {
		Employee e = new Employee(id, name, sal);
		if (dao.register(e))
			model.addAttribute("Message", "Registration successful");
		else
			model.addAttribute("Message", "Registration unsuccessful");

		// dao.closeConnection();
		return "ResponseMessage";
	}

	// public url
	@RequestMapping("/updateForm")
	public String updateForm() {
		return "forward:/WEB-INF/views/EmployeeForm.jsp?action=updateForm";
	}

	// private url
	@RequestMapping("/update")
	public String update(@RequestParam("id") int id, @RequestParam("sal") int sal, Model model) {

		if (dao.update(id, sal))
			model.addAttribute("Message", "Update successful");
		else
			model.addAttribute("Message", "Update unsuccessful");

		// dao.closeConnection();
		return "ResponseMessage";
	}

	// public url
	@RequestMapping("/selectbyidForm")
	public String selectbyidForm() {
		return "forward:/WEB-INF/views/EmployeeForm.jsp?action=selectbyidForm";
	}

	// public url
	@RequestMapping("/selectbyid")
	public String selectbyID(@RequestParam("id") int id, Model model) {

		Employee e = dao.selectById(id);

		model.addAttribute("emp", e);// dao.closeConnection();
		return "DisplaySingleRecord";
	}

	// public url
	@RequestMapping("/selectallrecordsForm")
	public String selectallrecordsForm() {
		return "forward:/WEB-INF/views/EmployeeForm.jsp?action=selectallrecordsForm";
	}

	// public url
	@RequestMapping("/selectallrecords")
	public String selectAllRecords(Model model) {

		List<Employee> list = dao.allRecords();

		model.addAttribute("emplist", list);
		// dao.closeConnection();
		return "DisplayAllRecords";
	}

	// public url
	@RequestMapping("/deleterecordbyidForm")
	public String deleterecordbyidForm() {
		return "forward:/WEB-INF/views/EmployeeForm.jsp?action=deleterecordbyidForm";
	}

	// public url
	@RequestMapping("/deleterecordbyid")
	public String deleteByID(@RequestParam int id, Model model) {

		if (dao.deleteByID(id))
			model.addAttribute("Message", "Delete successful");
		else
			model.addAttribute("Message", "Delete unsuccessful");
		// dao.closeConnection();
		return "ResponseMessage";

	}
}
