package javaObjectModeling;
import java.util.Scanner;
/*
        Association
        classes: Bank ,Customer
        Bank associated with customer
        Bank class : Methods : openAccount()
        Customer class: Methods : viewBalance()
 */
class Customer{
    private String name;
    private long accountNumber;
    private double balance;

    public Customer(String name,long accountNumber,double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void viewBalance(){
        System.out.println("Customer details: ");
        System.out.println("Customer : "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance is :"+balance);
    }
}
class Bank{
    private String name;
    public Bank(String name){
        this.name=name;
    }

    public void openAccount(Customer customer){
        System.out.println("The account is created in "+name+" bank");
    }
}
public class BankAccountHolders_Association {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the bank name: ");
        String bankName=input.nextLine();
        System.out.println("Enter the customer name,account number and balance: ");
        String customerName=input.nextLine();
        long accountNumber=input.nextLong();
        double balance=input.nextDouble();

        //class objects
        Customer customer=new Customer(customerName,accountNumber,balance);
        Bank bank=new Bank(bankName);
        bank.openAccount(customer);
        customer.viewBalance();

        input.close();
    }
}
