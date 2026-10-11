package LinkedList;
/*
    Circular Linked List: Online Ticket Reservation System
    methods:
    1. Add ticket reservation
    2. Remove ticket by Ticket ID
    3. Display all tickets
    4. Search by Customer Name or Movie Name
    5. Count total booked tickets
*/

class Ticket{
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId,String customerName,String movieName,
           String seatNumber,String bookingTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.bookingTime=bookingTime;
        this.next=null;
    }
}

class TicketReservationSystem{
    Ticket last;
    int size;

    // Add a ticket at the end of the circular linked list
    public void addTicket(int ticketId,String customerName, String movieName,String seatNumber, String bookingTime){
        if(searchTicketId(ticketId)){
            System.out.println("Ticket ID already exists");
            return;
        }

        Ticket newTicket=new Ticket(ticketId,customerName,movieName,seatNumber,bookingTime);
        if(last==null){
            last=newTicket;
            newTicket.next=newTicket;
        }else{
            newTicket.next=last.next;
            last.next=newTicket;
            last=newTicket;
        }

        size++;
        System.out.println("Ticket booked successfully");
    }

    // Search for a ticket ID
    public boolean searchTicketId(int ticketId){
        if(last==null){
            return false;
        }

        Ticket current=last.next;
        do{
            if(current.ticketId==ticketId){
                return true;
            }
            current=current.next;
        }while(current!=last.next);
        return false;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketId){
        if(last==null){
            System.out.println("No tickets booked");
            return;
        }

        Ticket previous=last;
        Ticket current=last.next;
        do{
            if(current.ticketId==ticketId){
                if(current==previous){
                    last=null;
                }else{
                    previous.next=current.next;

                    if(current==last){
                        last=previous;
                    }
                }

                current.next=null;
                size--;
                System.out.println("Ticket cancelled successfully");
                return;
            }
            previous=current;
            current=current.next;
        }while(current!=last.next);

        System.out.println("Ticket ID not found");
    }

    // Display all booked tickets
    public void displayTickets(){
        if(last==null){
            System.out.println("No tickets booked");
            return;
        }

        Ticket current=last.next;
        System.out.println("\nBooked Tickets:");
        do{
            displayTicket(current);
            current=current.next;
        }while(current!=last.next);
    }

    // Display one ticket
    public void displayTicket(Ticket ticket){
        System.out.println("\n");
        System.out.println("Ticket ID: "+ticket.ticketId);
        System.out.println("Customer Name: "+ticket.customerName);
        System.out.println("Movie Name: "+ticket.movieName);
        System.out.println("Seat Number: "+ticket.seatNumber);
        System.out.println("Booking Time: "+ticket.bookingTime);
    }

    // Search tickets by Customer Name
    public void searchByCustomerName(String customerName){
        if(last==null){
            System.out.println("No tickets booked");
            return;
        }

        Ticket current=last.next;
        boolean found=false;

        do{
            if(current.customerName.equalsIgnoreCase(customerName)){
                displayTicket(current);
                found=true;
            }

            current=current.next;
        }while(current!=last.next);

        if(!found){
            System.out.println("No tickets found for this customer");
        }
    }

    // Search tickets by Movie Name
    public void searchByMovieName(String movieName){
        if(last==null){
            System.out.println("No tickets booked");
            return;
        }

        Ticket current=last.next;
        boolean found=false;

        do{
            if(current.movieName.equalsIgnoreCase(movieName)){
                displayTicket(current);
                found=true;
            }

            current=current.next;
        }while(current!=last.next);

        if(!found){
            System.out.println("No tickets found for this movie");
        }
    }

    // Calculate total booked tickets
    public void countTickets(){
        System.out.println("Total booked tickets: "+size);
    }
}

public class OnlineTicketReservation{
    public static void main(String[] args){
        TicketReservationSystem system=new TicketReservationSystem();

        // Add ticket reservations
        system.addTicket(101,"Arun","Leo","A1","10:30 AM");
        system.addTicket(102,"Priya","Jailer","B2","11:00 AM");
        system.addTicket(103,"Kumar","Leo","A3","11:15 AM");

        // Display all tickets
        system.displayTickets();

        // Search by Customer Name
        System.out.println("\nSearch by Customer Name:");
        system.searchByCustomerName("Priya");

        // Search by Movie Name
        System.out.println("\nSearch by Movie Name:");
        system.searchByMovieName("Leo");

        // Display total booked tickets
        System.out.println("\nTicket Count:");
        system.countTickets();

        // Cancel a ticket
        System.out.println("\nCancel Ticket:");
        system.removeTicket(102);

        // Display updated tickets and count
        System.out.println("\nUpdated Ticket List:");
        system.displayTickets();
        system.countTickets();
    }
}
