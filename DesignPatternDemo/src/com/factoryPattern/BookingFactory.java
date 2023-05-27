package com.factoryPattern;

public class BookingFactory {

	public static Booking getBookingInstance(String input) {
		if(input.equalsIgnoreCase("first"))
			return new Ac1Tier();
		else if (input.equalsIgnoreCase("second")) {
			return new Ac2Tier();
		}else if (input.equalsIgnoreCase("third")) {
			return new Ac3Tier();
		}else {
			return (Booking) new IllegalArgumentException();
		}
	}
	
}
