package com.springcore.springExpLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+66}")
	private int x;

	@Value("#{8>6?55:66}") // ternary operator
	private int y;

	// to pass the static method and get the value in z variable
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;

	// to create a new object and set the value of the object to the variable
	@Value("#{ new java.lang.String('Kshitiz Jain') }")
	private String name;

	// to pass boolean value in the isActive variable you have to write in
	// expression inside the @Value such that is resolves the value and returns the
	// true or false answer i.e you have to set a condition
	@Value("#{9<3}")
	private boolean isActive;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

}
