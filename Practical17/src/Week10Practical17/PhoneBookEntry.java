package Week10Practical17;

// This class represents an entry in a phone book
public class PhoneBookEntry {

    // Declare variables for each piece of information about the entry
    private String fullName;    //
    private String phoneNumber;
    private String email;
    private String address;

    public PhoneBookEntry(String fullName, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Generating Getters and setters for each variable
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Override the toString method to return a human friendly representation of the phone book entry
    @Override
    public String toString() {
        return "\nFull Name = " + fullName +
                "\nPhone Number = " + phoneNumber + '\'' +
                "\nEmail = " + email + '\'' +
                "\nAddress = " + address + '\'';
    }
}
