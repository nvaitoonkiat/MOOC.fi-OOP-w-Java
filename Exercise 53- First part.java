import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create a program that prints the first part of a word. 
    The program asks the user for the word and the length of the first part.
    Use the substring method in your program.
    */
public static void test(String s, int i) {
    System.out.println(s.substring(0,i));
}

public static void main(String[] args) {
    String s;
    System.out.println("Type a word:");
    Scanner sn = new Scanner(System.in); 
    s= sn.nextLine();
    System.out.println("Your word: "+ s);
    System.out.println("Type a #:");
    sn.nextLine();
    int i= sn.nextInt();
    System.out.println("Your #: "+ i);
    test(s,i);
}
   ///////////////////
}   