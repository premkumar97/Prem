package com.javasampleapproach.rememberme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javasampleapproach.rememberme.Repository.EmployeeRepository;
import com.javasampleapproach.rememberme.model.Employee;

@Controller
public class WebController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping(value = { "/" })
	public String home() {
		return "home";
	}

	@RequestMapping(value = { "/login" })
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/abcd", method = RequestMethod.POST)
	public void abcd(@RequestParam("modelname") String modelname) {
		
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName(modelname);
		this.employeeRepository.save(employee);
		System.out.println("coming in controller    " + employeeRepository.toString());

	}

}