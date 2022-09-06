package com.sonata05;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int marks;
	
	Student(int rollno,String name, int marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public int compareTo(Student st) {
		if(marks == st.marks)
			return 0;
		else if(marks<st.marks)
			return 1;
		else
			return -1;
	}

}
