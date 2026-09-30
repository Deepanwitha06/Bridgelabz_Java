package javaConstructorsAndAccesModifiers.AccessModifiers;
import java.util.Scanner;
/*
     create,
     class : bankAccount
     subclass: SavingsAccount
     Attributes : accountNumber (public)
                  accountHolder (protected)
                  balance       (private)
     Methods:  access and modify balance using public methods
 */
class BankAccount{
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public void updateBalance(double newBalance){
        balance=newBalance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolder,double balance){
        super(accountHolder,balance);
    }

    public void display(){
        System.out.println("Bank Account Details: ");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+getBalance());
    }
}
public class BankAccountManagement {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take user input
        System.out.println("Enter the accountNumber, accountHolder name and balance: ");
        long accountNumber=input.nextLong();
        input.nextLine();
        String accountHolder=input.nextLine();
        double balance=input.nextDouble();

        SavingsAccount savingsAccount=new SavingsAccount(accountHolder,balance);
        savingsAccount.accountNumber=accountNumber;
        savingsAccount.display();

        System.out.println("Enter the new balance: ");
        double newBalance=input.nextDouble();
        savingsAccount.updateBalance(newBalance);
        savingsAccount.display();

        input.close();
    }
}
