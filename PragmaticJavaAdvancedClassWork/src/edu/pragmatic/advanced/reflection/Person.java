package edu.pragmatic.advanced.reflection;

public class Person {
	private String name;
	private int age;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
