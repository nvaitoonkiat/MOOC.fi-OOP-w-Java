import java.lang.*;
import java.io.*;
import java.util.*;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return ("This card has " + this.balance + " euros" );
    }
    public void payEconomical() {
     if (this.balance < 2.5){
           
        }
        else{
        this.balance = this.balance - 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance < 4){
            
        }
        else{
        this.balance = this.balance - 4.0;
        }
    }
    public void loadMoney(double amount) {
        this.balance=this.balance+amount;
    }
}

class Main{  
    /*
    Implement the class Multiplier that has:
a constructor public Multiplier(int number).
a method public int multiply(int otherNumber) that returns otherNumber 
multiplied by number (i.e., the constructor parameter).
    */


public static void main(String[] args) {
    LyyraCard card = new LyyraCard(5);
        System.out.println(card);

        card.payGourmet();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
         card.loadMoney(200);
        System.out.println(card);
}  
   ///////////////////
}   
