package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	
	private Employee e = new Employee();
	
	
	public void add(int empNo, String name, 
			char gender, String phone) {
		e.setEmpNo(empNo);
		e.setGender(gender);
		e.setName(name);
		e.setPhone(phone);
	}
	
	public void add(int empNo, String name, 
			char gender, String phone, String dept,
			int salary, double bonus) {
		e.setBonus(bonus);
		e.setDept(dept);
		e.setEmpNo(empNo);
		e.setGender(gender);
		e.setName(name);
		e.setPhone(phone);
		e.setSalary(salary);
	}
	
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}

	
	public Employee remove() {
		e.setBonus(0);
		e.setDept(null);
		e.setEmpNo(0);
		e.setGender(' ');
		e.setName(null);
		e.setPhone(null);
		e.setSalary(0);
		return e;
		
	}
	
	public String inform() {
		if(e.getEmpNo() == 0) {
			return null;
		}
		return e.printEmployee();
	}
}

