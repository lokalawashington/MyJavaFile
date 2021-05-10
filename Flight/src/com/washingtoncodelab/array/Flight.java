package com.washingtoncodelab.array;

public class Flight {
    private int pasenger;
   private int seat;

   public Flight(){
       this.pasenger = 1000;
       this.seat = 1800;
   }

   public Flight(int pasenger, int seat){
       this.pasenger = pasenger;
       this.seat = seat;
   }

   public  boolean hasRoom(Flight f2){
       int total = pasenger + f2.pasenger;
       return total <= seat;
   }

   public  Flight createNewWithBoth(Flight f2){
       Flight newFlight = new Flight();
       newFlight.seat = seat;
       newFlight.pasenger = pasenger + f2.pasenger;
       return newFlight;
   }


}
