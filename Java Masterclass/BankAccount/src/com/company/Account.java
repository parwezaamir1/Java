package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //default constructor
    public Account(){
        System.out.println("Empty constructor called");
    }
    // This constructor is custom constructor
    public Account(String number, double balance, String customerName, String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Account constructor with parameters called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" processed. Available balance is "+this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount <0){
            System.out.println("Only "+this.balance+" available. Withdrawal not processed");
        }else {
        this.balance -= withdrawAmount;
        System.out.println("Withdrawal of "+withdrawAmount+" processed. Remaining balance "+this.balance);
        }
    }


    public String getNumber() {
        return number;
    }

    public void setAccountNumber(String number) {
        this.number= number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public void setPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
