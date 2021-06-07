package com.springcore.autoWire.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	// passing the bean name in the qualifier so that our xml file inject that bean
	// in the Address object
	@Autowired
	@Qualifier("address2")
	private Address address;

	// you can also put @Autowire here to call the construtor for setting the value
	// of the Address
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	// you can also put @Autowire here to call the setter method
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
