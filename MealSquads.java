import java.lang.*;
import java.io.*;
import java.util.*;

class MealSquads {
    /////////////////////// Change Names and # of Breakfasts, Lunch, Dinners/////////////////////
    public static List<String> names = Arrays.asList("YMJ", "Neil", "Dev", "Ravi", "Paul",
    "Aqib", "Saad", "Jenn", "Emily", "Hasan","Lisa","Larry","Tiff");
    public static int numberOfBreakfasts=2;
    public static int numberOfLunches=2;
    public static int numberOfDinners=2;
    ///////////////////////////////Do not touch below this line/////////////////////////////////////
    
    public static int peopleNeeded = numberOfDinners*5+numberOfLunches*5
    + numberOfBreakfasts*5, counter=0, maxed=names.size();
    public String name; 
    public static List<String> list = new ArrayList<String>();

    public MealSquads(String name){
        this.name = name;
    }
    public void addList(){
        this.list.addAll(names);
        Collections.shuffle(list);
    }
    
    public void setMealSquads(){
        for (int i = 0; i < this.numberOfBreakfasts; i++){
            System.out.println("Breakfast Squad " + (i+1) + ":\t" +"Breakfast Clean Up " + (i+1)+ ":");
            squadSelect(); 
            cleanSelect();
        }
        for (int i = 0; i < this.numberOfLunches; i++){
            System.out.println("Lunch Squad " + (i+1) + ":" + "\t\t" + "Lunch Clean Up " + (i+1) + ":");
            squadSelect();
            cleanSelect();
        }
        for (int i = 0; i < this.numberOfDinners; i++){
            System.out.println("Dinner Squad " + (i+1) + ":" + "\t\t" +"Dinner Clean Up " + (i+1) + ":");
            squadSelect();
            cleanSelect();
        }
    }
    public void squadSelect() {
        for (int i = 0; i<3; i++){
            if (this.list.isEmpty()){
                addList();
                System.out.print(this.list.remove(0) + " ");
            }
            else{
                System.out.print(this.list.remove(0) + " ");
            }
        }
        //System.out.print("              ");
    }
    public void cleanSelect() {
        String temp= "";
        System.out.printf("%10s ",temp);
        for (int i = 0; i<2; i++){
            if (this.list.isEmpty()){
                addList(); 
                System.out.print(this.list.remove(0) + " ");
            }
            else{
                System.out.print(this.list.remove(0) + " ");
            }
        }
        System.out.println("");System.out.println("");
    }
    public String toString() {
        return this.name;
    }
    
}

class Main{  

    public static void main(String[] args) {
       MealSquads trip = new MealSquads("Pittsfield");
       trip.setMealSquads();
    }
}   