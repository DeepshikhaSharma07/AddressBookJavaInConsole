package com.tts.addressbook;
// this class declares the variables or fields of an object in the array list


public class AddressField {
    // declare variable private

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailId;


    // empty constructor

    public AddressField(String firstName, String lastName, String phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }


    //getter and setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    // Print it in the console by calling the getter method


    public void printAddress() {
        System.out.println( "AddressBookMethod{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailId='" + getEmailId() + '\'' +
                '}');
    }

}