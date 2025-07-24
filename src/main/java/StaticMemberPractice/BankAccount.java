package StaticMemberPractice;

import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private static String bankName;
    private static float interestRate;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static float getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(float interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void AccountDetailsPrinting(){
        System.out.println("This is Account Number "+ getAccountNumber());
        System.out.println("This is Balance "+ getBalance());
        System.out.println("This is Bank Name "+ getBankName());
        System.out.println("This is Interest Rate "+ getInterestRate());
    }


    public static void main(String[] args) {
        setBankName("SBI");
        setInterestRate(7.5f);
        BankAccount ba1 = new BankAccount(1,2000);
        BankAccount ba2 = new BankAccount(2,3000);
        BankAccount ba3 = new BankAccount(3,4000);

        ba1.AccountDetailsPrinting();
        ba2.AccountDetailsPrinting();
        ba3.AccountDetailsPrinting();
    }




}
