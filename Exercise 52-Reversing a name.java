import java.lang.*;
import java.io.*;
import java.util.*;
class Test{  
    //////////////
public static void rev(String s) {
    int len=s.length();
    char character;
    for (int i = len-1; i>0; i--){
          System.out.print(s.charAt(i));
    }
    System.out.print(s.charAt(0));
}

public static void main(String[] args) {
    String s;
    Scanner sn = new Scanner(System.in); 
    s= "Neil";
    rev(s);
}
   ///////////////////
}   