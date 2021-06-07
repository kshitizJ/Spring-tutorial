package com.springcore.contructorInjection;

public class Person {
	private int personId;
	private String name;
	private Certificate certi;

	public Person(int personId, String name, Certificate certi) {
		super();
		this.personId = personId;
		this.name = name;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + " { " + this.certi + " }";
	}
}
