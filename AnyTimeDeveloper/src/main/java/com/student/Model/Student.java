package com.student.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int studentid;
	private String studentFname;
	private String studentLname;
	private String Address;
	private String studentMobile;
	private String email;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentFname=" + studentFname + ", studentLname=" + studentLname
				+ ", Address=" + Address + ", studentMobile=" + studentMobile + ", email=" + email + "]";
	}
	public Student(int studentid, String studentFname, String studentLname, String address, String studentMobile,
			String email) {
		super();
		this.studentid = studentid;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		Address = address;
		this.studentMobile = studentMobile;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
