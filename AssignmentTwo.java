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
    public void partFourA () {}                 // part FourA will go here

    public void partFourB () {}                 // part FourB will go here

    public void partFive () {}                  // part Five will go here

    public void partSix () {}                   // part Six will go here

    public void partSeven () {}                 // part Seven will go here

}
