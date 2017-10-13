import java.lang.*;
import java.io.*;
import java.util.*;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    public void advance(){
        if(this.day == 30){
            this.day = 1;
            if(this.month==12){
                this.month=1;
                this.year++;
            }
            else{
                this.month++;
            }
        }
        else this.day = this.day+1;
    }
    public void advance(int numberOfDays){
        for(int i=0; i<numberOfDays; i++){
            advance();
        }
    }
    public MyDate afterNumberOfDays(int days){
    MyDate newMyDate = new MyDate(this.day,this.month,this.year);
    newMyDate.advance(days);
    return newMyDate;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }
    public int differenceInYears (MyDate comparedDate){
        boolean comp = true;
        if(this.year > comparedDate.year){
            if(this.month == comparedDate.month){
                if(this.day > comparedDate.day){
                    return (Math.abs(this.year-comparedDate.year));
                }
                else {
                    return (Math.abs(this.year-comparedDate.year)-1);
                }
            }
            if(this.month > comparedDate.month){
                return (Math.abs(this.year-comparedDate.year));
            }
            else{
                return (Math.abs(this.year-comparedDate.year)-1);
            }
        }
        else{
            if(this.month == comparedDate.month){
                if(this.day < comparedDate.day){
                    return (Math.abs(this.year-comparedDate.year));
                }
                else {
                    return (Math.abs(this.year-comparedDate.year)-1);
                }
            }
            if(this.month < comparedDate.month){
                return (Math.abs(this.year-comparedDate.year));
            }
            else{
                return (Math.abs(this.year-comparedDate.year)-1);
            }
        }
    }
}
class Main{
   public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );
    }
}  
