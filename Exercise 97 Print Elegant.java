import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // write code here
        int i=0; 
        while(i<array.length-1){
            System.out.print(array[i]);
            System.out.print(", "); i++;
        }
        System.out.print(array[array.length-1]);
    }
}
 
  
