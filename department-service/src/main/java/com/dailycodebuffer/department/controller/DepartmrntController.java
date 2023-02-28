package com.dailycodebuffer.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmrntController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("Inside department POST");
		return departmentService.saveDepartment(department);
		
	}

	@GetMapping("/{Id}")
	public Department findDepartmentById(@PathVariable("Id") Long Id) {
		System.out.println("Inside department GET");
		return departmentService.findDepartmentById(Id);
	}
}