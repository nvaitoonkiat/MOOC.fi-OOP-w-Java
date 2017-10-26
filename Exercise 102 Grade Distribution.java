import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static String[] arr = {"","","","","",""};
    public static int sum = 0; 
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    doSomething(scanner);
    System.out.println("Grade Distribution:");
    for(int i = arr.length-1; i>0; i--){
        System.out.println(i + ": " + arr[i]);
    }
    System.out.println("Average is " + sum/arr.length);
    }

    public static void doSomething(Scanner scanner) {
        int temp = Integer.parseInt(scanner.nextLine()); 
        int i = 0; 
        while(temp!=-1){
            if(temp>0 && temp <= 29){
                arr[0] = arr[0] +"*";
            }
            if(temp>=30 && temp <= 34){
               arr[1] = arr[1] +"*";
            }
            if(temp>=35 && temp <= 39){
               arr[2] = arr[2] +"*";
            }
            if(temp>=40 && temp <= 45){
                arr[3] = arr[3] +"*";
            }
            if(temp>=45 && temp <= 49){
                arr[4] = arr[4] +"*";
            }
            if(temp>=50 && temp <= 60){
                arr[5] = arr[5] +"*";
            }
            sum = sum + temp;
            temp = Integer.parseInt(scanner.nextLine()); 
        }
    }
  
}
  