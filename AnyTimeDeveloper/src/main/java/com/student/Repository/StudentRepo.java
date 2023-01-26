package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
