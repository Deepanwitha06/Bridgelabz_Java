package javaConstructors.level1;
import java.util.Scanner;
/*
     create a class Book
     Attributes: Title,Author,price,Avalability
     Method: Borrow book
 */
class LibraryBook{
    private String title;
    private String author;
    private double price;
    private boolean availability=true;

    public LibraryBook (String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public void borrowBook(){
        if(availability==false){
            System.out.println("The book is not available");
        }else{
            System.out.println("Here is the book");
            availability=false;
        }
    }

    public void returnBook(){
        availability=true;
        System.out.println("Book is returned");
    }
}

public class LibraryBookSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and user input
        System.out.println("Enter book title, Author and price: ");
        String title=input.nextLine();
        String author=input.nextLine();
        double price=input.nextDouble();

        LibraryBook libraryBook=new LibraryBook(title,author,price);
        System.out.println("Option 1: Borrow the book \nOption 2: return the book \nOption 3: Exit");
        int choice;
        do{
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    libraryBook.borrowBook();
                    break;
                case 2:
                    libraryBook.returnBook();
                    break;
            }
        }while(choice!=3);
        System.out.println("Thank you");

        input.close();
    }
}
