import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create a program that asks the user for two words. Then the program tells if the second word is included in the first word. Use String method indexOf in your program.
    */
public static void test(String s1, String s2) {
    int index = s1.indexOf(s2);
	if (index == -1){
		System.out.println("Not found");
	else
		System.out.println("Found");
}

public static void main(String[] args) {
    String s1,s2;
    System.out.println("Type 1st word:");
    Scanner sn = new Scanner(System.in); 
    s1= sn.nextLine();
    System.out.println("Type 2nd word:");
    s2= sn.nextLine();
    test(s1,s2);
}
   ///////////////////
}   