package com.sonata05;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String arg[]) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(101,"Vijay",67));
		a1.add(new Student(106,"Ajay",68));
		a1.add(new Student(108,"ram",69));
		
		Collections.sort(a1);
		for(Student st:a1) {
			System.out.println(st.rollno+" "+st.name+" "+st.marks);
		}
			
	}

}
