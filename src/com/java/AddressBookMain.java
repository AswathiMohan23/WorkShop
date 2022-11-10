package com.java;

import java.util.ArrayList;

public class AddressBookMain {
    static AddressBookMethods methods=new AddressBookMethods();
    static ArrayList<String> addressBook=new ArrayList<>();


    public static void main(String[] args){
        methods.createAddressBook(addressBook,"first");
        methods.createAddressBook(addressBook,"second");
        methods.createAddressBook(addressBook,"third");
        methods.displayTheAddressBook(addressBook);


    }


}
