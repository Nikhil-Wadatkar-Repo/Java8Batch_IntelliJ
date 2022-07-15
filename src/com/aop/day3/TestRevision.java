package com.aop.day3;

public class TestRevision {

	public static void main(String[] args) {
		CentralBusReservationCenter obj = BusBookingCenter::bookTheBus;
		String bookTheTicket = obj.bookTheTicket("pavan");
		System.out.println(bookTheTicket);
		BusBookingCenter busBookingCenterObject = new BusBookingCenter();
		TicketInfo inter1 = busBookingCenterObject::getSeatNumber;
		int ticketNumber = inter1.getTicketNumber("Ankur");
		System.out.println("Ticket no. is " + ticketNumber);

	}

}
