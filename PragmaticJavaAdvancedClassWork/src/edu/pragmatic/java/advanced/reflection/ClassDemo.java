package edu.pragmatic.java.advanced.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Plaease enter a class name");
			String className = sc.nextLine();

			Class<?> userClass = Class.forName(className);
			Method[] methods = userClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
