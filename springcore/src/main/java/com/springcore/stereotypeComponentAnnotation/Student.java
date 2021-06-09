package com.springcore.stereotypeComponentAnnotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// if we want keep the name as student then we will use only @Component annotation
//@Component

// if we want to change the name of our object or explicitly name our object then we will give a parameter to the @Component
@Component("ob")
public class Student {
	@Value("Kshitiz Jain")
	private String studentName;
	@Value("Mumbai")
	private String city;

	// if we want to get a list of something than we will use util schema i.e standalone collection in the xml
	// file than in the @Value annotation we will use expression language '#{}' and
	// inside curly brackets we put the id of the list defined in xml file
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
