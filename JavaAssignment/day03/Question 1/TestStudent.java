package com.sonata05;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	List<Student> students = new ArrayList<>();
	public List<Student> getStudent() {
		students.add(new Student(101, "Rishav", 76));
		students.add(new Student(102, "deepak", 96));
		students.add(new Student(103, "sanjay", 95));
		students.add(new Student(104, "Ajaya", 84));
		students.add(new Student(105, "Zubair", 90));
		return students;
	}
	public List<Student>getStudentsSort() {
		List<Student> students = new TestStudent().getStudent();
		students.sort((o1, o2)-> o2.getMarks() - o1.getMarks());
		return students;
	}
	public static void main(String args[]) {
		System.out.println("\t\t - Before Sorting -\n" + new TestStudent().getStudent() + "\n");
		System.out.println("\t\t - After Sorting -\n" + new TestStudent().getStudentsSort());
	}
}