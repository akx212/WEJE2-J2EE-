package com.jspiders.designpattern.object;

public class MovieEager {
   
static int noOftickets;
   
   static MovieEager movieEager = new MovieEager(100);
   
   private  MovieEager(int noOfTickets) {
	   this.noOftickets= noOfTickets;
}
   public static MovieEager bookTickets (int noOfBookings) {
	   
   System.out.println("Available Tickets " + noOftickets);
   System.out.println("Bookings " + noOfBookings + "tickets");
   
   if (noOfBookings > noOftickets) {
	System.out.println("Tickets not Available");
	return movieEager;
}
   noOftickets -= noOfBookings;
   System.out.println("tickets left :" + noOftickets);
   return movieEager;
   }
}
