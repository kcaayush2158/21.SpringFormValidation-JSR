package com.application.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Student {

	@NotEmpty(message = "student name cannot be empty")
	public String studentName;
	@NotEmpty(message = "Student Address cannot be empty")
	public String studentAddress;
	@NotEmpty(message = "student phone number cannot be empty")
	public String studentPhonenumber;
	@Min(value = 12, message = "age cannot be less than 12")
	@Max(value = 80, message = "age canot be more than 80")
	@NotNull(message = "Age cannot be null")
	private Integer studentAge;
	@Email(message = "email is invalid")
	@NotEmpty(message = "Email cannot be empty")
	private String studentEmail;

	public String getStudentName() {
		return studentName;
	}

	public Integer getAge() {
		return studentAge;
	}

	public void setAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	public String getEmail() {
		return studentEmail;
	}

	public void setEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentPhonenumber() {
		return studentPhonenumber;
	}

	public void setStudentPhonenumber(String studentPhonenumber) {
		this.studentPhonenumber = studentPhonenumber;
	}

}
