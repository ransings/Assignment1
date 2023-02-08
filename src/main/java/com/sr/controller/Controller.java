package com.sr.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sr.entity.Student;
import com.sr.service.StudentService;

@RestController
public class Controller {
	@Autowired
	private StudentService service;
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@GetMapping("/student")
	public List<Student> display(){
		return service.display();
	}
	
	@PutMapping("student")
	public Student update(@RequestBody Student student) {
		return service.update(student); 
	}
	
	@PostMapping("/student")
	public Student insert(@RequestBody Student student) {
		return service.insert(student);
	}
	
	@DeleteMapping("student")
	public Student delete(@RequestParam int sid) {
		return service.delete(sid);
	}
	
}
