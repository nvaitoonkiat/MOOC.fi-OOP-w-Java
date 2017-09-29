import java.lang.*;
import java.io.*;
import java.util.*;
/*
implement class Student that holds the following information about a student:

name (String)
studentNumber (String)
The class should have the following methods:

A constructor that initializes the name and the student number with the given parameters.
getName, that returns the student name
getStudentNumber, that returns the student number
toString, that returns a String representation of the form: Pekka Mikkola (013141590)
*/

public class Student {
    public String name;
    public String studentNumber;
    
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    public String getName(){
        return this.name;
    }
    
    public String getStudentNumber(){
        return this.studentNumber;
    }
    
    public String toString() {
        return this.name + " (" + this.studentNumber + ")";
    }
    
}

    
class Main {
    public static void main(String[] args) {
    String name, studno, searchitem = "z"; 
    int counter=0;
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner input = new Scanner(System.in);
    
    while(input.hasNext()) {
        name = input.nextLine();
        if(name.equals("")) {
            break;
        }
        else{
            studno = input.nextLine();
            list.add(new Student(name,studno));
            continue;
        }
    }
    
    for (Student student : list){
        System.out.println(student);
    }
    System.out.println("Search results for " +searchitem);
    System.out.println("Results:");
    for (Student student : list){
       if (student.name.indexOf(searchitem) == -1){
           continue;
       }
       else {
           counter++;
           System.out.println(counter+"."+student);
       }
    }
    if (counter == 0){
        System.out.println("Search results detected no matching students.");
    }
     /*Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);*/
    }
}