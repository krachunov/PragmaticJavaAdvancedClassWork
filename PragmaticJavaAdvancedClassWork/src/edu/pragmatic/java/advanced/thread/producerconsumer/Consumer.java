package edu.pragmatic.java.advanced.thread.producerconsumer;

public class Consumer extends Thread {
	private Shelf shelf;

	public Consumer(Shelf shelf) {
		super("Consmer");
		this.shelf = shelf;
	}

	@Override
	public void run() {
		if (shelf.getNumber() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int number = shelf.getNumber();
		System.out.println("[" + getName() + "] get " + number);
	}
}
