package com.demo.sort;

public class Employee {
	int empid;
	String eName;
	int sal;
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String eName, int sal) {
		super();
		this.empid = empid;
		this.eName = eName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", eName=" + eName + ", sal=" + sal + "]";
	}
	
}
