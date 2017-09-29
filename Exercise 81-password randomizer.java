import java.lang.*;
import java.io.*;
import java.util.*;

public class PasswordRandomizer {
    // Define the variables here
    private int plen;
    private Random random;
    public String symbol = "abcdefghijklmnopqrstuvwxyz";
    
    public PasswordRandomizer(int length) {
        this.plen = length;
        // Format the variable here
    }

    public String createPassword() {
        char charhold;
        String temp = "";
        random = new Random();
        for (int i = 0; i < this.plen; i++){
            charhold =  symbol.charAt(random.nextInt(25));
            temp += charhold;
        }
        return temp;
      // Write the code here which returns the new password
    }
}
    

class Main {
      public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}