package com.java;
public class Person {

    public static void main(String[] args){
        System.out.println("the details are : ");
        PersonalDetails personalDetails=new PersonalDetails(); // class object
        personalDetails.setFirstName("Aswathi");
        personalDetails.setSecondName("Mohan");
        personalDetails.setId(23);
        personalDetails.setDate(20);
        personalDetails.setMonth(11);
        personalDetails.setYear(2010);
        personalDetails.setAge(12);
        personalDetails.setAddress("kerala");
        System.out.println(personalDetails.toString());
    }
}
