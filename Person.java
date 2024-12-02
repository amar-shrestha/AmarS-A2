// Person with basic attributes

public class Person {
    private String name;
    private int age;
    private String email;

    // Default constructor
    public Person() {}

    // Parameterised constructor to start a person's details
    public Person (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter and Setter for name, age & email
    public String getName() { return name; }                    // Getter
    public void setName (String name) { this.name = name; }     // Setter

    public int getAge() { return age; }                         // Getter
    public void setAge (int age) { this.age = age; }            // Setter

    public String getEmail() { return email; }                  // Getter
    public void setEmail (String email) { this.email = email; } // Setter
}
