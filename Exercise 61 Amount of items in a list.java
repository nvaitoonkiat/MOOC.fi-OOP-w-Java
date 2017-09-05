import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create the method public static int countItems(ArrayList<String> list) 
    that returns the number of the items in the list
    */

public static int print(ArrayList<String> printed) {
    return printed.size();
}

public static void removeFirst(ArrayList<String> list) {
    list.remove(0);  // removes the first item (indexed 0)
}

public static void main(String[] args) {
    ArrayList<String> programmingLanguages = new ArrayList<String>();
    programmingLanguages.add("Pascal");
    programmingLanguages.add("Java");
    programmingLanguages.add("Python");
    programmingLanguages.add("Ruby");
    programmingLanguages.add("C++");

    print(programmingLanguages);
    removeFirst(programmingLanguages);
   System.out.println(print(programmingLanguages));
}
   ///////////////////
}   