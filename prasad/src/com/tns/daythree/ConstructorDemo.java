package com.tns.daythree; // Package declaration

import java.util.Scanner; // Importing Scanner class

public class ConstructorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object for user input
        String name, city; // Declaration of variables to store customer name and city
        int id; // Declaration of variable to store customer ID

        // User input for customer details
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt(); // Reading customer ID
        sc.nextLine(); // Consuming newline character
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine(); // Reading customer name
        System.out.print("Enter Customer City : ");
        city = sc.nextLine(); // Reading customer city
        System.out.println(" ");

        Customer c1 = new Customer(); // Creating Customer object using default constructor
        // Setting customer details using setter methods
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println(c1); // Printing customer details
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt(); // Reading customer ID
        sc.nextLine(); // Consuming newline character
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine(); // Reading customer name
        System.out.print("Enter Customer City : ");
        city = sc.nextLine(); // Reading customer city

        Customer c2 = new Customer(name, id, city); // Creating Customer object using parameterized constructor
        System.out.println(c2); // Printing customer details
        sc.close(); // Closing Scanner object to prevent resource leak
    }
}
