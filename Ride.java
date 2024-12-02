// Will represent ride in the park
public class Ride {
    
    // Variables to represent ride details
    private String rideName;                            // Name of the ride in theme park
    private int capacity;                               // Max capacity of ride
    private Employee assignedEmployee;                  // Employee that will be assigned to operate the ride

    
    // Default constructor
    public Ride() {}

    // Parameterised constructor to start the ride details
    public Ride (String rideName, int capacity, Employee assignedEmployee) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.assignedEmployee = assignedEmployee;
    }
}
