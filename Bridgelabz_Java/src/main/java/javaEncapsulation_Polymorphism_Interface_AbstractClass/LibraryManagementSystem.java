package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Reservable
                Methods: reserveItem(), checkAvailability()

    Abstract Class : LibraryItem
                     Attributes: itemId, title, author, borrowerName
                     Methods: getLoanDuration(), getItemDetails()
                     Implements the Reservable interface

    Subclasses : Book, Magazine, DVD

*/
import java.util.ArrayList;
import java.util.List;

// Interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem implements Reservable {
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean available;

    // Constructor
    public LibraryItem(int itemId,String title,String author) {
        this.itemId=itemId;
        this.title=title;
        this.author=author;
        this.borrowerName=null;
        this.available=true;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        if(itemId>0) {
            this.itemId=itemId;
        } else {
            System.out.println("Invalid item ID.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author=author;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public boolean getAvailable() {
        return available;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Implementing Reservable interface
    @Override
    public void reserveItem(String borrowerName) {
        if(!checkAvailability()) {
            System.out.println("Item is already reserved.");
        } else {
            this.borrowerName=borrowerName;
            this.available=false;
            System.out.println("Item reserved successfully for "+borrowerName+".");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }

    // Return item
    public void returnItem() {
        if(!available) {
            borrowerName=null;
            available=true;
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item is already available.");
        }
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: "+itemId+"\nTitle: "+title+"\nAuthor: "+author+"\nLoan Duration: "+getLoanDuration()+" days"+"\nAvailability: "+(checkAvailability()?"Available":"Reserved"));
    }
}

// Book class
class Book extends LibraryItem {
    private String genre;

    public Book(int itemId,String title,String author,String genre) {
        super(itemId,title,author);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre=genre;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

// Magazine class
class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(int itemId,String title,String author,int issueNumber) {
        super(itemId,title,author);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if(issueNumber>0) {
            this.issueNumber=issueNumber;
        } else {
            System.out.println("Issue number must be positive.");
        }
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

// DVD class
class DVD extends LibraryItem {
    private int durationMinutes;

    public DVD(int itemId,String title,String author,int durationMinutes) {
        super(itemId,title,author);
        this.durationMinutes=durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        if(durationMinutes>0) {
            this.durationMinutes=durationMinutes;
        } else {
            System.out.println("Duration must be positive.");
        }
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem item1=new Book(101,"Java Programming","James Gosling","Programming");
        LibraryItem item2=new Magazine(102,"Science Today","Editorial Team",5);
        LibraryItem item3=new DVD(103,"Java Tutorials","Learning Studio",120);

        List<LibraryItem> items=new ArrayList<>();

        items.add(item1);
        items.add(item2);
        items.add(item3);

        item1.reserveItem("Ravi");
        item2.reserveItem("Priya");

        for(LibraryItem item:items) {
            System.out.println("\n");
            item.getItemDetails();
        }

        System.out.println("\nReturning a library item:");
        item1.returnItem();

        System.out.println("Book available: "+item1.checkAvailability());
    }
}