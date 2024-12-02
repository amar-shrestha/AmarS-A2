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

    // Getter & Setter for ride name, capacity & assigned employee
    public String getRideName() { return rideName; }                            // Getter
    public void setRideName (String rideName) { this.rideName = rideName; }     // Setter

    public int getCapacity() { return capacity; }                               // Getter
    public void setCapacity (int capacity) {this.capacity = capacity; }         // Setter

    public Employee getAssignedEmployee() { return assignedEmployee; }          // Getter
    public void setAssignedEmployee (Employee assignedEmployee) {               // Setter
        this.assignedEmployee = assignedEmployee; }
}
