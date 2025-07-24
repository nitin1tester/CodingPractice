package ConstructorPractice;

public class Account {
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double balance ){
        if (accountNumber == null || accountNumber.isEmpty() || accountNumber.isBlank()){
            System.out.println("Account number can not be empty or null");
        } else if (balance < 0) {
            System.out.println("Balance can not be negative");
        }else {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account("nitin",8899854);
        System.out.println(account.accountNumber + "   " + account.balance );
    }


}
