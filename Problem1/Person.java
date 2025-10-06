package Problem1;
/**
 * Represents a person with first name, last name, and address
 */
public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    
    /**
     * Constructor for Person
     * @param firstName the first name
     * @param lastName the last name
     * @param address the address
     */
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
    // Accessor methods
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Address getAddress() {
        return address;
    }
    
    /**
    
     * @return formatted name and address string
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address.toString();
    }
    
    /**
     * Compares this Person with another for equality
     * @param obj the object to compare with
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return firstName.equals(person.firstName) &&
               lastName.equals(person.lastName) &&
               address.equals(person.address);
    }
}