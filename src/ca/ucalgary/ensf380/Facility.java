// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.ArrayList;
import java.util.List;

// This class represents a Facility where pets are boarded
public class Facility {
    private String facilityName;
    private String facilityLocation;
    private List<Employee> facilityEmployees;

    // Constructor to initialize a facility
    public Facility(String facilityName, String facilityLocation) {
        this.facilityName = facilityName;
        this.facilityLocation = facilityLocation;
        this.facilityEmployees = new ArrayList<>();
    }

    // Getters and setters to access and modify facility details
    public String getFacilityName() { return facilityName; }
    public void setFacilityName(String facilityName) { this.facilityName = facilityName; }

    public String getFacilityLocation() { return facilityLocation; }
    public void setFacilityLocation(String facilityLocation) { this.facilityLocation = facilityLocation; }

    // Methods to manage employees in the facility
    public void addFacilityEmployee(Employee employee) { facilityEmployees.add(employee); }
    public List<Employee> getFacilityEmployees() { return facilityEmployees; }
}

