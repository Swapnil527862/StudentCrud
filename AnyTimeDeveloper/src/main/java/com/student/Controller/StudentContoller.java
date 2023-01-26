package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.Model.Student;
import com.student.Servive.StudentService;

@RestController
@RequestMapping("/student")
public class StudentContoller {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student create = this.studentService.create(student);
		return new ResponseEntity<Student>(create,HttpStatus.CREATED);
	}
	
	@GetMapping("/{studentid}")
	public ResponseEntity<Student> GetByStudentId(@PathVariable Integer studentid){
		Student getbyid = this.studentService.getStudentById(studentid);
		return new ResponseEntity<Student>(getbyid,HttpStatus.OK);
	}
	@GetMapping("/allstudent")
	public ResponseEntity  <List<Student>>getAllStudents(){
		List<Student> getAll = this.studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(getAll,HttpStatus.OK);
	}
	@DeleteMapping("{student}")
	public ResponseEntity<Student> deleteStudent(@PathVariable Integer student){
		Student delete = this.studentService.deleteStudentById(student);
		return new ResponseEntity<Student>(delete,HttpStatus.OK);
	}
	@PutMapping("/update/{studentid}")
	public ResponseEntity<Student> UpdateStudent(@RequestBody Student student,@PathVariable Integer studentid){
		Student update = this.studentService.updateStudent(student, studentid);
		return new ResponseEntity<Student>(update,HttpStatus.CREATED);
	}
	

}
