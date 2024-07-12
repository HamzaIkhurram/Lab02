// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

// This class represents a care profile for a pet, including feeding instructions and medication details
public class CareProfile {
    private String feedingInstructions;
    private String medicationList;
    private String medicationInstructions;

    // Getters and setters to access and modify care profile details
    public String getFeedingInstructions() { return feedingInstructions; }
    public void setFeedingInstructions(String feedingInstructions) { this.feedingInstructions = feedingInstructions; }

    public String getMedicationList() { return medicationList; }
    public void setMedicationList(String medicationList) { this.medicationList = medicationList; }

    public String getMedicationInstructions() { return medicationInstructions; }
    public void setMedicationInstructions(String medicationInstructions) { this.medicationInstructions = medicationInstructions; }
}
