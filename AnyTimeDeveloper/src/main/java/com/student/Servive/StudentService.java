package com.student.Servive;

import java.util.List;

import com.student.Model.Student;

public interface StudentService {
	

	
	Student getStudentById(Integer studentid);
	
	Student deleteStudentById(Integer studentid);
	
	List<Student> getAllStudents();
	


	Student create(Student student);

	Student updateStudent(Student s, Integer studentid);

}
