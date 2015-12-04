package edu.pragmatic.java.advanced.thread.producerconsumer;

public class Shelf {
	private int number;

	public synchronized int getNumber() {
		if (number == 0) {
			try {
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		synchronized (this) {
			
			notifyAll();
		}
	}


}
