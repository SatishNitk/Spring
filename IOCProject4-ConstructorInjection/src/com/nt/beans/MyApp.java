package com.nt.beans;

public class MyApp {
	private Dependent_class dept;
	MyApp(Dependent_class dept, String name){
		this.dept = dept;
		System.out.println("my name is  "+name);
	}
//	public void setdependent(Dependent_class dd) {
//		this.dept = dd;
//	}
	
	public void calculator(String type, int a , int b) {
		if(type.equalsIgnoreCase("add")){
			System.out.println(dept.add(a, b));
		}
		else if(type.equalsIgnoreCase("subtract")) {
			System.out.println(dept.subtract(a, b));
		}
		else if(type.equalsIgnoreCase("multiply")) {
			System.out.println(dept.multiple(a, b));
		}
		else {
			System.out.println(dept.divide(a, b));
		}
	}
}