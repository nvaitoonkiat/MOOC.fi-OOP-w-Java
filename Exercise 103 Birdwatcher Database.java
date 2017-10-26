import java.lang.*;
import java.io.*;
import java.util.*;

class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.toLowerCase().contains(searched.toLowerCase().trim())) {
            return true;
        } else {
            return false;
        }
    }
}

class Bird{
    private String name, latinName;
    private int observation;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    public void addName(Scanner scanner){
        String said = scanner.nextLine();
        this.name = said;
        said = scanner.nextLine();
        this.latinName = said; 
    }
    public String getName(){
        return this.name;
    }
    public int getObv(){
        return this.observation;
    }
    public void addObservation(){
        this.observation++;
    }
    public String toString() {
        return this.name +"( "+ this.latinName + " ) " + this.observation;
    }
}
class Library{
    private ArrayList<Bird> birds; 
    public Library(){
        this.birds = new ArrayList<Bird>();
    }
    public void addBird(Bird newBird){
        this.birds.add(newBird);
    }
    public void printBirds(){
        for(Bird bird : this.birds){
            System.out.println(bird);
        }
    }
    public int observation(String temp){
        ArrayList<Bird> found = new ArrayList<Bird>();
        int count = 0;
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), temp)) {
             bird.addObservation();
             count = 1; 
             break;
            }
        }
        if(count == 0){
                System.out.println("This is not a Bird!");
                return 0;
            }
            else{
                return 0;
            }
        
    }
    public int show(String temp){
        ArrayList<Bird> found = new ArrayList<Bird>();
        int count = 0; 
        for(Bird bird : this.birds){
            if(StringUtils.included(bird.getName(), temp)) {
                 System.out.println(bird);
                 count++;
                 break;
            }
        }
       if(count == 0){
                System.out.println("This is not a Bird!");
                return 0;
            }
            else{
                return 0;
            }
    }
}
public class Main {
    public static void main(String[] args) {
        Library Library = new Library();
        String said, temp; 
        Scanner scanner = new Scanner(System.in);
        while (true){
            said = scanner.nextLine();
            System.out.println("start " + said);
            if(said.equals("Add")){
                System.out.println("adding");
                said = scanner.nextLine();
                temp = scanner.nextLine();
                Library.addBird(new Bird(said,temp));

            }
            else if(said.equals("Quit")){
                break;
            }
            else if(said.equals("Observation")){
                 System.out.println("observing");
                temp = scanner.nextLine();
                Library.observation(temp);
            }
            else if(said.equals("Statistics")){
                System.out.println("Stats");
                Library.printBirds();
            }
            else if(said.equals("Show")){
                System.out.println("Showing");
                temp = scanner.nextLine();
                Library.show(temp);
            }
            else
            {
                continue;
            }
        }
    /////////
    }
   
}
  