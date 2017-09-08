import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    /*
    Check for pailindrome
    */

public static boolean palindrome(String text) {
    int len = text.length();
    int s = len/2;
    for (int i = 0; i < s+1; i++){
        if(text.charAt(i)==text.charAt(len-i-1)){
            continue;
        }
        else{
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Type a text: ");
    String text = reader.nextLine();
    if (palindrome(text)) {
       System.out.println("The text is a palindrome!");
    } else {
       System.out.println("The text is not a palindrome!");
    }
}
    
   ///////////////////
}   