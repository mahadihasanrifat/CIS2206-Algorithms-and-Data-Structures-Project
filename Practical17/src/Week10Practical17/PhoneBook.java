package Week10Practical17;

import java.util.HashMap;
import java.util.Map;

// This class represents a phone book that stores phone book entries
public class PhoneBook {

    // Use a HashMap to store phone book entries, with the full name as the key
    Map<String, PhoneBookEntry> phoneBookMap;

    // Constructor to create a new phone book
    public PhoneBook(){
        this.phoneBookMap = new HashMap();
    }

    // Method to insert a new phone book entry into the phone book
    public void insertPhoneBookEntry(String fullName ,String phoneNumber, String email,String address){
        PhoneBookEntry phoneBookEntry = new PhoneBookEntry(fullName, phoneNumber, email, address);
        // Check if the phone book already contains an entry with the same name
        // If it doesn't, add the new entry to the phone book
        // If it does, print an error message
        if (!this.phoneBookMap.containsKey(fullName)) {
            this.phoneBookMap.put(fullName, phoneBookEntry);
        } else {
            System.out.println("\n\nName duplication discovered");
            System.out.println("This person's name is already listed in the phone book\n");
        }
    }

    // Method to update an existing phone book entry
    public void updatePhoneBookEntry(String fullName ,String phoneNumber, String email,String address){
        System.out.println("\n**Updated Details in the Phone Book**");
        PhoneBookEntry phoneBookEntry = new PhoneBookEntry(fullName, phoneNumber, email, address);
        // Check if the phone book contains an entry with the given name
        // If it does, update the entry with the new information
        // If it doesn't, print an error message
        if (this.phoneBookMap.containsKey(fullName)) {
            this.phoneBookMap.put(fullName, phoneBookEntry);
        } else {
            System.out.println("\n\nFailure to locate the name");
            System.out.println("There is no phone book entry for this name");
        }
    }

    // Method to delete an existing phone book entry
    public void deletePhoneBookEntry(String fullName){
        // Check if the phone book contains an entry with the given name
        // If it does, delete the entry
        // If it doesn't, print an error message
        if (this.phoneBookMap.containsKey(fullName)) {
            this.phoneBookMap.remove(fullName);
        } else {
            System.out.println("\n\nFailure to locate the name");
            System.out.println("There is no phone book entry for this name");
        }
    }

    public void printPhoneBookEntry(String fullName) {
        // Check if the phone book contains an entry with the given name
        // If it does, print the entry
        // If it doesn't, print an error message
        if (this.phoneBookMap.containsKey(fullName)) {
            System.out.println(this.phoneBookMap.get(fullName));
        } else {
            System.out.println("\n\nFailure to locate the name");
            System.out.println("There is no phone book entry for this name");
        }
    }

    // Method to print all phone book entries
    public void printAllPhoneBookEntries() {
        System.out.println("\n++Phone Book All Entries**");
        // Loop through all the values in the phone book map and print them
        for (PhoneBookEntry entry : this.phoneBookMap.values()) {
            System.out.println(entry);
        }
        System.out.println("\n----------X----------\n");
    }

    // Override the toString method to return a string representation of the phone book
    @Override
    public String toString() {
        return "Phone Book = " + phoneBookMap;
    }

}
