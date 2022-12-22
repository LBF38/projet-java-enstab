package comptes_crediteurs;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("First name: %s\nLast name: %s\nSocial security number: %s", firstName, lastName,
                socialSecurityNumber);
    }
}
