package com.factoryPattern;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ticket class you want to book");
		String inputString = scanner.next();
		Booking booking=BookingFactory.getBookingInstance(inputString);
		System.out.println(booking.getAvailiability());
	}
}
