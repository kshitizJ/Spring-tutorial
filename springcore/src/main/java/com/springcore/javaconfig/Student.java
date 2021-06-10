package com.springcore.javaconfig;

public class Student {

	private Samosa samosa;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void stud() {
		// TODO Auto-generated method stub
		samosa.display();
		System.out.println("Hey there");
	}

}
