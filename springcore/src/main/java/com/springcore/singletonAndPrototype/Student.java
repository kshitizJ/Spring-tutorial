package com.springcore.singletonAndPrototype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// if we want a prototype and not a singleton of the object or in simple words if we want our IOC container to return a new instance of an object than we use the @Scope("prototype") annotation

@Component()
@Scope("prototype")
public class Student {
	@Value("Kshitiz Jain")
	private String studentName;
	@Value("Mumbai")
	private String city;

	// if we want to get a list of something than we will use util schema i.e
	// standalone collection in the xml file than in the @Value annotation we will
	// use expression language '#{}' and inside curly brackets we put the id of the
	// list defined in xml file

	@Value("#{temp}")
	private List<String> address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
}
