// Main

public class AssignmentTwo {
    public static void main (String[] argas) {
        System.out.println ("Welcome to the Theme Park Management System!");
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }

    // Placeholder method for now
    public void partThree () {                  // part 3 will go here
    
        // Show queue functionality
        System.out.println ("Part 3: Queue Demonstration");

        // Creating ride instance
        Ride rollerCoaster = new Ride ("Roller Coaster", 20, null);

        // Creating visitor instances
        Visitor visitor1 = new Visitor ("Amar", 25, "amar@scu.edu.au", "T001", new java.util.Date());
        Visitor visitor2 = new Visitor ("Rachu", 24, "rachu@scu.edu.au", "T002", new java.util.Date());
        Visitor visitor3 = new Visitor ("Aadru", 2, "aadru@scu.edu.au", "T003", new java.util.Date());
        Visitor visitor4 = new Visitor ("Anju", 24, "anju@scu.edu.au", "T004", new java.util.Date());
        Visitor visitor5 = new Visitor ("Rajesh", 22, "rajesh@scu.edu.au", "T005", new java.util.Date());

        // Adding visitor to queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print queue
        rollerCoaster.printQueue();

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        // Print the queue after removing
        rollerCoaster.printQueue();

    }
    public void partFourA () {                          // part FourA will go here
        System.out.println ("Part 4A: Ride History Demo ");

        // Create a Ride instance
        Ride hyperCoaster = new Ride ("Hyper Coaster", 25, null);
        
        // Creating visitors
        Visitor visitor1 = new Visitor ("Amar", 25, "amar@scu.edu.au", "T001", new java.util.Date());
        Visitor visitor2 = new Visitor ("Rachu", 24, "rachu@scu.edu.au", "T002", new java.util.Date());
        Visitor visitor3 = new Visitor ("Aadru", 2, "aadru@scu.edu.au", "T003", new java.util.Date());

        // Add visitors to the ride history
        hyperCoaster.addVisitorToHistory(visitor1);
        hyperCoaster.addVisitorToHistory(visitor2);
        hyperCoaster.addVisitorToHistory(visitor3);

        // Print ride history
        hyperCoaster.printRideHistory();

        // Check if visitor in history
        System.out.println ("Is Amar in ride history? " + hyperCoaster.checkVisitorFromHistory(visitor1));
        
        // Print the number of visitors in history
        System.out.println ("Total visitors in ride history: " + hyperCoaster.numberOfVisitors());
    }
    public void partFourB () {                 // part FourB will go here
        System.out.println ("Part 4B: Ride History Sorting Demo");

        // Create a Ride instance
        Ride supermanEscape = new Ride (" Superman Escape", 15, null);

        // Create Visitor instances
        Visitor visitor1 = new Visitor ("Amar", 25, "amar@scu.edu.au", "T001", new java.util.Date());
        Visitor visitor2 = new Visitor ("Rachu", 24, "rachu@scu.edu.au", "T002", new java.util.Date());
        Visitor visitor3 = new Visitor ("Aadru", 2, "aadru@scu.edu.au", "T003", new java.util.Date());

        // Add visitors to ride history
        supermanEscape.addVisitorToHistory(visitor1);
        supermanEscape.addVisitorToHistory(visitor2);
        supermanEscape.addVisitorToHistory(visitor3);

        // Print unsorted history
        System.out.println ("Unsorted Ride History: ");
        supermanEscape.printRideHistory();

        // Sorting the history
        supermanEscape.sortRideHistory();

        // Print sorted history
        System.out.println ("Sorted Ride History: ");
        supermanEscape.printRideHistory();
    }
    public void partFive () {                   // part Five will go here
    System.out.println ("Part 5: Running Ride Cycle Demo. ");

    // Create a Ride instance
    Employee operator = new Employee("Shrestha", 35, "shrestha@scu.edu.au", "Operator", "Emp001");
    Ride rollerCoaster = new Ride ("Roller Coaster", 15, operator);
    rollerCoaster.setMaxRider(3);               // Set max riders per cycle

    // Create Visitor instances
    Visitor visitor1 = new Visitor ("Amar", 25, "amar@scu.edu.au", "T001", new java.util.Date());
    Visitor visitor2 = new Visitor ("Rachu", 24, "rachu@scu.edu.au", "T002", new java.util.Date());
    Visitor visitor3 = new Visitor ("Aadru", 2, "aadru@scu.edu.au", "T003", new java.util.Date());
    Visitor visitor4 = new Visitor ("Anju", 24, "anju@scu.edu.au", "T004", new java.util.Date());
    Visitor visitor5 = new Visitor ("Rajesh", 22, "rajesh@scu.edu.au", "T005", new java.util.Date());

    // Add visitors to the queue
    rollerCoaster.addVisitorToQueue(visitor1);
    rollerCoaster.addVisitorToQueue(visitor2);
    rollerCoaster.addVisitorToQueue(visitor3);
    rollerCoaster.addVisitorToQueue(visitor4);
    rollerCoaster.addVisitorToQueue(visitor5);

    // Print the queue before the ride
    System.out.println ("Queue before the ride: ");
    rollerCoaster.printQueue();

    // Run one cycle of the ride
    rollerCoaster.runOneCycle();
    
    // Print the Queue after the ride
    System.out.println ("Queue after the first cycle: ");
    rollerCoaster.printQueue();

    // Print the ride history
    System.out.println ("Ride history after the first cycle: ");
    rollerCoaster.printRideHistory();

    // Run another cycle
    rollerCoaster.runOneCycle();

    // Print the ride history after the second cycle
    System.out.println ("Ride history after the second cycle: ");
    rollerCoaster.printRideHistory();
    }
    public void partSix () {                   // part Six will go here
    System.out.println ("Part 6: Export Ride history Demo: ");

    // Create a Ride instance
    Ride hyperCoaster = new Ride ("Hyper Coaster", 25, null);

    // Create visitor instances
    Visitor visitor1 = new Visitor ("Amar", 25, "amar@scu.edu.au", "T001", new java.util.Date());
    Visitor visitor2 = new Visitor ("Rachu", 24, "rachu@scu.edu.au", "T002", new java.util.Date());
    Visitor visitor3 = new Visitor ("Aadru", 2, "aadru@scu.edu.au", "T003", new java.util.Date());

    // Add visitors to the ride history
    hyperCoaster.addVisitorToHistory(visitor1);
    hyperCoaster.addVisitorToHistory(visitor2);
    hyperCoaster.addVisitorToHistory(visitor3);

    // Export ride history to a file
    String fileName = "ride_history.csv";
    hyperCoaster.exportRideHistory (fileName); 
    }
    
    public void partSeven () {}                 // part Seven will go here

}
