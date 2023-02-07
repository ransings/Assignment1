package com.sr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sr.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
