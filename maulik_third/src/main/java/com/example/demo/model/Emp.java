package com.example.demo.model;

public class Emp {
	private String EmpName;
	private long Salary;
	private String Dept;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [EmpName=" + EmpName + ", Salary=" + Salary + ", Dept=" + Dept + "]";
	}
	
	
}
