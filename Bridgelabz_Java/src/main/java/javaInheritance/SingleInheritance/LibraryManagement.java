package javaInheritance.SingleInheritance;
import java.util.Scanner;
/*
       superclass: Book
                  Attributes: title,publictionYear
                  Methods: displayInfo()
        subclass: Author
                  Attributes: name,bio
 */

class Book{
    protected String title;
    protected long publicationYear;

    public Book(String title, long publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void displayInfo(){
        System.out.println("Book details: ");
        System.out.println("Title: "+title+"\nPublication year: "+publicationYear);
    }
}

class Author extends Book{
    String name;
    String bio;

    public Author(String title,long publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author name: "+name+"\nBio: "+bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the book tittle,publication year,author name and bio: ");
        String title=input.nextLine();
        long publicationYear=input.nextLong();
        input.nextLine();
        String name=input.nextLine();
        String bio=input.nextLine();

        Book author=new Author(title,publicationYear,name,bio);
        author.displayInfo();

        input.close();
    }
}
