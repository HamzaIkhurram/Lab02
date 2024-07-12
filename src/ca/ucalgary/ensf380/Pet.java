// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

// This class represents a Pet with details like name, breed, age, and special needs
public class Pet {
    private String petName;
    private String petBreed;
    private int petAge;
    private String petSpecialNeeds;
    private CareProfile petCareProfile;

    // Constructor to initialize a pet
    public Pet(String petName, String petBreed, int petAge, String petSpecialNeeds) {
        this.petName = petName;
        this.petBreed = petBreed;
        this.petAge = petAge;
        this.petSpecialNeeds = petSpecialNeeds;
        this.petCareProfile = new CareProfile(); // Every pet has a care profile
    }

    // Getters and setters to access and modify pet details
    public String getPetName() { return petName; }
    public void setPetName(String petName) { this.petName = petName; }

    public String getPetBreed() { return petBreed; }
    public void setPetBreed(String petBreed) { this.petBreed = petBreed; }

    public int getPetAge() { return petAge; }
    public void setPetAge(int petAge) { this.petAge = petAge; }

    public String getPetSpecialNeeds() { return petSpecialNeeds; }
    public void setPetSpecialNeeds(String petSpecialNeeds) { this.petSpecialNeeds = petSpecialNeeds; }

    public CareProfile getPetCareProfile() { return petCareProfile; }
}


