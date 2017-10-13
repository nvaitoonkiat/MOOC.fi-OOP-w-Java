import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
    
        // change the copied
        copied[0] = 99;
    
        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    static int[] copy(int[] temp){
        int[] temparray = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            temparray[i] = temp[temp.length-1-i];
        }
        return temparray;
    }
}
 
  
