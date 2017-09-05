import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Method greatest, which receives a list of numbers (ArrayList<Integer>) as a
    parameter and then returns the greatest number in the list
    */

public static int greatest(ArrayList<Integer> list) {
    int big=0;
    for (Integer temp : list){
        if (big > temp){
            continue;
        }
        else
        big = temp;
    }
    return big;
}

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("The greatest number is: " + greatest(list));
}
   ///////////////////
}   