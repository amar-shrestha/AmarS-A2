// Will represent ride in the park

import java.util.Queue;

public class Ride implements RideInterface {
    
    // Variables to represent ride details
    private String rideName;                                         // Name of the ride in theme park
    private int capacity;                                            // Max capacity of ride
    private Employee assignedEmployee;                               // Employee that will be assigned to operate the ride
    private Queue<Visitor> visitorQueue = new LinkedList<>();       // Queue to manage visitors waiting for the ride
    private LinkedList<Visitor> rideHistory = new LinkedList<>();   // List to manage ride history
    
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
        System.out.println ("Running one cycle of the ride. ");
    }
    
    @Override
    public void addVisitorToHistory (Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println ("Visitor added to ride History. ");
    }
}
