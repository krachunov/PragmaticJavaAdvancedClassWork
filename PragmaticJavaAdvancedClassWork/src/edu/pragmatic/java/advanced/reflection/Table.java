package edu.pragmatic.java.advanced.reflection;

//@Target(value=ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//TODO instal full version java
public @interface Table {

	// ������� �� ��� �� � ������������ ���� ����� ��� ������ �� ����� ���� � ��
	// ���� �� ����� default
	String tableName() default "";
}
