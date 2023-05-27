package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@GetMapping("/display")
	public String display() {
		return "STS first application";
	}
	@GetMapping("/getList")
	public List<Integer> getList(){
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		return list;
	}
	
	@PostMapping("/insertData")
	public ResponseEntity<Employee> insertEmployee(@RequestBody Employee employee) {
		Employee employee2 = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(employee2);
	}
	
}
