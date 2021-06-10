package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStructureMap;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeeStructureMap() {
		return feeStructureMap;
	}

	public void setFeeStructureMap(Map<String, Integer> feeStructureMap) {
		this.feeStructureMap = feeStructureMap;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "\nfeeStructureMap=" + feeStructureMap + "]";
	}

}
