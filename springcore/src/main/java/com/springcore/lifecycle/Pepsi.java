package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public Pepsi() {
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
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// This method will work as init
		System.out.println("Initialization done");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// This method will work as destroy
		System.out.println("Destroy done");
	}

}
