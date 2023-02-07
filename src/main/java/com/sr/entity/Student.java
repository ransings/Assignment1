package com.sr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Student {
	@Id
	@SequenceGenerator(name ="stud_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "stud_seq")
	private Integer studentId;
	private Integer rollNo;
	private String firstName;
	private String lastName;
	private Float percentage;
		
	//0-param constructor
	public Student() {
		super();
	}

	//Parameterised Constructor
	public Student(Integer rollNo, String firstName, String lastName, Float percentage) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.percentage = percentage;
	}

	//Getters and Setters
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getPercentage() {
		return percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	
	//toString
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", rollNo=" + rollNo + ", firstName=" + firstName + ", lastName="
				+ lastName + ", percentage=" + percentage + "]";
	}
	

}
