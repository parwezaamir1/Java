package com.company;
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone("9555423678");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("Enter your choice: (6 to show available actions) ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit= true;
                    break;
                case 1:
                    myMobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if (myMobilePhone.addNewContact(contact)){
            System.out.println("New contact added "+ name + ", "+ phoneNumber);
        }else {
            System.out.println("Cannot add, "+name +" already on file");
        }
    }
    public static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new mobile number: ");
        String newMobileNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newMobileNumber);
        if (myMobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error in updating record");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (myMobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully removed contact");
        }else {
            System.out.println("Error in deleting contact");
        }
    }
    public static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = myMobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName() + " phoneNumber: "+existingContactRecord.getPhoneNumber());
    }
    public static void printActions(){
        System.out.println("\nAvailable actions:\nPress ");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To modify an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - Query if existing contact exists.");
        System.out.println("\t 6 - To print a list of available options.");
        System.out.println("Choose your action: ");
    }

}
