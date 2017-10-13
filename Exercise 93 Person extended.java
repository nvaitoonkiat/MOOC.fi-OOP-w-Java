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

class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public Person(String name){
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), 
        Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    public boolean olderThan(Person compared) {
       return (this.birthday.earlier(compared.birthday));
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        //Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int month,day,year;
        month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        day = Calendar.getInstance().get(Calendar.DATE);
        year=Calendar.getInstance().get(Calendar.YEAR);
        MyDate temp = new MyDate(day,month,year);
        return (this.birthday.differenceInYears(temp));
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
}
class Main {
    public static void main(String[] args) {
        Person peka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  peka.getName() + ": "+ martin.olderThan(peka) );
        System.out.println( peka.getName() + " is older than " +  martin.getName() + ": "+ peka.olderThan(martin) );
    
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println( pekka );
        System.out.println( steve );
    }
}
  
