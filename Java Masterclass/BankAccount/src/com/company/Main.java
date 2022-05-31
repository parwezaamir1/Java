package com.company;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("123456",0,"Parwez Aamir", "parwez@outlook.com","9555555556");
//        account.setAccountNumber("123456");
//        account.setBalance(0.0);
//        account.setCustomerName("Parwez Aamir");
//        account.setCustomerEmailAddress("parwez@outlook.com");
//        account.setPhoneNumber("9555555555");

        System.out.println(account.getBalance());
        System.out.println(account.getNumber());

        account.withdraw(100);

        account.deposit(50);
        account.withdraw(100);

        account.deposit(51);
        account.withdraw(100);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Zinnat", 50000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Parwez", 100000, "parwez@outlook.com");
        System.out.println(person3.getName());


    }
}
