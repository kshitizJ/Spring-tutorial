package com.springcore.collections;

import java.util.Set;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employees {
	private String name;
	private List<String> pnum;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties props;

	public Employees(String name, List<String> pnum, Set<String> address, Map<String, String> courses) {
		super();
		this.name = name;
		this.pnum = pnum;
		this.address = address;
		this.courses = courses;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPnum() {
		return pnum;
	}

	public void setPnum(List<String> pnum) {
		this.pnum = pnum;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

}
