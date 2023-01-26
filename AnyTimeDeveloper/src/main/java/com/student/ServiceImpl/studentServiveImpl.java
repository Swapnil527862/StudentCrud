package com.student.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Model.Student;
import com.student.Repository.StudentRepo;
import com.student.Servive.StudentService;

@Service
public class studentServiveImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student create(Student student) {

		return this.studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) {

		Student studentId1 = this.studentRepo.findById(studentId).orElseThrow();
		return studentId1;
	}

	@Override
	public Student deleteStudentById(Integer id) {
		this.studentRepo.deleteById(id);
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> findAll = this.studentRepo.findAll();
	
		return findAll;
	}

	@Override
	public Student updateStudent(Student s, Integer studentid) {

		Student sid = this.studentRepo.findById(studentid).orElseThrow();
	
		sid.setStudentLname(s.getStudentLname());
		sid.setStudentFname(s.getStudentFname());
		sid.setAddress(s.getAddress());
		sid.setEmail(s.getEmail());

		Student save = this.studentRepo.save(sid);
		return save;

	}

}
