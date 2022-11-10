package com.java;

import java.util.ArrayList;

public class AddressBookMain {
    static AddressBookMethods methods=new AddressBookMethods();
    static ArrayList<String> addressBook1=new ArrayList<>();
    static ArrayList<String> addressBook2=new ArrayList<>();
    static ArrayList<String> addressBook3=new ArrayList<>();


    public static void main(String[] args){
        methods.createAddressBook(addressBook1,"first");
        methods.createAddressBook(addressBook2,"second");
        methods.createAddressBook(addressBook3,"third");
        methods.printing(addressBook1,"first");
        methods.printing(addressBook2,"second");
        methods.printing(addressBook3,"third");


    }


}
