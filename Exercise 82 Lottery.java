import java.lang.*;
import java.io.*;
import java.util.*;
/*
Your assignment is to expand the class LotteryNumbers, which draws the lottery numbers of the week. The numbers of the week consist of 7 different numbers between 1 and 39. The class has the following functionality:

the constructor LotteryNumbers creates a new LotteryNumbers object, which contains the new drawn numbers
the method numbers returns the drawn numbers of this draw
the method drawNumbers draws new numbers
the method containsNumber reveals if the number is among the drawn numbers
*/

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        int temp=random.nextInt(39);
        for (int i = 0; i < 7; i++){
            while (containsNumber(temp)){
                temp = random.nextInt(39);
            }
            this.numbers.add(temp);
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        int temp = number;
        if (this.numbers.contains(temp)){
            return true;
        }
        else 
        return false;
    }
}
    

class Main {
      public static void main(String[] args) {
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}