package com.collectionframeworks.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		return std1.stdName.compareTo(std2.stdName);
	}
 }
