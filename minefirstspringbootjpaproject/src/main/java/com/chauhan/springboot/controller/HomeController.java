package com.chauhan.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chauhan.springboot.entity.Employee;
import com.chauhan.springboot.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String insertEmployee(Model model) {
		
		Employee employee=new Employee();
		employee.setName("RAVI LAL");
		employee.setDesignation("Self-Employeed");
		employee.setDepartment("Constuctions");
		employee.setExp(3); 
		
		Employee em=employeeService.saveEmployee(employee);
		
		String msg= "Employee"+ em.getName()+" with id " + em.getId()  +" is saved successfully" ;
	
	
		model.addAttribute("employee", em);
		model.addAttribute("message", msg);
		
		return "home";
	}
	

	
	
	
}
