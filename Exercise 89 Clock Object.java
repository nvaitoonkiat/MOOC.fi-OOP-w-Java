import java.lang.*;
import java.io.*;
import java.util.*;

class BoundedCounter {
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
public class Clock {
    private BoundedCounter hours= new BoundedCounter(23);
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds= new BoundedCounter(59);

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        seconds.setValue(secondsAtBeginning);
        minutes.setValue(minutesAtBeginning); 
        hours.setValue(hoursAtBeginning); 
    }

    public void tick(){
        if(seconds.getValue() == 59){
            seconds.setValue(0);
            if(minutes.getValue() == 59){
                minutes.setValue(0);
                if(hours.getValue() == 23){hours.setValue(0);}
                else{hours.setValue(hours.getValue()+1);}
            }
             else{   
                 minutes.setValue(minutes.getValue()+1);
            }
        }
        else{
            seconds.setValue(seconds.getValue()+1);
        }
    }

    public String toString() {
        return (hours.toString() + ":" + minutes.toString() + ":" + seconds.toString());
    }
}

class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);
        int i = 0;
        while( i < 20) {
            System.out.println( clock );
            clock.tick();
            i++;
        }
    }
}