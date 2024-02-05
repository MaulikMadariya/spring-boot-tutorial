package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private Long studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="student_rollno")
	private String studentRollNo;
	
	@Column(name="marks")
	private int marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentId, String studentName, String studentRollNo, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNo=" + studentRollNo
				+ ", marks=" + marks + "]";
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
