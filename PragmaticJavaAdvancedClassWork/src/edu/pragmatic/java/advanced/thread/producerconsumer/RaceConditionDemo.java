package edu.pragmatic.java.advanced.thread.producerconsumer;

public class RaceConditionDemo {

	public static void main(String[] args) {
		Shelf shelf = new Shelf();
		Producer producer = new Producer(shelf);
		Consumer consumer = new Consumer(shelf);
		producer.start();
		consumer.start();
	}

}
