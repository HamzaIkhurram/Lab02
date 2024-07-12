// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.ArrayList;
import java.util.List;

// This class represents a Client, who is a User with additional details about pets, bookings, and payments
public class Client extends User {
    private List<Pet> clientPets; // List of pets owned by the client
    private List<Booking> clientBookings; // List of bookings made by the client
    private List<Payment> clientPayments; // List of payments made by the client

    // Constructor to initialize a client
    public Client(String clientName, String clientPhoneNumber, String clientAddress) {
        super(clientName, clientPhoneNumber, clientAddress);
        this.clientPets = new ArrayList<>();
        this.clientBookings = new ArrayList<>();
        this.clientPayments = new ArrayList<>();
    }

    // Methods to manage pets, bookings, and payments
    public void addClientPet(Pet pet) { clientPets.add(pet); }
    public List<Pet> getClientPets() { return clientPets; }

    public void addClientBooking(Booking booking) { clientBookings.add(booking); }
    public List<Booking> getClientBookings() { return clientBookings; }

    public void addClientPayment(Payment payment) { clientPayments.add(payment); }
    public List<Payment> getClientPayments() { return clientPayments; }
}
