package com.washingtoncodelab.array;

public class Main {

    public static void main(String[] args) {
        Flight lax1 = new Flight(200,800);
        Flight lax2 = new Flight(100,190);

        //add passengers to both flights
        Flight lax3 = new Flight(0,1000);
        if (lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);
        System.out.println(lax3);

    }
}
