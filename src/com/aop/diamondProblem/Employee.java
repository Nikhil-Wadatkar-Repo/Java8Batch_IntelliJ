package com.aop.diamondProblem;

import java.util.function.Function;

public class Employee {
	private int empID;
	private String empName;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
	public String getEmployeename(Employee emp) {
		return emp.empName;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(12, "nana");

		Function<Employee, String> f1 = (emp) -> emp.getEmpName();
		System.out.println(f1.apply(emp1));
		Function<Employee, Integer> f2 = Employee::getEmpID;
		System.out.println(f2.apply(emp1));
		Function<Employee, String> f3 = emp1::getEmployeename;
		System.out.println(f3.apply(emp1));
//		Function<Employee, String> f4 = Employee::getEmployeename;
//		System.out.println(f3.apply(emp1));
		
		
		
	}

}
