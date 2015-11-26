package edu.pragmatic.java.advanced.thread.examples;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static final long ONE_WEEK = 7 * 24 * 60 * 60 * 1000L;
	private static final long START_NOW = 0L;

	public static void main(String[] args) {
		Timer time = new Timer();
		TimerTask calendar = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Go out and party");
			}
		};
		time.schedule(calendar, START_NOW, 10000);
	}
}
