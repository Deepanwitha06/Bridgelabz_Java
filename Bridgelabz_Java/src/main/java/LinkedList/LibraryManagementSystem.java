package LinkedList;
/*
     using doubly linked lis , library management system
     methods: Add a new book at the beginning, end, or at a specific position.
     Remove a book by Book ID.
     Search for a book by Book Title or Author.
     Update a book’s Availability Status.
     Display all books in forward and reverse order.
     Count the total number of books in the library.

 */
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

class BookLinkedList{
    Book head;

    //insertion at start
    public void insertAtBeginning(String title, String author, String genre, int bookId, boolean available){
        Book newbook=new Book(title,  author,  genre, bookId, available);
        if(head==null){
            head=newbook;
            return;
        }
        newbook.next=head;
        head.prev=newbook;
        head=newbook;
        return;
    }

    //insertion at end
    public void insertAtEnd(String title, String author, String genre, int bookId, boolean available) {
        Book newbook = new Book(title, author, genre, bookId, available);
        if (head == null) {
            head = newbook;
            return;
        }
        Book current=head;
        while(current.next!=null){
            current=current.next;
        }
        newbook.prev=current;
        current.next=newbook;
    }

    //insertion at specific position
    public void insertAtPosition(String title, String author, String genre, int bookId, boolean available,int position) {
        Book newbook = new Book(title, author, genre, bookId, available);
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertAtBeginning(title, author, genre, bookId, available);
            return;
        }
        Book current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        if(current.next==null){
            insertAtEnd(title, author, genre, bookId, available);
        }else {
            newbook.next = current.next;
            current.next.prev = newbook;
            current.next = newbook;
            newbook.prev = current;
        }
    }

    //remove by bookid
    public void deleteById(int id){
        if(head==null){
            System.out.println("No books");
            return;
        }
        Book current=head;
        while(current!=null){
            if(current.bookId==id){
                if(current.prev==null){
                    head=current.next;
                }else{
                    current.prev.next=current.next;
                }

                if(current.next!=null){
                    current.next.prev=current.prev;
                }
                return;
            }
            current=current.next;
        }
    }
    //search by title
    public boolean searchByTitle(String targetTite){
        Book current=head;
        while(current!=null){
            if(current.title.equalsIgnoreCase(targetTite)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    //search by Author
    public boolean searchByAuthor(String targetAuthor){
        Book current=head;
        while(current!=null){
            if(current.author.equalsIgnoreCase(targetAuthor)){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //upodate status
    public void updateStatus(int id,boolean status){
        Book current=head;
        while(current!=null){
            if(current.bookId==id){
                current.available=status;
                return;
            }
            current=current.next;
        }
    }
    //display
    public void display(){
        Book current=head;
        Book last=null;
        System.out.println("Forward order");
        while (current!=null){
            System.out.println("Book details: "+"\nTitle: "+current.title+"\nAuthor: "+current.author+"\nGenre: "+current.genre+"ID: "+current.bookId+"\nAvailability status: "+current.available);
            last=current;
            current=current.next;
        }
        System.out.println("Revrese order");
        while (last!=null){
            System.out.println("Book details: "+"\nTitle: "+last.title+"\nAuthor: "+last.author+"\nGenre: "+last.genre+"ID: "+last.bookId+"\nAvailability status: "+last.available);
            last=last.prev;
        }
    }

    //count books
    public void booksCount(){
        int cnt=0;
        Book current=head;
        while (current!=null){
            cnt++;
            current=current.next;
        }
        System.out.println("Books count: "+cnt);
        return;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args){
        BookLinkedList list=new BookLinkedList();

        list.insertAtBeginning("Java Basics","James","Programming",101,true);
        list.insertAtEnd("Python Basics","Guido","Programming",102,true);
        list.insertAtPosition("Data Structures","Mark","Education",103,true,1);

        list.display();

        System.out.println("Search by title: "+list.searchByTitle("Java Basics"));
        System.out.println("Search by author: "+list.searchByAuthor("Guido"));

        list.updateStatus(101,false);

        list.deleteById(102);

        list.booksCount();
        list.display();
    }
}