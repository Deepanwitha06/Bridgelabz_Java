package LinkedList;
import java.util.Scanner;

/*
           using doubly linked list movie management system
           Methods: add movie at beginning,end and specific postion
                    remove movie by movie title
                    search movie by director or rating
                    display all movie records in both forward and reverse order
                    update movie rating based on movie title
 */

class Movie{
    String title;
    String director;
    String yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title,String director,String yearOfRelease, double rating){
        this.title=title;
        this.director=director;
        this.yearOfRelease=yearOfRelease;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}

class MovieLinkedList{
    private Movie head;
    private Movie tail;

    //add movieat beginning
    public void insertAtBeginning(String title,String director,String yearOfRelease, double rating){
        Movie newMovie=new Movie( title, director, yearOfRelease, rating);
        if(head==null){
            head=newMovie;
            tail=newMovie;
            return;
        }
        newMovie.next=head;
        head.prev=newMovie;
        head=newMovie;
    }

    //add movie at end
    public void insertAtEnd(String title,String director,String yearOfRelease, double rating){
        Movie newMovie=new Movie( title, director, yearOfRelease, rating);
        if(head==null){
            head=newMovie;
            tail=newMovie;
            return;
        }
        Movie current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newMovie;
        newMovie.prev=current;
        tail=newMovie;
    }

    //add movie at a postion
    public void insertAtSpecificposition(String title,String director,String yearOfRelease, double rating,int position){
        Movie newMovie=new Movie( title, director, yearOfRelease, rating);
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            insertAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie current=head;
        for(int i=0;i<position-1 && current!=null;i++){
            current=current.next;
        }
        if(current==null){
            System.out.println("Invalid position");
            return;
        }
        newMovie.next=current.next;
        newMovie.prev=current;
        if(current.next==null){
            tail=newMovie;
        }else {
            current.next.prev = newMovie;
        }
        current.next = newMovie;
        return;
    }

    //remove movie by title
    public void deleteByTitle(String targettitle){
        if(head==null){
            System.out.println("No movies");
            return;
        }
        if(head.title.equalsIgnoreCase(targettitle)){
            head=head.next;
            if(head==null){
                tail=null;
            }else{
                head.prev=null;
            }
            return;
        }
        Movie current=head;
        while(current.next!=null){
            if(current.next.title.equalsIgnoreCase(targettitle)){
                if(current.next.next==null){
                    current.next=null;
                    tail=current;
                    return;
                }
                Movie deletedMovie=current.next;
                current.next=deletedMovie.next;
                deletedMovie.next.prev=current;
                return;
            }
            current=current.next;
        }
    }

    //search movie by director or rating
    public boolean searchByDirector(String targetDirector){
        if(head==null){
            System.out.println("No movies ");
            return false;
        }
        Movie current=head;
        while(current!=null){
            if(current.director==targetDirector){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public boolean searchByRating(double targetRating){
        if(head==null){
            System.out.println("no Movies");
            return false;
        }
        Movie current=head;
        while(current!=null){
            if(Double.compare(current.rating,targetRating)==0){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //display
    public void displaymovieDetails(){
        int i=1;
        System.out.println("Forward order: ");
        if(head==null){
            System.out.println("No movies");
        }
        Movie current=head;
        while(current!=null){
            System.out.println("Movie "+i+" details: "+"\nTitle: "+current.title+"\nDirector: "+current.director+"\nYear of release: "+current.yearOfRelease+"Rating: "+current.rating);
            i++;
            current=current.next;
        }
        current=tail;
        System.out.println("Reverse order: ");
        while(current!=null){
            System.out.println("Movie "+i+" details: "+"\nTitle: "+current.title+"\nDirector: "+current.director+"\nYear of release: "+current.yearOfRelease+"Rating: "+current.rating);
            i--;
            current=current.prev;
        }
    }

    //update rating
    public void updateRating(String targetTitle,double targetRating){
        if(head==null){
            System.out.println("no movies");
            return;
        }
        Movie current=head;
        while(current!=null){
            if(current.title==targetTitle){
                current.rating=targetRating;
                System.out.println("Updated");
                return;
            }
            current=current.next;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args){

        MovieLinkedList list=new MovieLinkedList();

        list.insertAtBeginning("Inception","Christopher Nolan","2010",8.8);
        list.insertAtEnd("Avatar","James Cameron","2009",7.9);
        list.insertAtSpecificposition("Interstellar","Christopher Nolan","2014",8.7,1);

        list.displaymovieDetails();

        System.out.println("\nSearch by director:");
        System.out.println(list.searchByDirector("Christopher Nolan"));

        System.out.println("\nSearch by rating:");
        System.out.println(list.searchByRating(7.9));

        list.updateRating("Avatar",8.2);
        list.deleteByTitle("Inception");

        System.out.println("\nAfter deletion:");
        list.displaymovieDetails();

    }
}