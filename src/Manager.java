public class Manager {
    // Fields
    private Script myScript = null;
    private ContactList contacts = null;

    // Constructor
    private Manager() {
        createObject();
    }

    // Singleton
    public static Manager getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Manager INSTANCE = new Manager();
    }

    // Methods
    private void createObject() {
        myScript = new Script();
        contacts = new ContactList();
    }

    public void run() {
        boolean finish = true;
        while (finish) {
            int task = InputCollector.getInt(myScript.getScript());

            switch (task) {
                case 1:
                    listAllContracts();
                    continue;
                case 2:
                    addNewContacts();
                    continue;
                case 3:
                    removeContact();
                    continue;
                case 4:
                    updateContact();
                    continue;
                case 5:
                    System.out.println("Bye!");
                    finish = false;
                    break;
                default:
                    System.out.println(String.format(myScript.getScript(19), 1, 5));
            }
        }

    }

    private void listAllContracts() {
        System.out.println(contacts.toString());
    }

    private void addNewContacts() {
        contacts.add(makeContact());
        System.out.println(myScript.getScript(13));
    }

    private void removeContact() {
        int index = 0;
        listAllContracts();
        while (true) {
            index = InputCollector.getInt(myScript.getScript(14));
            try {
                System.out.println(myScript.getScript(15) + ' ' + contacts.remove(index).getName());
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(String.format(myScript.getScript(19), 0, contacts.size() - 1));
            }
        }
    }

    private void updateContact() {
        int index = 0;
        Contact before = null;

        listAllContracts();
        while (true) {
            index = InputCollector.getInt(myScript.getScript(16));
            try {
                before = contacts.getContact(index);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println(String.format(myScript.getScript(19), 0, contacts.size() - 1));
            }
        }
        Contact after = makeContact();
        contacts.setContact(index, after);
        System.out.println(myScript.getScript(17) + ' ' + before.toString() + " to " + after.toString());
    }

    private Contact makeContact() {
        String name = "", mobile = "";

        while (name.isEmpty()) name = InputCollector.getUserInput(myScript.getScript(8));
        while (mobile.isEmpty()) mobile = InputCollector.getUserInput(myScript.getScript(9));
        String work = InputCollector.getUserInput(myScript.getScript(10));
        String home = InputCollector.getUserInput(myScript.getScript(11));
        String city = InputCollector.getUserInput(myScript.getScript(12));

        return new Contact(name, mobile, work, home, city);
    }

//    private boolean isInteger(String strTemp) {
//        boolean result = true;
//        try {
//            int temp = Integer.getInteger(strTemp);
//        } catch (Exception e) {
//            result = false;
//        }
//        return result;
//    }

}
