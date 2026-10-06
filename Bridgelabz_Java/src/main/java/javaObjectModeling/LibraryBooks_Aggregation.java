package javaObjectModeling;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/*
      Aggregation
      classes : Library , Book
      Library has books
      Book class : attributes : title , author
                   Methods : display();
      Library class : array list of book objects
 */

class Book{
    private String title;
    private String author;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void display(){
        System.out.println("Book Details: ");
        System.out.println("Book name: "+title+"\nAuthor: "+author);
    }
}

class Library{
    private String name;
    private List<Book> bookList;

    public Library(String name){
        this.name=name;
        bookList=new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void showAddedBooks(){
        System.out.println("\nLibrary : "+name);
        for(Book book:bookList){
            book.display();
            System.out.println();
        }
    }
}

public class LibraryBooks_Aggregation {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variable and take input
        System.out.println("Enter the library name: ");
        String libraryName1=input.nextLine();
        System.out.println("Enter the title, author of book1:");
        String title1=input.nextLine();
        String author1=input.nextLine();
        System.out.println("Enter the title, author of book2:");
        String title2=input.nextLine();
        String author2=input.nextLine();
        System.out.println("Enter another library name: ");
        String libraryName2=input.nextLine();


        //create book class objects
        Book book1=new Book(title1,author1);
        Book book2=new Book(title2,author2);
        Book book3=new Book("harry potter","Jk.rowling");

        Library library1=new Library(libraryName1);
        library1.addBook(book1);
        library1.addBook(book2);
        library1.showAddedBooks();
        Library library2=new Library(libraryName2);
        library2.addBook(book2);
        library2.addBook(book3);
        library2.showAddedBooks();

        input.close();
    }
}
