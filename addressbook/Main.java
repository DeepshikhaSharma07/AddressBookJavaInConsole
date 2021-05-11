package com.tts.addressbook;

import java.util.*;

public class Main {
 public static  Scanner scanner = new Scanner(System.in);

 // created an address book object

 private static AddressBook myAddressBook = new AddressBook();

    // create a mainMenu method to give option to the user to choose from
    // create scanner in the main class to be called

    public static void displayScreen() {

        // tracks if the program should keep running



        // Welcome note for the user and ask for options

        System.out.println("Welcome to the Java Address Book. What would you like to do today? \n" +
                "Please choose what you'd like to do with the database:");
        System.out.println("1) Add an entry\n" +
                "2) Remove an entry\n" +
                "3) Search for a specific entry\n" +
                "4) Print Address Book\n" +
                "5) Delete Book\n" +
                "6) Quit\n " );

        int userInput = scanner.nextInt();

        switch(userInput){
            case 1:
                myAddressBook.addAddress();
                break;
            case 2:
                myAddressBook.removeAddress();
                break;
            case 3:
                myAddressBook.searchAddress();
                break;
            case 4:
                myAddressBook.printAddresses();
                break;
            case 5:
                myAddressBook.deleteAddresses();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
                break;
        }

    }

    public static void main(String[] args) {
        displayScreen();
        scanner.close();
    }

}