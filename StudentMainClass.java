package com.collectionframeworks.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainClass {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student(101, "Sujit", 4000));
		al.add(new Student(103, "priyanka", 2000));
		al.add(new Student(102, "MAYURI", 6000));
		
		Collections.sort(al, new NameComparator());
		
		// Use for-each loop
		for(Student s : al) {
			
			System.out.println("Student Id > " + s.getStdId() + " Student Name > " + s.getStdName() + " Student Fees > " + s.getStdFees());
			
		}
	}
 }
