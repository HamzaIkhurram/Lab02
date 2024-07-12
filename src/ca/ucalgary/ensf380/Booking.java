// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.Date;

// This class represents a booking for a pet at the facility
public class Booking {
    private Date bookingDate;
    private Client bookingClient;
    private Pet bookingPet;

    // Constructor to initialize a booking
    public Booking(Date bookingDate, Client bookingClient, Pet bookingPet) {
        this.bookingDate = bookingDate;
        this.bookingClient = bookingClient;
        this.bookingPet = bookingPet;
    }

    // Getters and setters to access and modify booking details
    public Date getBookingDate() { return bookingDate; }
    public void setBookingDate(Date bookingDate) { this.bookingDate = bookingDate; }

    public Client getBookingClient() { return bookingClient; }
    public void setBookingClient(Client bookingClient) { this.bookingClient = bookingClient; }

    public Pet getBookingPet() { return bookingPet; }
    public void setBookingPet(Pet bookingPet) { this.bookingPet = bookingPet; }
}
