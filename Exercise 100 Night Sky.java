import java.lang.*;
import java.io.*;
import java.util.*;


class NightSky{
    private double density;
    private int width, height;
    private Random rand;
    private int starsInLastPrint = 0;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    public NightSky(int width, int height){
        this.density = .1;
        this.width = width;
        this.height = height;
    }
    public NightSky(double density, int width, int height){
        this.width = width;
        this.height = height;
        this.density = density;
    }
    public void printLine(){
        for(int i=0; i < this.width; i++){
            rand = new Random();
            if (rand.nextInt(100)<this.density*100){
                System.out.print("*");
                this.starsInLastPrint++;
            }
            else    System.out.print(" ");
        }
    }
    public void print(){
        this.starsInLastPrint = 0;
        for(int i = 0; i<this.height; i++){
            printLine();
            System.out.println("");
        }
    }
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}

public class Main {
    public static void main(String[] args) {
       NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");
        
        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
 }
}
  