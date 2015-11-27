package edu.pragmatic.java.advanced.thread.examples;

public class SimpleThread extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			try {
				this.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			long currentTimeMillis = 0;
			try {
				System.out.println(System.currentTimeMillis());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
