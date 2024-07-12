// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.Date;

// This class represents a notification message
public class Notification {
    private String notificationMessage;
    private Date notificationDate;

    // Constructor to initialize a notification
    public Notification(String notificationMessage, Date notificationDate) {
        this.notificationMessage = notificationMessage;
        this.notificationDate = notificationDate;
    }

    // Getters and setters to access and modify notification details
    public String getNotificationMessage() { return notificationMessage; }
    public void setNotificationMessage(String notificationMessage) { this.notificationMessage = notificationMessage; }

    public Date getNotificationDate() { return notificationDate; }
    public void setNotificationDate(Date notificationDate) { this.notificationDate = notificationDate; }
}
