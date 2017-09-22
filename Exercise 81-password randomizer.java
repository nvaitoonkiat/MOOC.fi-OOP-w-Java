import java.lang.*;
import java.io.*;
import java.util.*;

public class PasswordRandomizer {
    // Define the variables here
    private int plen;
    private random = new Random();
    public String temp = "";
    public char symbol = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.plen = length;
        
        this.temp = 
        // Format the variable here
    }

    public String createPassword() {
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