package javaInheritance.HierarchicalInheritance;
/*
      Superclass: BankAccount
                  Attributes: accountNumber, balance
      Subclasses: SavingsAccount, Checking Account, FixedDepositAccount
                   Attributes for FiexedDepositAccount : interestrRate
                                  CheckingAccount : withdrawalLimit
                   Method: displayAccountType()
 */
class BankAcount{
    private long accountNumber;
    private double balance;
    public BankAcount(long accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void displayAccountType(){
        System.out.println("Account Number: "+accountNumber+"\nBalance: "+balance);
    }
}

class SavingsAccount extends BankAcount{
    double interestRate;
    public SavingsAccount(long accountNumber,double balance,double interestRate){
        super(accountNumber, balance);
        this.interestRate =interestRate ;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type: Savings");
        super.displayAccountType();
        System.out.println("interest Rate: "+interestRate +"\n" );
    }
}

class CheckingAccount extends BankAcount{
    double withdrawalLimit;
    public CheckingAccount(long accountNumber,double balance,double withdrawalLimit ){
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type: Savings");
        super.displayAccountType();
        System.out.println("withdrawal Limit: "+withdrawalLimit +"\n");
    }
}

class FixedDepositAccount  extends BankAcount{
    double interestRate ;
    public FixedDepositAccount (long accountNumber,double balance,double interestRate  ){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type:FD");
        super.displayAccountType();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountTypes {
    public static void main(String[] args){

        SavingsAccount savingsAccount=new SavingsAccount(10001, 50000.0, 4.5);
        CheckingAccount checkingAccount=new CheckingAccount(10002, 25000.0, 10000.0);
        FixedDepositAccount fixedDepositAccount=new FixedDepositAccount(10003, 100000.0, 2);
        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
