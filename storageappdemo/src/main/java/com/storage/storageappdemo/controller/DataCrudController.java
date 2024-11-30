package com.storage.storageappdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.storage.storageappdemo.model.Employee;
import com.storage.storageappdemo.service.RetrieveService;

@Controller
public class DataCrudController {

	@Autowired
	RetrieveService retService;
	
	@GetMapping(path="/employees", produces="application/json")
	public String getAllEmployees(Model model)
	{
		List<Employee> em= retService.getAllEmployee();
		model.addAttribute("em", em);
		System.out.println("-----------");
		em.forEach(
				x->System.out.println(x.getEmail())
				);
		return "employee";
	}
}
