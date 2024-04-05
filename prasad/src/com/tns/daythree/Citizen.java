package com.tns.daythree; // Package declaration

public class Citizen { // Class declaration
    private String name; // Private field declaration
    private String aadharNo; // Private field declaration
    private String address; // Private field declaration
    private long phno; // Private field declaration

    public Citizen() { // Constructor declaration
        System.out.println("Citizen object created"); // Print statement
    }

    public Citizen(String name, String aadharNo, String address, long phno) { // Constructor declaration with parameters
        this.name = name; // Assign parameter value to field
        this.aadharNo = aadharNo; // Assign parameter value to field
        this.address = address; // Assign parameter value to field
        this.phno = phno; // Assign parameter value to field
    }

    public String getName() { // Method declaration
        return name; // Return field value
    }

    public void setName(String name) { // Method declaration with parameter
        this.name = name; // Assign parameter value to field
    }

    public String getAadharNo() { // Method declaration
        return aadharNo; // Return field value
    }

    public void setAadharNo(String aadharNo) { // Method declaration with parameter
        this.aadharNo = aadharNo; // Assign parameter value to field
    }

    public String getAddress() { // Method declaration
        return address; // Return field value
    }

    public void setAddress(String address) { // Method declaration with parameter
        this.address = address; // Assign parameter value to field
    }

    public long getPhno() { // Method declaration
        return phno; // Return field value
    }

    public void setPhno(long phno) { // Method declaration with parameter
        this.phno = phno; // Assign parameter value to field
    }

    @Override // Annotation for overriding
    public String toString() { // Method declaration
        return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]"; // Return formatted string
    }
}
