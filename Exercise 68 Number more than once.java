import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create the method moreThanOnce that gets a list of integers and an 
    integer (i.e. number) as parameter. If the number 
    appears on the list more than once the method returns true and otherwise false.
    */

public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
    int count = 0;
    for (Integer temp : list){
        if (temp == number){
            count++;
        }
        else{}
    }
    if (count>1){
        return true;
    }
    else
    return false;
}

public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(2);

    System.out.println("Type a number: ");
    int number = Integer.parseInt(reader.nextLine());
    if (moreThanOnce(list, number)) {
        System.out.println(number + " appears more than once.");
    } else {
        System.out.println(number + " does not appear more than once.");
    }
}
   ///////////////////
}   