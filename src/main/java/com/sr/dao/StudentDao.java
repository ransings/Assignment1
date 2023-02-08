package com.sr.dao;

import org.springframework.data.repository.CrudRepository;

import com.sr.entity.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
