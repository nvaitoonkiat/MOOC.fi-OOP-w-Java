import java.lang.*;
import java.io.*;
import java.util.*;

public class Dice {
    public Random random;
    public int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();

    }

    public int roll() {
          // we'll get a random number in the range 1-numberOfSides<
         return random.nextInt(this.numberOfSides)+1;
    }
}
    

class Main {
     public static void main(String[] args) {
        Dice dice = new Dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }
    }
}