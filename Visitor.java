import java.util.Date;              // Import for date handling

// Visitor of the theme park, extending the Person class
public class Visitor extends Person { 
    
    // Instance variables for visitor (specific)
    private String ticketID;            // Ticket ID of visitor
    private Date visitDate;              // Visit date of the visitor

    // Default constructor
    public Visitor() {}

    // Parameterised constructor for both Person & Visitor details
    public Visitor (String name, int age, String email, String ticketID, Date visitDate) {
        super (name, age, email);           // Call to Person constructor
        this.ticketID = ticketID;
        this.visitDate = visitDate;
    }
}
