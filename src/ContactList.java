import java.util.ArrayList;

public class ContactList {
    // Fields
    private ArrayList<Contact> contacts = null;

    // Constructor
    public ContactList() {
        contacts = new ArrayList<>();

        //* - remove first slash for
        contacts.add(new Contact(
                "Richard Cho",
                "778-710-7309",
                "",
                "",
                "New Westminster"
        ));
        contacts.add(new Contact(
                "Derrick Park",
                "123-456-7890",
                "098-765-4321",
                "",
                "Vancouver"
        ));
        contacts.add(new Contact(
                "Miranda Kerr",
                "098-123-1431",
                "",
                "123-123-1234",
                ""
        ));
        contacts.add(new Contact(
                "Taehan Kim",
                "456-321-0987",
                "",
                "",
                "Goyang-Si"
        ));
        //*/
    }

    // Methods
    public boolean add(Contact temp) {
        return contacts.add(temp);
    }

    public Contact remove(int index) {
        return contacts.remove(index);
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public Contact setContact(int index, Contact temp) {
        return contacts.set(index, temp);
    }

    public int size() {
        return this.contacts.size();
    }

    @Override
    public String toString() {
        String result = "";
        int i = 0;

        for (Contact contact : contacts)
            result += i++ + ". " + contact.toString() + "\n";

        return result.trim();
    }
}
