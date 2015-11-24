package edu.pragmatic.java.advanced.reflection;

//@Target(value=ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//TODO instal full version java
public @interface Table {

	// Показва че ако не е задължителен този метод той трябва да върне нещо и за
	// това се слага default
	String tableName() default "";
}
