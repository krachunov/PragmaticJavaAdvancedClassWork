package edu.pragmatic.java.advanced.reflection;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IntrospectionDemo {
	public static void main(String[] args) {
		Person maria = new Person("Maria");
		try {
			BeanInfo person = Introspector.getBeanInfo(Person.class);
			PropertyDescriptor[] propertyDescriptors = person
					.getPropertyDescriptors();
			for (PropertyDescriptor property : propertyDescriptors) {
				if (property.getName().equals("name")) {
					Method getter = property.getReadMethod();
					Object personName = getter.invoke(maria);
					System.out.println(personName);
				}
				System.out.println(property);
			}

		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
