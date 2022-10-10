public class Person extends Customer{
    // field:
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    // setter:
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    // getter:
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getNationalIdentity() {
        return nationalIdentity;
    }

}
