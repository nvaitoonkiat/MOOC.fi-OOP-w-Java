import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        int counter;
        for(int i = 0; i < array.length; i++){
            counter = array[i];
            while(counter > 0){
                System.out.print("*");
                counter--;
            }
            System.out.println("");
        }
    }
}
  