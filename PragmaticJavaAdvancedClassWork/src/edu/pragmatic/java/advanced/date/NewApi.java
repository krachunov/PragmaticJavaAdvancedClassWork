package edu.pragmatic.java.advanced.date;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class NewApi {

	public static void main(String[] args) {
		// new
		DayOfWeek birthday = LocalDate.of(1985, 11, 14).getDayOfWeek();
		System.out.println(birthday);

		// old
		Calendar birhday = new GregorianCalendar(19, 10, 14);
		System.out.println(birhday.get(Calendar.DAY_OF_WEEK));

	}

}
