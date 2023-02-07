package com.sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.StudentDao;
import com.sr.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao dao;

	@Override
	public Student insert(Student std) {
		return dao.save(std);
	}

	@Override
	public Student update(Student std) {
		Optional<Student> opt;
		//checking wheather student with specified id exists or not
		try {
			opt=dao.findById(std.getStudentId());
		}catch (Exception e) {
			System.out.println("Student Id:"+std.getStudentId()+" doesn't Exist");
			return null;
		}
		
		//update Student if Id is exist
		if(opt.isPresent()) {
			return dao.save(std);
		}
		return null;
	}

	@Override
	public List<Student> display() {
		//getting all Students from database
		return dao.findAll();
		
		/*
		 * //Printing Student data
		 * System.out.println("Id"+"\t"+"RollNo"+"\t"+"Full Name"+"\t"+"Percentage");
		 * if(dao.count()>0)
		 * std.forEach((d)->{System.out.println(d.getStudentId()+"\t"+d.getRollNo()+"\t"
		 * +d.getFirstName()+" "+d.getLastName()+"\t"+d.getPercentage());}); else
		 * System.out.println("\tNo Record Found.....");
		 */
	}
	
	@Override
	public Student getStudent(Integer id) {
		Optional<Student> opt;
		//checking wheather studentId exists or not
		try {
			opt=dao.findById(id);
		}catch (Exception e) {
			System.out.println("Student Id:"+id+" doesn't Exist");
			return null;
		}
		
		if(opt!=null)
		try {
		return opt.get();
		}
		catch (Exception e) {
			System.out.println("Student ID::"+id+" Doesn't Exist");
		}
		return null;
	}

	@Override
	public void delete(Integer sid) {
		Optional<Student> opt;
		//checking wheather studentId exists or not
		try {
			opt=dao.findById(sid);
		}catch (Exception e) {
			System.out.println("Student Id:"+sid+" doesn't Exist");
			return;
		}
		
		//delete Student if Id is exist
		if(opt.isPresent()) {
			try {
			dao.deleteById(sid);
			System.out.println(opt.get()+" is Deleted..");
			}catch (Exception e) {
				System.out.println("Student deletion Failed..");
				e.printStackTrace();
			}//catch
		}//if

	}//delete

}//class
