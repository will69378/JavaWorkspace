package dom.kh.person.controller;

import dom.kh.person.model.vo.Employee;
import dom.kh.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	public int[] personCount() {
		int arrleng = 0;
		
		for(int i= 0; i<s.length; i++) {
			if(s[i]!=null ) {
			arrleng++;
			}	
		}
		for (int i = 0; i < e.length; i++) {
			if(e[i]!=null) {
				arrleng++;
			}
		}
		int[] count = new int[arrleng];
		return count;
	}
	
	public void insertStudent(String name, int age, double height,
			double weight, int grade, String major) {
		Student stu = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if(s[i]==null) {
				s[i] = stu;
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height,
			double weight, int salary, String dept) {
		
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		for (int i = 0; i < e.length; i++) {
			if(e[i]==null) {
				e[i] = emp;
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}
