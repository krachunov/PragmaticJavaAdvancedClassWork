package edu.pragmatic.java.advanced.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class BreakingupIncapsulation {
	public static void main(String[] args) {
		Person maria = new Person("Maria");
		System.out.println("Before magic name is: " + maria);

		Class<Person> person = Person.class;
		try {
			Method setter = person.getDeclaredMethod("setName", String.class);
			setter.setAccessible(true);
			setter.invoke(maria, "Pesho");
			setter.setAccessible(false);

			Field age = person.getDeclaredField("age");
			age.setAccessible(true);
			age.set(maria, 18);
			age.setAccessible(false);
			

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		System.out.println("After magic name is: " + maria);
	}
}
