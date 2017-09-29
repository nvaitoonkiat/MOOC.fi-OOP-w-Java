import java.lang.*;
import java.io.*;
import java.util.*;
/*
implement a couple of methods that help in apartment comparisons.
*/

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment apt){
        if (this.squareMeters > apt.squareMeters){
            return true;
        }
        else {
            return false;
        }
    }
    
    public int priceDifference(Apartment apt){
        return (Math.abs(this.squareMeters*this.pricePerSquareMeter - apt.squareMeters*apt.pricePerSquareMeter));
    }
}

    
class Main {
    public static void main(String[] args) {
    Apartment studioManhattan = new Apartment(1, 16, 5500);
    Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
    Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
    
    System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
    System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true
    
    System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
    System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
    }
}