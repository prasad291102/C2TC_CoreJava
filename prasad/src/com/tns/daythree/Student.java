package com.tns.daythree; // Package declaration

public class Student extends Citizen { // Class declaration, extends Citizen class
    private int rollNo; // Private field declaration
    private String collegeName; // Private field declaration
    
    public Student() { // Constructor declaration
        super(); // Call to superclass constructor
    }
    
    public Student(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) { // Constructor declaration with parameters
        super(name, aadharNo, address, phno); // Call to superclass constructor
        this.rollNo = rollNo; // Assign parameter value to field
        this.collegeName = collegeName; // Assign parameter value to field
    }
    
    public int getRollNo() { // Method declaration
        return rollNo; // Return field value
    }
    
    public void setRollNo(int rollNo) { // Method declaration with parameter
        this.rollNo = rollNo; // Assign parameter value to field
    }
    
    public String getCollegeName() { // Method declaration
        return collegeName; // Return field value
    }
    
    public void setCollegeName(String collegeName) { // Method declaration with parameter
        this.collegeName = collegeName; // Assign parameter value to field
    }
    
    @Override // Annotation for overriding
    public String toString() { // Method declaration
        return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName() + ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno() + "]"; // Return formatted string
    }
}
