import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create a program that asks the user to input words, 
    until the user gives an empty string. 
    Then the program prints the words the user gave 
    in reversed order, the last word is printed first etc.
    */

public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>();
    System.out.print("Type in your text: ");
    Scanner in = new Scanner(System.in); 
    while (in.hasNext()) {
        if (in.hasNextLine()){
            words.add(in.nextLine());
        }
        else 
            in.next();
    }
    Collections.reverse(words);
    for (String word : words) {
        System.out.println( word);
    }
}
   ///////////////////
}   