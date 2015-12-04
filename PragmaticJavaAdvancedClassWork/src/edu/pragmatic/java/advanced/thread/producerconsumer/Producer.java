package edu.pragmatic.java.advanced.thread.producerconsumer;

public class Producer extends Thread {
	private Shelf shelf;
	private int currentProducerNumber;

	public Producer(Shelf shelf) {
		super("Producer");
		this.shelf = shelf;
	}

	@Override
	public void run() {
		int newNumber = ++currentProducerNumber;
		this.shelf.setNumber(newNumber);
		System.out.println("[" + getName() + "] Just produced " + newNumber);
	}
}
