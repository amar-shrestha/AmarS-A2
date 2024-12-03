// Interface to define operations for theme park ride

public class RideInterface {
    
    // Add visitor to the queue
    void addVisitorToQueue (Visitor visitor);

    // Remove visitor for the queue
    void removeVisitorFromQueue ();

    // Print the list of visitors in queue
    void printQueue ();

    // Run a cycle of the ridde
    void runOneCycle ();

    // Add visitor to Ride history
    void addVisitorToHistory (Visitor visitor);

    // Check if visitor is in ride history
    boolean checkVisitorFromHistory (Visitor visitor);

    // Return number of visitors in ride history
    int numberOfVisitors ();

    // Print ride history
    void printRideHistory ();
}
