package edu.pragmatic.java.advanced.reflection;

import java.beans.FeatureDescriptor;
import java.lang.reflect.Field;

public class ArrayDemo {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("My name is Goshko");

		Class<? extends StringBuilder> stringBuilder = name.getClass();
		int length = name.length();
		System.out.printf("%s length is %d \n", name, name.length());
		try {
			Field count = stringBuilder.getSuperclass().getDeclaredField("count");
			count.setAccessible(true);
			count.setInt(name, 10);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.printf("%s length is %d \n", name, name.length());

		// char[] allLaters = name.toCharArray();
		// int l = allLaters.length;
		// System.out.println(name);
		//
		// // Class<? extends char[]> ourArray = allLaters.getClass();
		// Class<? extends String> class1 = name.getClass();
		// class1.getF
		// try {
		// // Field lengthField = ourArray.getField("length");
		// // lengthField.setInt(allLaters, l + 5);
		// } catch (SecurityException
		// | IllegalArgumentException e) {
		// e.printStackTrace();
		// }
		// // for (char c : allLaters) {
		// // System.out.print(c);
		// // }

	}
}
