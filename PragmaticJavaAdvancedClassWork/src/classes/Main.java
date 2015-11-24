package classes;

import java.awt.geom.Ellipse2D;

import classes.org.gochev.example5.Ha;

public class Main {
	public static void main(String[] args) {
		Ha a;

		Student s = new Student();
		GotinStudent gs = new GotinStudent();

		s.talk();
		gs.talk();

		Student lud = new GotinStudent();
		lud.talk();

		System.out.println("BAM BAM BAM POLYMORPHISM");
		doSomethingWithStudent(new Student());
		doSomethingWithStudent(new GotinStudent());
		
		otherMethod((Student)lud);
		
		Ha ha = new Ha();
		ha.age = 120;
		Ha.Inner innerInstance = ha.new Inner();
		innerInstance.doSometing();
		
		Ha.StaticInner staticInstance = new Ha.StaticInner();
		
		class Pesho {
			boolean isHeCool = false;
		}
		Pesho p = new Pesho();
	}

	public static void otherMethod(GotinStudent s) {

	}
	

	public static void otherMethod(Student s) {

	}

	public static void doSomethingWithStudent(Student s) {
		if (s instanceof GotinStudent) {
			((GotinStudent) s).sing();
		}
		s.talk();
	}

}
