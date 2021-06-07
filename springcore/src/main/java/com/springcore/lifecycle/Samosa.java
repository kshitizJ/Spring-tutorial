package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public Samosa() {
		// TODO Auto-generated constructor stub
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void init() {
		System.out.println("Init method");
	}

	public void destroy() {
		System.out.println("Destroy method");
	}

}
