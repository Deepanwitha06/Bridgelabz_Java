package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Loanable
                Methods: applyForLoan(), calculateLoanEligibility()

    Abstract Class : BankAccount
                     Attributes: accountNumber, holderName, balance
                     Methods: deposit(), withdraw(), calculateInterest()
                     Implements the Loanable interface

    Subclasses : SavingsAccount, CurrentAccount
*/
import java.util.ArrayList;
import java.util.List;

// Interface
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract class
abstract class BankAccount implements Loanable {
    private long accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(long accountNumber,String holderName,double balance) {
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    // Getters and Setters
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        if(accountNumber>0) {
            this.accountNumber=accountNumber;
        } else {
            System.out.println("Invalid account number.");
        }
    }

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName=holderName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance>=0) {
            this.balance=balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount>0) {
            balance+=amount;
            System.out.printf("Deposited: Rs. %.2f%n",amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount<=0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if(amount<=balance) {
            balance-=amount;
            System.out.printf("Withdrawn: Rs. %.2f%n",amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Implementing Loanable interface
    @Override
    public void applyForLoan() {
        if(calculateLoanEligibility()) {
            System.out.println("Loan application accepted for processing.");
        } else {
            System.out.println("Not eligible to apply for a loan.");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance>=10000;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Account Number: "+accountNumber+"\nAccount Holder: "+holderName);
        System.out.printf("Balance: Rs. %.2f%n",balance);
        System.out.printf("Interest: Rs. %.2f%n",calculateInterest());
        System.out.println("Loan Eligible: "+calculateLoanEligibility());
    }
}

// SavingsAccount class
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(long accountNumber,String holderName,double balance,double interestRate) {
        super(accountNumber,holderName,balance);
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>=0) {
            this.interestRate=interestRate;
        } else {
            System.out.println("Interest rate cannot be negative.");
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate/100;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance()>=20000;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private double interestRate;

    public CurrentAccount(long accountNumber,String holderName,double balance,double interestRate) {
        super(accountNumber,holderName,balance);
        this.interestRate=interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>=0) {
            this.interestRate=interestRate;
        } else {
            System.out.println("Interest rate cannot be negative.");
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate/100;
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance()>=50000;
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1=new SavingsAccount(100001,"Ravi",50000,4.0);
        BankAccount account2=new CurrentAccount(100002,"Priya",100000,2.0);

        List<BankAccount> accounts=new ArrayList<>();

        accounts.add(account1);
        accounts.add(account2);

        account1.deposit(5000);
        account2.withdraw(10000);

        for(BankAccount account:accounts) {
            System.out.println("\n");
            account.displayDetails();
            account.applyForLoan();
        }
    }
}