package edu.pragmatic.java.advanced.reflection;

public class DataBaseDemo {

	public static void main(String[] args) {

		Person georg = new Person("George");

		Class<? extends Person> person = georg.getClass();
		Table tableAnnotation = person.getAnnotation(Table.class);
		String tablename = tableAnnotation.tableName();
		System.out.println("Table for class Person is  " + tablename);
	}

}
