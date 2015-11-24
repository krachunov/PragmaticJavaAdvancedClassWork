package edu.pragmatic.java.advanced.reflection;

//@Deprecated
@Table(tableName="Prson table")
public class Person {
	private String name;
	private Integer age;

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

	@Override
	public String toString() {
		return String.format("Name= %s \nAge= %d", name, age);
	}
}
