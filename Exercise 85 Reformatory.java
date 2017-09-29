import java.lang.*;
import java.io.*;
import java.util.*;
/*
In this assignment, we use the already given class Person and are
supposed to build a new class Reformatory. Reformatory objects do certain
things to persons, e.g. measure their weight and feed them.
*/

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

     public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    
    public Person(String name, int age, int weight, int height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean adult(){
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }

    public double weightIndex(){
        double heightInMeters = this.height/100.0;

        return this.weight / (heightInMeters*heightInMeters);
    }

    public String toString(){
        return (this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex());
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
}

class Reformatory {
    private int total = 0;
    public int weight(Person person) {
       // returns the weight of the parameter
       this.total++;
       return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
     public int totalWeightsMeasured(){
         return this.total;
     }
}
    
    
class Main {
    public static void main(String[] args) {
    Reformatory eastHelsinkiReformatory = new Reformatory();

    Person brian = new Person("Brian", 1, 110, 7);
    Person pekka = new Person("Pekka", 33, 176, 85);

     System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(pekka);

    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);
    eastHelsinkiReformatory.weight(brian);

    System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());
    }
}