package org.ust.OOPS.Encapsulation;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;

        if(balance>=0){
            this.balance = balance;
        }else{
            //handling invalid balances
            this.balance =0;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            System.out.println("Deposit Success");
        }else{
            System.out.println("Deposit Failure");
        }
    }

    public boolean withdraw(double amount) {

        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawl Success");
            return true;
        }
        System.out.println("Withdrawl Failure");
        return false;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}

class MainClass{
    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234567890",10000);
        account.deposit(200);
        System.out.println("Balance after deposit "+ account.getBalance());

        account.deposit(-200);

        boolean withdrawStatus = account.withdraw(20000);
        if(!withdrawStatus){
            System.out.println("Withdrawal failed due to amount ");
        }
        withdrawStatus = account.withdraw(1000);
        if(!withdrawStatus){
            System.out.println("Withdrawal failed due to amount ");
        }

        System.out.println("Final Balance "+ account.getBalance());
    }
}
