package com.collectionframeworks.comparator;

public class Student {
	
	// Declare 
	int stdId;
	String stdName;
	int stdFees;
	
	// Create Parameterized Constructor
	public Student(int stdId, String stdName, int stdFees) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdFees = stdFees;
	}
	
	// Use Getter & Setter

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdFees() {
		return stdFees;
	}

	public void setStdFees(int stdFees) {
		this.stdFees = stdFees;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdFees=" + stdFees + "]";
	}
}
