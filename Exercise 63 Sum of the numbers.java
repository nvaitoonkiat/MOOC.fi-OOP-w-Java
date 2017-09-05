import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Method sum, which receives a list of numbers (ArrayList<Integer>) 
    as a parameter and then calculates the sum
    */

public static int sum(ArrayList<Integer> list) {
    int temp=0;
    for(int i=0; i < list.size(); i++){
        temp = temp + list.get(i);
    }
    return temp;
}

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The sum: " + sum(list));

    list.add(10);

    System.out.println("the sum: " + sum(list));
}
   ///////////////////
}   