package com.aop.day3;

public class BusBookingCenter {

	public static String bookTheBus(String passengername) {
		return passengername + ", your ticket is booked ";
	}

	public int getSeatNumber(String passengername) {
		return passengername.length();
	}
}
