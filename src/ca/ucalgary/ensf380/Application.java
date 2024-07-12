// ENSF380 Lab02
// Farha Ahmed and Hamza Khurram
// Jul 11, 2024
package ca.ucalgary.ensf380;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// This is the main application class to run the YYC Pet Resort Management System
public class Application {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Client> clients = new ArrayList<>();
    private static List<Pet> pets = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();
    private static List<Employee> employees = new ArrayList<>();
    private static List<Notification> notifications = new ArrayList<>();
    private static List<Report> reports = new ArrayList<>();
    private static Facility facility = new Facility("YYC Pet Resort", "789 Maple St.");

    // Main method to run the application
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            // Display menu options
            System.out.println("Welcome to YYC Pet Resort Management System");
            System.out.println("1. Add Client");
            System.out.println("2. Add Pet");
            System.out.println("3. Make Booking");
            System.out.println("4. Record Payment");
            System.out.println("5. Add Employee");
            System.out.println("6. Add Notification");
            System.out.println("7. Add Report");
            System.out.println("8. Display Clients and Pets");
            System.out.println("9. Display Employees");
            System.out.println("10. Display Notifications");
            System.out.println("11. Display Reports");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            // Handle menu selection
            switch (choice) {
                case 1:
                    addClient();
                    break;
                case 2:
                    addPet();
                    break;
                case 3:
                    makeBooking();
                    break;
                case 4:
                    recordPayment();
                    break;
                case 5:
                    addEmployee();
                    break;
                case 6:
                    addNotification();
                    break;
                case 7:
                    addReport();
                    break;
                case 8:
                    displayClientsAndPets();
                    break;
                case 9:
                    displayEmployees();
                    break;
                case 10:
                    displayNotifications();
                    break;
                case 11:
                    displayReports();
                    break;
                case 12:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add a new client
    private static void addClient() {
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();
        System.out.print("Enter client phone number: ");
        String clientPhoneNumber = scanner.nextLine();
        System.out.print("Enter client address: ");
        String clientAddress = scanner.nextLine();
        clients.add(new Client(clientName, clientPhoneNumber, clientAddress));
        System.out.println("Client added successfully!");
    }

    // Method to add a new pet
    private static void addPet() {
        if (clients.isEmpty()) {
            System.out.println("Please add a client first.");
            return;
        }

        System.out.print("Enter pet name: ");
        String petName = scanner.nextLine();
        System.out.print("Enter pet breed: ");
        String petBreed = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int petAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter pet special needs: ");
        String petSpecialNeeds = scanner.nextLine();
        Pet pet = new Pet(petName, petBreed, petAge, petSpecialNeeds);
        pets.add(pet);

        System.out.println("Select owner:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i).getUserName());
        }
        int ownerIndex = Integer.parseInt(scanner.nextLine()) - 1;
        clients.get(ownerIndex).addClientPet(pet);

        System.out.println("Pet added successfully!");
    }

    // Method to make a booking for a pet
    private static void makeBooking() {
        if (clients.isEmpty() || pets.isEmpty()) {
            System.out.println("Please add a client and pet first.");
            return;
        }

        System.out.println("Select client:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i).getUserName());
        }
        int clientIndex = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println("Select pet:");
        for (int i = 0; i < pets.size(); i++) {
            System.out.println((i + 1) + ". " + pets.get(i).getPetName());
        }
        int petIndex = Integer.parseInt(scanner.nextLine()) - 1;

        Booking booking = new Booking(new Date(), clients.get(clientIndex), pets.get(petIndex));
        bookings.add(booking);
        clients.get(clientIndex).addClientBooking(booking);
        System.out.println("Booking made successfully!");
    }

    // Method to record a payment from a client
    private static void recordPayment() {
        if (clients.isEmpty()) {
            System.out.println("Please add a client first.");
            return;
        }

        System.out.println("Select client:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i + 1) + ". " + clients.get(i).getUserName());
        }
        int clientIndex = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Enter payment amount: ");
        double paymentAmount = Double.parseDouble(scanner.nextLine());

        Payment payment = new Payment(paymentAmount, new Date(), clients.get(clientIndex));
        payments.add(payment);
        clients.get(clientIndex).addClientPayment(payment);
        System.out.println("Payment recorded successfully!");
    }

    // Method to add a new employee
    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee phone number: ");
        String employeePhoneNumber = scanner.nextLine();
        System.out.print("Enter employee address: ");
        String employeeAddress = scanner.nextLine();
        Employee employee = new Employee(employeeName, employeePhoneNumber, employeeAddress);
        employees.add(employee);
        facility.addFacilityEmployee(employee);
        System.out.println("Employee added successfully!");
    }

    // Method to add a new notification
    private static void addNotification() {
        System.out.print("Enter notification message: ");
        String notificationMessage = scanner.nextLine();
        Notification notification = new Notification(notificationMessage, new Date());
        notifications.add(notification);
        System.out.println("Notification added successfully!");
    }

    // Method to add a new report
    private static void addReport() {
        System.out.print("Enter report details: ");
        String reportDetails = scanner.nextLine();
        Report report = new Report(reportDetails, new Date());
        reports.add(report);
        System.out.println("Report added successfully!");
    }

    // Method to display all clients and their pets
    private static void displayClientsAndPets() {
        System.out.println("Clients and their Pets:");
        for (Client client : clients) {
            System.out.println("Client: " + client.getUserName());
            for (Pet pet : client.getClientPets()) {
                System.out.println(" - Pet: " + pet.getPetName() + ", Breed: " + pet.getPetBreed() + ", Age: " + pet.getPetAge() + ", Special Needs: " + pet.getPetSpecialNeeds());
            }
        }
    }

    // Method to display all employees
    private static void displayEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getUserName() + ", Phone: " + employee.getUserPhoneNumber() + ", Address: " + employee.getUserAddress());
        }
    }

    // Method to display all notifications
    private static void displayNotifications() {
        System.out.println("Notifications:");
        for (Notification notification : notifications) {
            System.out.println("Notification: " + notification.getNotificationMessage() + ", Date: " + notification.getNotificationDate());
        }
    }

    // Method to display all reports
    private static void displayReports() {
        System.out.println("Reports:");
        for (Report report : reports) {
            System.out.println("Report: " + report.getReportDetails() + ", Date: " + report.getReportDate());
        }
    }
}


