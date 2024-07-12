// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.Date;

// This class represents a payment made by a client
public class Payment {
    private double paymentAmount;
    private Date paymentDate;
    private Client paymentClient;

    // Constructor to initialize a payment
    public Payment(double paymentAmount, Date paymentDate, Client paymentClient) {
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentClient = paymentClient;
    }

    // Getters and setters to access and modify payment details
    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }

    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

    public Client getPaymentClient() { return paymentClient; }
    public void setPaymentClient(Client paymentClient) { this.paymentClient = paymentClient; }
}
