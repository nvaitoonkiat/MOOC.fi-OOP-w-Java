import java.lang.*;
import java.io.*;
import java.util.*;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
     return euros;
    }

    public int cents(){
      return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
     public Money plus(Money added){
         return (new Money(this.euros + added.euros, this.cents + added.cents));
     }
     public boolean less(Money compared){
         if(this.euros*100+this.cents > compared.euros*100+compared.cents){
             return false;
         }
         else return true;
     }
     
}
  
class Main {
    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);
        
        Money c = a.plus(b);
        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true
        
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        
        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
                                //           is assigned to variable a.
                                //       The Money object 10.00e that variable a used to hold
                                //           is not referenced anymore
        
        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        c = c.minus(a); 
        System.out.println(c);  // 0.00e
    }
}
  
