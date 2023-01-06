package com.sms.dao;

import java.util.List;

import com.sms.entity.Student;
import com.sms.entity.Department;

//DAO of department
public interface DepartmentDAO {
	
	//create
	void addDepartment(Department department);
	//read
	List<Student> fetchStudents();
	//read
	List<Student> fetchStudentByDeptId(int did);
}
