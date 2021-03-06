package edu.pragmatic.java.advanced.local;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalDemo {
	public static void main(String[] args) {
		String localName = "MyProperties";

		int price = 20;

		Locale bgLocale = new Locale("bg", "BG");
		ResourceBundle currentBundle = ResourceBundle.getBundle(localName,bgLocale);

		NumberFormat bgFormat = NumberFormat.getCurrencyInstance(bgLocale);

		String string = currentBundle.getString("price.is");
		System.out.println(string+ bgFormat.format(price));

		currentBundle = ResourceBundle.getBundle(localName, Locale.UK);
		NumberFormat ukFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(string+ ukFormat.format(price));
	}
}
