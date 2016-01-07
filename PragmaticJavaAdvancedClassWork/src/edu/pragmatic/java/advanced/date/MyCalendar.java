package edu.pragmatic.java.advanced.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {

	public static void main(String[] args) {
		
		Calendar birhday = new GregorianCalendar(19, 10, 14);
		System.out.println(birhday.get(Calendar.DAY_OF_WEEK));
		

	}

	private String createdDate() {
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy");
		Date today = Calendar.getInstance().getTime();
		String reportDate = df.format(today);
		return reportDate;
	}
}
