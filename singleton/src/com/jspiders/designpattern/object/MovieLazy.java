package com.jspiders.designpattern.object;

public class MovieLazy {
     static int noOfTickets;
     static MovieLazy movieLazy;
     private MovieLazy (int noOfTickets) {
    	   this.noOfTickets = noOfTickets;
     }
     public static MovieLazy bookTickets(int noOfBookings) {
    	 if (movieLazy == null) {
			movieLazy = new MovieLazy(100);
		}
    	 System.out.println("Available Tickets : " + noOfTickets );
    	 System.out.println("Bookiing " + noOfBookings + " tickets");
    	 if (noOfBookings > noOfTickets) {
			System.out.println("Tickets not Available");
			return movieLazy;
		}
    	 noOfTickets -= noOfBookings;
    	 System.out.println("Tickets left: " +noOfTickets );
    	 return movieLazy;
     } 
}
