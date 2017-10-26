import java.lang.*;
import java.io.*;
import java.util.*;


class Book{
    private String title, publisher;
    private int year;
    public Book(String title, String publisher, int year){
      this.title = title;
      this.publisher = publisher;
      this.year = year;
  }
   public String title(){
       return this.title;
   }
   public String publisher(){
       return this.publisher;
   }
   public int year(){
       return this.year;
   }
   public String toString(){
       return(this.title + ", " +this.publisher + ", "+ this.year);
   }
}

class Library{
    private ArrayList<Book> books; 
    public Library(){
        this.books = new ArrayList<Book>();
    }
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    public void printBooks(){
        for(Book book : this.books){
            System.out.println(book);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
     ArrayList<Book> found = new ArrayList<Book>();
     for(Book book : this.books){
            if(StringUtils.included(book.title(),title)) {
             found.add(book);
            }
        }

     return found;
    }
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book book : this.books){
            if(StringUtils.included(book.publisher(), publisher)) {
             found.add(book);
            }
        }
     return found;
    }
    public ArrayList<Book> searchByYear(int year){
    ArrayList<Book> found = new ArrayList<Book>();
     for(Book book : this.books){
            if(book.year() == year){
                found.add(book);
            }
        }
     return found;
    }
}

class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.toLowerCase().contains(searched.toLowerCase().trim())) {
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
     Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        
        for (Book book: Library.searchByTitle("CHEESE")) {
        System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}
  