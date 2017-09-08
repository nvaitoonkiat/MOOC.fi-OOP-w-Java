import java.lang.*;
import java.io.*;
import java.util.*;

public class Multiplier{
    private int multiplicand;
    
    public Multiplier(int number){
        this.multiplicand=number;
    }
    public int multiply(int otherNumber){
        return this.multiplicand * otherNumber;
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
    Multiplier threeMultiplier = new Multiplier(3);
System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

Multiplier fourMultiplier = new Multiplier(4);
System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
}
    
   ///////////////////
}   