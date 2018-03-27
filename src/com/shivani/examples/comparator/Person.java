package com.shivani.examples.comparator;

public class Person {
	int age;
	String firstName;
	String lastname;

	public Person(int age, String firstName, String lastname) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", firstName=" + firstName + ", lastname=" + lastname + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
