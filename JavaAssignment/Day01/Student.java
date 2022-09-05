package com.sonata02;

public class Student {
	int stdID,stdClass;
	String stdName;
	Student(int a, String c, int b){
		this.stdID=a;
		this.stdName=c;
		this.stdClass=b;
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"Rishav",12);
		System.out.println(s1.stdClass);
		System.out.println(s1.stdName);
	}

}
