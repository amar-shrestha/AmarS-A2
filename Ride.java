// Will represent ride in the park

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    
    // Variables to represent ride details
    private String rideName;                                         // Name of the ride in theme park
    private int capacity;                                            // Max capacity of ride
    private Employee assignedEmployee;                               // Employee that will be assigned to operate the ride
    private Queue<Visitor> visitorQueue = new LinkedList<>();       // Queue to manage visitors waiting for the ride
    private LinkedList<Visitor> rideHistory = new LinkedList<>();   // List to manage ride history
    private int maxRider;                                           // Max visitor per ride cycle
    private int numOfCycles = 0;                                    // Number of cycles run (default 0)

    // Default constructor
    public Ride() {}

    // Parameterised constructor to start the ride details
    public Ride (String rideName, int capacity, Employee assignedEmployee) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.assignedEmployee = assignedEmployee;
    }

    // Getter & Setter for ride name, capacity & assigned employee
    public String getRideName() { return rideName; }                            // Getter
    public void setRideName (String rideName) { this.rideName = rideName; }     // Setter

    public int getCapacity() { return capacity; }                               // Getter
    public void setCapacity (int capacity) {this.capacity = capacity; }         // Setter

    public Employee getAssignedEmployee() { return assignedEmployee; }          // Getter
    public void setAssignedEmployee (Employee assignedEmployee) {               // Setter
        this.assignedEmployee = assignedEmployee; }

    @Override
    public void addVisitorToQueue (Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println ("Visitor added to the queue.");
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removed = visitorQueue.poll();
            System.out.println ("Removed visitor: " + removed.getName());
        } else {
            System.out.println ("Queue is empty. ");
        }
    }
    
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println ("Queue is empty. ");
        } else {
            System.out.println ("Visitor in queue: ");
            for (Visitor visitor : visitorQueue) {
                System.out.println ("-" + visitor.getName());
            }
        }
    }

    @Override
    public void runOneCycle() {

        // Check for assigned operator and visitors in queue before running
        if (assignedEmployee == null) {
            System.out.println ("Cannot run the ride: No operator assigned. ");
            return;
        }
        
        if (visitorQueue.isEmpty()) {
            System.out.println ("Cannot run the ride: No visitors in the queue. ")
            return;
        }

        System.out.println ("Starting a new ride cycle... ");
        int visitorsThisCycle = 0;
        
        // Remove visitors from queue up to maxRider and add them to history
        while (!visitorQueue.isEmpty() && visitorsThisCycle < maxRider) {
            Visitor visitor = visitorQueue.poll();                                          // Remove visitor from the queue
            addVisitorToHistory(visitor);                                                   // Add Visitor to ride history
            visitorsThisCycle++;
        }

        numOfCycles++;                                                                      // Increment the cycle count
        System.out.println ("Ride cycle complted. Visitors this cycle: " + visitorsThisCycle);
    }
    
    @Override
    public void addVisitorToHistory (Visitor visitor) {
        rideHistory.add(visitor);                                       // Add Visitor to ride history
        System.out.println ("Visitor added to ride History. ");
    }

    @Override
    public boolean checkVisitorFromHistory (Visitor visitor) {
        return rideHistory.contains (visitor);                          // Checks if visitor exists in history
    }

    @Override
    public int numberOfVisitors () {
        return rideHistory.size();                                      // Returns the size of ride history (Returns count of visitors who have taken the ride)
    }

    // Prints ride history using Iterator to iterate over the LinkedList.
    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println ("No visitors in ride history. ");
        } else {
            System.out.println ("Ride history: ");
            for (Visitor visitor : rideHistory) {
                System.out.println ("-" + visitor.getName());
            }
        }
    }

    // Sort ride history using a Comparator
    public void sortRideHistory() {
        rideHistory.sort (new VisitorSort());
        System.out.println ("Ride history has now been sorted. ");
    }

    // Method to export ride history to file
    public void exportRideHistory (String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                // Write visitor details in CSV format: Name, Age, Email, TicketID, visitDate
                writer.write (visitor.getName () + "," + visitor.getAge() + "," + visitor.getEmail() + "," + visitor.getTicketID() + "," + visitor.getVisitDate());
                writer.newLine();       // Move to the next line
            }
            System.out.println ("Ride history successfully exported to " + fileName);
        } catch (IOException e) {
            System.out.println ("Error exporting ride history: " + e.getMessage());     // prints error message if something goes wrong
        }
    }
}
