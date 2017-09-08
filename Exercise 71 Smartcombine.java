import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Combine arraylist2 into 1 except that numbers can be on the list only once
    */

public static void smartcombine(ArrayList<Integer> first, ArrayList<Integer> second) {
    for (int elem : second){
        if (first.contains(elem)){
            continue;
        }
        else{
            first.add(elem);
        }
    }
}

public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<Integer>();

list1.add(4);
list1.add(3);

list2.add(3);
list2.add(10);
list2.add(7);

smartcombine(list1, list2);

System.out.println(list1); // prints [4, 3, 5, 10, 7]

System.out.println(list2); // prints [5, 10, 7]
}
    
   ///////////////////
}   