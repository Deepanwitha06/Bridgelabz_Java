package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : BankAccount
      Attributes: bankName , totalNumberOfAccounts (static)
                  accountHolderName              (instance)
                  accountNumber              (final instance)
      Methods:   getTotalAccounts()  - static
      Constructor -  initialize accountHolderName, accountNumber
 */
class BankAccount{
    private static String bankName="SBI";
    private static int totalNumberOfAccounts=0;
    private String accountHolderName;
    private final long accountNumber;

    //constructore to initialize accountHolderName, accountNumber
    public BankAccount(String accountHolderName,long accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalNumberOfAccounts++;
    }

    //static method
    public static int getTotalNumberOfAccounts(){
        return totalNumberOfAccounts;
    }

    public void display(){
        System.out.println("\nThe Bank Account details: ");
        System.out.println("Bank Name : "+bankName);
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Account Number : "+accountNumber);
    }
}

public class BankAccountSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the account holder name and account Number of person 1: ");
        String accountHolderName1=input.nextLine();
        long accountNumber1=input.nextLong();
        input.nextLine();

        System.out.println("Enter the account holder name and account Number of person 2: ");
        String accountHolderName2=input.nextLine();
        long accountNumber2=input.nextLong();
        input.nextLine();

        //class objects
        BankAccount bankAccount1=new BankAccount(accountHolderName1,accountNumber1);
        BankAccount bankAccount2=new BankAccount(accountHolderName2,accountNumber2);

        System.out.println("Total no.of Bank accounts are : "+BankAccount.getTotalNumberOfAccounts());
        if(bankAccount1 instanceof BankAccount) {
            bankAccount1.display();
        }
        if (bankAccount2 instanceof BankAccount){
            bankAccount2.display();
        }

        input.close();
    }
}
