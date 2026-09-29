package javaClassAndObject.level1;
import java.util.Scanner;
/*
     create a class to display boom details
 */
class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        this.title=title;
    }

    public Book(String author,double price){
        this.author=author;
        this.price=price;
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}

public class BookMain{
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create variables and take input
        System.out.println ("Enter the title,author and price of book: ");
        String title = input.nextLine();
        String author = input.nextLine();
        double price = input.nextDouble();

        //create Book class object
        Book book = new Book(author, price);
        book.setTitle(title);
        System.out.println("Book Details: ");
        System.out.println("Title: "+book.getTitle());
        System.out.println("Author: "+book.getAuthor());
        System.out.println("Price: "+book.getPrice());

        input.close();
    }

}

