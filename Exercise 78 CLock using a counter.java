import java.lang.*;
import java.io.*;
import java.util.*;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value=0;
    }

    public void next() {
        if (this.value == upperLimit || this.value > upperLimit){
            this.value = 0;
        }
        else{
            this.value++;
        }
    }

    public String toString() {
        if (this.value < 10){
           return ("0" + value); 
        }
        return ("" + value);
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int temp) {
        this.value = temp;
    }
}
    

class Main {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();
        System.out.println(s);
        System.out.print("minutes: ");
        int m = reader.nextInt();// read the initial value of minutes from the user
        System.out.println(m);
        System.out.print("hours: ");
        int h = reader.nextInt();// read the initial value of hours from the user
        System.out.println(h);
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);


        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);   // the current time printed
            if (minutes.getValue() > 58 && seconds.getValue() > 58){
                hours.next();
            }
            if (seconds.getValue() > 58){
                minutes.next();
            }
            seconds.next();
            // if minutes become zero, advance hours
            i++;
        }
    }
}