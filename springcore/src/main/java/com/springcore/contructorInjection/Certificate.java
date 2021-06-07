package com.springcore.contructorInjection;

public class Certificate {
	private String name;

	public Certificate(String name) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate : " + name;
	}
}
