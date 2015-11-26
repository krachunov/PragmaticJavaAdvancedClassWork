package edu.pragmatic.java.advanced.thread.examples;

public class ThreadDemo {
	public static void main(String[] args) {
		SimpleThread thread = new SimpleThread();

//		 System.out.println("hello word from "+
//		 Thread.currentThread().getName());

		// thread.run(); ака не се извиква тред
	

		thread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello from other guy");
		}
		thread.interrupt();
	
			// System.out.println("Hello again from "
			// + Thread.currentThread().getName());
		
	}
}
