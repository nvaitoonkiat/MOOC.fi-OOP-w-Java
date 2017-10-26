import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }   
    
    public static void main(String[] args) {
        // Here you can test binary search
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        int arrMax = howManyTimesHalvable(array.length);
        int lowstack = 0, highstack = array.length-1;
        int mid = array.length/2,searched;
        System.out.println("Low: " + lowstack + " and High: " + highstack + " mid: " + mid);
        Scanner reader = new Scanner(System.in);

        System.out.print("Values of the array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedValue = reader.nextLine();
        searched = Integer.parseInt(searchedValue);
        System.out.println(searched);
        
        for(int i=0; i<arrMax+1; i++){
            System.out.println("Loop # " + i);
            if(array[mid] == searched){
                System.out.println("Found " + searched+ " at Index" + array[mid]);
                break;
            }
            else if(highstack - lowstack < 2 || highstack == lowstack){
                if(array[highstack] == searched){
                    System.out.println("Found " + searched +" at Index" + array[highstack]);
                    break;
                }
                 else if(array[lowstack] == searched){
                    System.out.println("Found " + searched +" at Index" + array[lowstack]);
                     break;
                 }
                else{
                    System.out.println("Not Found");
                    break;
                }
            }
            //higher
            else if(array[mid] < searched){
                lowstack = mid + 1;
                mid = (highstack - lowstack)+ mid;
                System.out.println(lowstack +" " + highstack + " "+ mid);
            }
            // lower
            else if(array[mid] > searched){
                highstack = mid - 1;
                mid = mid - (highstack - lowstack);
                System.out.println(lowstack +" " + highstack + " "+ mid);
            }
        }
        
        //boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        // Print the binary search result here
    }
}
  
  