package com.javasampleapproach.rememberme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javasampleapproach.rememberme.Repository.ModelRepository;
import com.javasampleapproach.rememberme.model.Models;

@Controller
public class WebController {

	@Autowired
	private ModelRepository modelRepository;

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
		
		Models model = new Models();
		model.setId(1L);
		model.setName(modelname);
		this.modelRepository.save(model);
		System.out.println("coming in controller    " + modelRepository.toString());

	}

}