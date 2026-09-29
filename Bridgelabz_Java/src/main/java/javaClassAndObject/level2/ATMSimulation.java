package javaClassAndObject.level2;
import java.util.Scanner;
/*
    create a class BankAccount
    Attributes: accountHolder, accountNumber, balance
    methods: deposit money
             withdraw money
             display current balance
 */
class BankAccount{
    private String accountHolder;
    private long accountNumber;
    private int balance;

    public BankAccount(String accountHolder,long accountNumber,int balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void depositeMoney(int amount){
        balance+=amount;
    }

    public void withdrawMoney(int amount){
        if(balance>=amount){
            balance-=amount;
        }else{

            System.out.println("The balance is lower then the amount");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance= " + balance);
    }
}
public class ATMSimulation {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter the Name , Account Number and balance: ");
        String accountHolder=input.nextLine();
        long accountNumber=input.nextLong();
        int balance=input.nextInt();

        //create BankAccount class object
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);
        System.out.println("Option 1: Deposite Amount\nOption 2: Withdraw Amount\nOption 3: Check balance Amount\nOption 4: Exit");
        int choice;
        do{
            System.out.println("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int deposit;
                    do{
                    System.out.println("Enter valid deposite amount: ");
                    deposit = input.nextInt();
                    }while(deposit<=0);
                    bankAccount.depositeMoney(deposit);
                    break;
                case 2:
                    int withdraw;
                    do {
                        System.out.println("Enter valid withdraw amount: ");
                        withdraw = input.nextInt();
                    }while(withdraw<=0);
                    bankAccount.withdrawMoney(withdraw);
                    break;
                case 3:
                    bankAccount.displayBalance();
                    break;
            }
        }while(choice!=4);

        input.close();
    }
}
