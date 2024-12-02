// Employee working in the theme park, will extend Person class

public class Employee extends Person {
    
    // Instance variables that will be specific to employee
    private String jobTitle;
    private String employeeID;

    // Default constructor
    public Employee() {}

    // Parameterised constructor for both Person & Employee details
    public Employee(String name, int age, String email, String jobTitle, String employeeID) {
        super (name, age, email);           // Call to Person constructor
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
    }

    // Getter & Setter for job title & employee ID
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }

    public String getEmployeeID() { return employeeID; }
    public void setEmployeeID (String employeeID) { this.employeeID = employeeID; }
}
