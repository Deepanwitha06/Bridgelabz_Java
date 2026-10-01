package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Book
      Attributes: libraryName            (static)
                  title, author             (instance)
                  isbn              (final instance)
      Methods:   displayLibraryName()   - static
      Constructor -  initialize title, author, isbn
 */
class Book{
    private static String libraryName="Universe";
    private String title;
    private String author;
    private final String isbn;

    //constructor to initialize title, author, isbn
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    //static method
    public static void displayLibraryName(){
        System.out.println("The Library Name: "+libraryName);
    }

    public void display(){
        System.out.println("Book details: ");
        System.out.println("Title : "+title+"\nAuthor : "+author+"\nISBN : "+isbn);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the title, author and isbn of the book : ");
        String title=input.nextLine();
        String author=input.nextLine();
        String isbn=input.nextLine();

        //craete class object
        Book book=new Book(title,author,isbn);
        Book.displayLibraryName();
        if(book instanceof Book){
            book.display();
        }

        input.close();
    }
}
