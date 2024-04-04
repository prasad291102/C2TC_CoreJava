package com.tns.daytwo2.o;

public class RCB_Teams {

    // Member variables
    private String name;
    private int age;
    private int jerseyNo; // Number

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for jersey number
    public int getJerseyNo() {
        return jerseyNo;
    }

    // Setter for jersey number
    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of RCB_Teams
        RCB_Teams obj = new RCB_Teams();
        
        // Set attributes using setter methods
        obj.setName("Virat Kohli");
        obj.setAge(35);
        obj.setJerseyNo(18);
        
        // Print out the attributes using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Jersey Number: " + obj.getJerseyNo());
    }
}
