package javaConstructorsAndAccesModifiers.AccessModifiers;
import java.util.Scanner;
/*
       Goal : demonstrate access modifiers
       create,
       Class : Book
       Subclass : Ebook  ( acces ISBN and title)
       Attributes: ISBN (public)
                   title (protected)
                   author (private)
       Methods: set and get author name
 */

class Book{
    public String ISBN;
    protected String title;
    private String author;

    public Book(String title){
        this.title=title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void fromClassDisplay(){
        System.out.println("\nAccess from class : All variables");
        System.out.println("Book details:");
        System.out.println("ISBN : "+ISBN+"\nTitle : "+title+"\nAuthor : "+author);
    }
}

//subclass
class EBook extends Book{

    public EBook(String title){
        super(title);
    }

    public void fromSubclassDisplay(){
        System.out.println("\nAccess from sub class: public , protected"+"\nFor private : no direct access use getter to display private variable");
        System.out.println("Book details:");
        System.out.println("ISBN : "+ISBN+"\nTitle : "+title+"\nAuthor : "+getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the ISBN,title and author of the book: ");
        String ISBN=input.nextLine();
        String title=input.nextLine();
        String author=input.nextLine();

        EBook eBook=new EBook(title);
        eBook.setAuthor(author);
        eBook.ISBN=ISBN;

        //class method
        eBook.fromClassDisplay();
        //sub class method
        eBook.fromSubclassDisplay();

        System.out.println("\nAccess from other classes: only public "+"For private : getter, no direct acces\nFor protected:");
        System.out.println("Book details: ");
        System.out.println("ISBN : "+eBook.ISBN);

        input.close();
    }
}
