package LinkedList;
import java.util.Scanner;

class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie prev;
    Movie next;

    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title=title;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.rating=rating;
        this.prev=null;
        this.next=null;
    }
}

class MovieDoublyLinkedList {
    private Movie head;
    private Movie tail;

    // Add movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie=new Movie(title,director,year,rating);

        if(head==null) {
            head=tail=newMovie;
        } else {
            newMovie.next=head;
            head.prev=newMovie;
            head=newMovie;
        }

        System.out.println("Movie added at the beginning.");
    }

    // Add movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie=new Movie(title,director,year,rating);

        if(tail==null) {
            head=tail=newMovie;
        } else {
            tail.next=newMovie;
            newMovie.prev=tail;
            tail=newMovie;
        }

        System.out.println("Movie added at the end.");
    }

    // Add movie at a specific position (1-based indexing)
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if(position<1) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1) {
            addAtBeginning(title,director,year,rating);
            return;
        }

        Movie current=head;

        for(int i=1;i<position-1 && current!=null;i++) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Invalid position.");
            return;
        }

        if(current==tail) {
            addAtEnd(title,director,year,rating);
            return;
        }

        Movie newMovie=new Movie(title,director,year,rating);
        newMovie.next=current.next;
        newMovie.prev=current;
        current.next.prev=newMovie;
        current.next=newMovie;

        System.out.println("Movie added at position "+position+".");
    }

    // Remove movie by title
    public void removeMovie(String title) {
        Movie current=head;

        while(current!=null && !current.title.equalsIgnoreCase(title)) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Movie not found.");
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

        System.out.println("Movie removed successfully.");
    }

    // Search movies by director
    public void searchByDirector(String director) {
        Movie current=head;
        boolean found=false;

        while(current!=null) {
            if(current.director.equalsIgnoreCase(director)) {
                displayMovie(current);
                found=true;
            }
            current=current.next;
        }

        if(!found) {
            System.out.println("No movies found for this director.");
        }
    }

    // Search movies by rating
    public void searchByRating(double rating) {
        Movie current=head;
        boolean found=false;

        while(current!=null) {
            if(Double.compare(current.rating,rating)==0) {
                displayMovie(current);
                found=true;
            }
            current=current.next;
        }

        if(!found) {
            System.out.println("No movies found with this rating.");
        }
    }

    // Display all movies in forward order
    public void displayForward() {
        if(head==null) {
            System.out.println("No movie records available.");
            return;
        }

        Movie current=head;
        System.out.println("\n--- Movies: Forward Order ---");

        while(current!=null) {
            displayMovie(current);
            current=current.next;
        }
    }

    // Display all movies in reverse order
    public void displayReverse() {
        if(tail==null) {
            System.out.println("No movie records available.");
            return;
        }

        Movie current=tail;
        System.out.println("\n--- Movies: Reverse Order ---");

        while(current!=null) {
            displayMovie(current);
            current=current.prev;
        }
    }

    // Update rating by movie title
    public void updateRating(String title, double newRating) {
        Movie current=head;

        while(current!=null) {
            if(current.title.equalsIgnoreCase(title)) {
                current.rating=newRating;
                System.out.println("Movie rating updated successfully.");
                return;
            }
            current=current.next;
        }

        System.out.println("Movie not found.");
    }

    // Display one movie record
    private void displayMovie(Movie movie) {
        System.out.println("Movie Title: "+movie.title);
        System.out.println("Director: "+movie.director);
        System.out.println("Year of Release: "+movie.yearOfRelease);
        System.out.println("Rating: "+movie.rating);
        System.out.println("-----------------------------");
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MovieDoublyLinkedList list=new MovieDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add movie at beginning");
            System.out.println("2. Add movie at end");
            System.out.println("3. Add movie at specific position");
            System.out.println("4. Remove movie by title");
            System.out.println("5. Search by director");
            System.out.println("6. Search by rating");
            System.out.println("7. Display movies forward");
            System.out.println("8. Display movies in reverse");
            System.out.println("9. Update movie rating");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter movie title: ");
                    String title=sc.nextLine();

                    System.out.print("Enter director: ");
                    String director=sc.nextLine();

                    System.out.print("Enter year of release: ");
                    int year=sc.nextInt();

                    System.out.print("Enter rating: ");
                    double rating=sc.nextDouble();
                    sc.nextLine();

                    if(choice==1) {
                        list.addAtBeginning(title,director,year,rating);
                    } else if(choice==2) {
                        list.addAtEnd(title,director,year,rating);
                    } else {
                        System.out.print("Enter position (starting from 1): ");
                        int position=sc.nextInt();
                        sc.nextLine();

                        list.addAtPosition(title,director,year,rating,position);
                    }
                    break;

                case 4:
                    System.out.print("Enter movie title to remove: ");
                    title=sc.nextLine();
                    list.removeMovie(title);
                    break;

                case 5:
                    System.out.print("Enter director name: ");
                    director=sc.nextLine();
                    list.searchByDirector(director);
                    break;

                case 6:
                    System.out.print("Enter rating to search: ");
                    rating=sc.nextDouble();
                    sc.nextLine();
                    list.searchByRating(rating);
                    break;

                case 7:
                    list.displayForward();
                    break;

                case 8:
                    list.displayReverse();
                    break;

                case 9:
                    System.out.print("Enter movie title: ");
                    title=sc.nextLine();

                    System.out.print("Enter new rating: ");
                    double newRating=sc.nextDouble();
                    sc.nextLine();

                    list.updateRating(title,newRating);
                    break;

                case 10:
                    System.out.println("Exiting Movie Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=10);

        sc.close();
    }
}