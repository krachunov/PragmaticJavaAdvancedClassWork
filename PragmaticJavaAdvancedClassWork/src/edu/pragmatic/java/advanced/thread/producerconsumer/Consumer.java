package edu.pragmatic.java.advanced.thread.producerconsumer;

public class Consumer extends Thread {
	private Shelf shelf;

	public Consumer(Shelf shelf) {
		super("Consmer");
		this.shelf = shelf;
	}

	@Override
	public void run() {

		int number = shelf.getNumber();
		System.out.println("[" + getName() + "] get " + number);
	}
}
