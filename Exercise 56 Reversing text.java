import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Create the method reverse that puts the given
    string in reversed order. 
    */
public static String reverse(String text) {
    int len = text.length();
    String temp="";
    for (int i = len; i>0; i--){
        temp += text.substring(i-1,i);
    }
    return temp;
}

public static void main(String[] args) {
    System.out.print("Type in your text: ");
    Scanner reader = new Scanner(System.in);
    String text = reader.nextLine();
    System.out.println("In reverse order: " + reverse(text));
}
   ///////////////////
}   