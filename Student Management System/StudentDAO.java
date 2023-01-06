package com.sms.dao;

import java.util.List;

import com.sms.entity.Student;

public interface StudentDAO {
	
	void addStudent(Student student);
	
	List<Student> fetchStudent(long alroll, String alpassword);
	
	Student changePassword(long alroll, String alpassword, Student student);
}
