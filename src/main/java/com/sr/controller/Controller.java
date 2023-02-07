package com.sr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sr.entity.Student;
import com.sr.service.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
public class Controller {
	@Autowired
	private StudentService service;
	
	@GetMapping("/student/{id}")
	public String getStudent(@PathVariable int id) {
		return service.getStudent(id)!=null?service.getStudent(id).toString():"Invalid Student Id::"+id;
	}
	
	@GetMapping("/student")
	public List<Student> display(){
		return service.display();
	}
	
}
