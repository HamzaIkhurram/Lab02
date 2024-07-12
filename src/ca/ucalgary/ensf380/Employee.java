// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

// This class represents an Employee, who is also a type of User
public class Employee extends User {
    // Constructor to initialize an employee
    public Employee(String employeeName, String employeePhoneNumber, String employeeAddress) {
        super(employeeName, employeePhoneNumber, employeeAddress);
    }
    // Any employee-specific methods would go here
}
