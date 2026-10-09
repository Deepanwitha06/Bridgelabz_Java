package LinkedList;

import java.util.Scanner;

class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    Book prev;
    Book next;

    Book(String title, String author, String genre, int bookId, boolean available) {
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.available=available;
        this.prev=null;
        this.next=null;
    }
}

class BookDoublyLinkedList {
    private Book head;
    private Book tail;

    // Add book at the beginning
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        Book newBook=new Book(title,author,genre,bookId,available);

        if(head==null) {
            head=tail=newBook;
        } else {
            newBook.next=head;
            head.prev=newBook;
            head=newBook;
        }

        System.out.println("Book added at the beginning.");
    }

    // Add book at the end
    public void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        Book newBook=new Book(title,author,genre,bookId,available);

        if(tail==null) {
            head=tail=newBook;
        } else {
            tail.next=newBook;
            newBook.prev=tail;
            tail=newBook;
        }

        System.out.println("Book added at the end.");
    }

    // Add book at a specific position (1-based indexing)
    public void addAtPosition(String title, String author, String genre, int bookId, boolean available, int position) {
        if(position<1) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1) {
            addAtBeginning(title,author,genre,bookId,available);
            return;
        }

        Book current=head;

        for(int i=1;i<position-1 && current!=null;i++) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Invalid position.");
            return;
        }

        if(current==tail) {
            addAtEnd(title,author,genre,bookId,available);
            return;
        }

        Book newBook=new Book(title,author,genre,bookId,available);

        newBook.next=current.next;
        newBook.prev=current;
        current.next.prev=newBook;
        current.next=newBook;

        System.out.println("Book added at position "+position+".");
    }

    // Remove book by Book ID
    public void removeBook(int bookId) {
        Book current=head;

        while(current!=null && current.bookId!=bookId) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Book not found.");
            return;
        }

        if(current==head) {
            head=current.next;
        } else {
            current.prev.next=current.next;
        }

        if(current==tail) {
            tail=current.prev;
        } else {
            current.next.prev=current.prev;
        }

        if(head!=null) {
            head.prev=null;
        }

        if(tail!=null) {
            tail.next=null;
        }

        System.out.println("Book removed successfully.");
    }

    // Search book by title
    public void searchByTitle(String title) {
        Book current=head;
        boolean found=false;

        while(current!=null) {
            if(current.title.equalsIgnoreCase(title)) {
                displayBook(current);
                found=true;
            }

            current=current.next;
        }

        if(!found) {
            System.out.println("No books found with this title.");
        }
    }

    // Search book by author
    public void searchByAuthor(String author) {
        Book current=head;
        boolean found=false;

        while(current!=null) {
            if(current.author.equalsIgnoreCase(author)) {
                displayBook(current);
                found=true;
            }

            current=current.next;
        }

        if(!found) {
            System.out.println("No books found for this author.");
        }
    }

    // Update book availability by Book ID
    public void updateAvailability(int bookId, boolean available) {
        Book current=head;

        while(current!=null) {
            if(current.bookId==bookId) {
                current.available=available;
                System.out.println("Book availability updated successfully.");
                return;
            }

            current=current.next;
        }

        System.out.println("Book not found.");
    }

    // Display all books in forward order
    public void displayForward() {
        if(head==null) {
            System.out.println("Library is empty.");
            return;
        }

        Book current=head;

        System.out.println("\n--- Books: Forward Order ---");

        while(current!=null) {
            displayBook(current);
            current=current.next;
        }
    }

    // Display all books in reverse order
    public void displayReverse() {
        if(tail==null) {
            System.out.println("Library is empty.");
            return;
        }

        Book current=tail;

        System.out.println("\n--- Books: Reverse Order ---");

        while(current!=null) {
            displayBook(current);
            current=current.prev;
        }
    }

    // Count total number of books
    public void countBooks() {
        int count=0;
        Book current=head;

        while(current!=null) {
            count++;
            current=current.next;
        }

        System.out.println("Total number of books: "+count);
    }

    // Display one book record
    private void displayBook(Book book) {
        System.out.println("Book ID: "+book.bookId);
        System.out.println("Book Title: "+book.title);
        System.out.println("Author: "+book.author);
        System.out.println("Genre: "+book.genre);
        System.out.println("Availability: "+(book.available ? "Available" : "Not Available"));
        System.out.println("-----------------------------");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookDoublyLinkedList library=new BookDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add book at beginning");
            System.out.println("2. Add book at end");
            System.out.println("3. Add book at specific position");
            System.out.println("4. Remove book by ID");
            System.out.println("5. Search book by title");
            System.out.println("6. Search book by author");
            System.out.println("7. Update book availability");
            System.out.println("8. Display books forward");
            System.out.println("9. Display books in reverse");
            System.out.println("10. Count total books");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter book ID: ");
                    int bookId=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter book title: ");
                    String title=sc.nextLine();

                    System.out.print("Enter author: ");
                    String author=sc.nextLine();

                    System.out.print("Enter genre: ");
                    String genre=sc.nextLine();

                    System.out.print("Is the book available? (true/false): ");
                    boolean available=sc.nextBoolean();
                    sc.nextLine();

                    if(bookId<=0) {
                        System.out.println("Book ID must be positive.");
                        break;
                    }

                    if(choice==1) {
                        library.addAtBeginning(title,author,genre,bookId,available);
                    } else if(choice==2) {
                        library.addAtEnd(title,author,genre,bookId,available);
                    } else {
                        System.out.print("Enter position (starting from 1): ");
                        int position=sc.nextInt();
                        sc.nextLine();

                        library.addAtPosition(title,author,genre,bookId,available,position);
                    }
                    break;
                }

                case 4:
                    System.out.print("Enter book ID to remove: ");
                    int deleteId=sc.nextInt();
                    library.removeBook(deleteId);
                    break;

                case 5:
                    System.out.print("Enter book title to search: ");
                    String searchTitle=sc.nextLine();
                    library.searchByTitle(searchTitle);
                    break;

                case 6:
                    System.out.print("Enter author name to search: ");
                    String searchAuthor=sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 7:
                    System.out.print("Enter book ID: ");
                    int updateId=sc.nextInt();

                    System.out.print("Enter availability (true = available, false = unavailable): ");
                    boolean availability=sc.nextBoolean();
                    sc.nextLine();

                    library.updateAvailability(updateId,availability);
                    break;

                case 8:
                    library.displayForward();
                    break;

                case 9:
                    library.displayReverse();
                    break;

                case 10:
                    library.countBooks();
                    break;

                case 11:
                    System.out.println("Exiting Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=11);

        sc.close();
    }
}