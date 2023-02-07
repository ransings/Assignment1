package com.sr.service;

import java.util.List;

import com.sr.entity.Student;

public interface StudentService {
	Student insert(Student std);
	Student update(Student id);
	Student getStudent(Integer id);
	List<Student> display();
	void delete(Integer sid);

}
