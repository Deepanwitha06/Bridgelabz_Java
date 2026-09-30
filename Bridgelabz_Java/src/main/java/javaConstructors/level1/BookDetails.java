package javaConstructors.level1;
import java.util.Scanner;
/*
   create a class Book
   Attributes : Title, Author,Price
   default and parameterized constructors
 */
class Book{
    private String title;
    private String author;
    private double price;

    //default constructor
    public Book(){
        title="Panchatantra Stories";
        author="k.viswnath";
        price=500;
    }

    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void display(){
        System.out.println("Book details :");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price+"\n");
    }
}

public class BookDetails {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);


        System.out.println("Enter the book title ,author and price: ");
        String title=input.nextLine();
        String author=input.nextLine();
        double price=input.nextDouble();

        //create class object
        Book book1=new Book();
        Book book2=new Book(title,author,price);

        book1.display();
        book2.display();

        input.close();
    }
}
