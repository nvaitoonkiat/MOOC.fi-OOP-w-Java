import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        // write code here
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
  
  
