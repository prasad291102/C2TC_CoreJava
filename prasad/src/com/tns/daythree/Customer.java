package com.tns.daythree; // Package declaration

public class Customer {
    private String customerName; // Private field declaration for customer name
    private int customerId; // Private field declaration for customer ID
    private String customerCity; // Private field declaration for customer city

    // Default Constructor
    public Customer() {
        System.out.println("Default Constructor"); // Print statement indicating default constructor is called
    }

    // Parameterized Constructor
    // Use of this keyword
    public Customer(String customerName, int customerId, String customerCity) {
        this(); // calling default constructor using this() keyword
        System.out.println("Parameterized Constructor"); // Print statement indicating parameterized constructor is called
        this.customerName = customerName; // Assign parameter value to customer name field
        this.customerId = customerId; // Assign parameter value to customer ID field
        this.customerCity = customerCity; // Assign parameter value to customer city field
    }

    // Getter and Setters for customer name
    public String getCustomerName() {
        return customerName; // Return customer name
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName; // Set customer name
    }

    // Getter and Setters for customer ID
    public int getCustomerId() {
        return customerId; // Return customer ID
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId; // Set customer ID
    }

    // Getter and Setters for customer city
    public String getCustomerCity() {
        return customerCity; // Return customer city
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity; // Set customer city
    }

    // Override toString method
    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity + "]";
        // Return formatted string containing customer details
    }
}
