package com.nt.beans;

public class Student {
	private int m1,m2,m3;
	private String name;

	Student(String name, int m1,int m2, int m3){
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public String toString() {
		return "student detail    ->>>   " + name +" " + m1 + " " + m2 + " " + m3;
	}
	
}
