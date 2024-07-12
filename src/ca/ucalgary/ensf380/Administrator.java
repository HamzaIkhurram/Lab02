// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

// This class represents an Administrator, who is a special kind of User
public class Administrator extends User {
    // Constructor to initialize an administrator
    public Administrator(String adminName, String adminPhoneNumber, String adminAddress) {
        super(adminName, adminPhoneNumber, adminAddress);
    }
    // Any admin-specific methods would go here
}
