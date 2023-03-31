package Week10Practical17;

// This class represents a user who can interact with a phone book
public class User {
    public static void main(String[] args) {

        // Create a new phone book
        PhoneBook phoneBook = new PhoneBook();

        // Insert some phone book entries into the phone book
        phoneBook.insertPhoneBookEntry("Mahadi Hasan Rifat","07448042393","mahadihasan0307@gmail.com","5 Rose dale Avenue,Huddersfield");
        phoneBook.insertPhoneBookEntry("Charlotte Rawlinson","07447563457","charlotterawlinson@gmail.com","124 Greenlea Court,Huddersfield");
        phoneBook.insertPhoneBookEntry("Isaac Murphy","07446357567","isaacmurphy@gmail.com","19 View Street,Huddersfield");
        phoneBook.insertPhoneBookEntry("Molly Baker","07445425356","mollybaker@gmail.com","124 Stile Common Road,Huddersfield");
        phoneBook.insertPhoneBookEntry("Beccie Evans","07445252676","beccieevans@gmail.com","60 Ravensnowle Road,Huddersfield");

        // Print all the phone book entries
        phoneBook.printAllPhoneBookEntries();

        // Print a specific phone book entry
        System.out.println("**Show Individual Details**");
        phoneBook.printPhoneBookEntry("Molly Baker");


        // Try to print a phone book entry that doesn't exist
        phoneBook.printPhoneBookEntry("Isaac Baker");

        // Update a phone book entry
        phoneBook.updatePhoneBookEntry("Mahadi Hasan Rifat","07448042393","mahadihasan@icloud.com","5 Rose dale Avenue,Huddersfield");

        // Print the updated phone book entry
        phoneBook.printPhoneBookEntry("Mahadi Hasan Rifat");

        // Delete a phone book entry
        phoneBook.deletePhoneBookEntry("Isaac Murphy");

        // Print all the phone book entries again
        phoneBook.printAllPhoneBookEntries();

    }
}
