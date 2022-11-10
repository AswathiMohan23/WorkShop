package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMethods {
    static Scanner sc=new Scanner(System.in);
    public void createAddressBook(ArrayList<String> addressBook,String number) {
        System.out.println("\n\n=============== Enter the details of "+number+"person ======\n");
        System.out.println("enter the name : ");
        addressBook.add(sc.next());
        System.out.println("enter the age : ");
        addressBook.add(sc.next());
        System.out.println("enter the phone number : ");
        addressBook.add(sc.next());
        System.out.println("enter the city : ");
        addressBook.add(sc.next());
        System.out.println("enter the state : ");
        addressBook.add(sc.next());
    }


    public void displayTheAddressBook(ArrayList<String> addressBook) {
        System.out.println("\n===================== printing the addressBook  ====================");
        System.out.println(addressBook);
    }
}
