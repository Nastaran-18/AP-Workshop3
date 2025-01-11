import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1- contacts -a <contact firstName> <contact lastName>\n" +
                "2- contacts -r <contact firstName> <contact lastName>\n" +
                "3- show -g <group name>\n" +
                "4- show -c <contact firstName> <contact lastName>\n" +
                "5- show\n" +
                "6- exit");
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[1];

            switch (command) {
                    case "-a":
                        String firstName = parts[2];
                        String lastName = parts[3];
                        // Get other required details for contact
                        System.out.println("Please enter contact's group");

                        
                        break;

                    case "-r":
                        firstName = parts[2];
                        lastName = parts[3];
                        if (phoneBook.deleteContact(firstName, lastName)) {
                            System.out.println("Contact removed.");
                        } else {
                            System.out.println("Contact not found.");
                        }
                        break;

                    case "show":
                        if (parts.length == 3 && parts[2].equals("-g")) {
                            String group = parts[3];
                            Contact[] groupContacts = phoneBook.findContacts(group);
                            if (groupContacts != null) {
                                for (Contact c : groupContacts) {
                                    System.out.println(c);
                                }
                            } else {
                                System.out.println("No contacts found in this group.");
                            }
                        } else if (parts.length == 4 && parts[2].equals("-c")) {
                            firstName = parts[3];
                            lastName = parts[4];
                            Contact foundContact = phoneBook.findContact(firstName, lastName);
                            if (foundContact != null) {
                                System.out.println(foundContact);
                            } else {
                                System.out.println("Contact not found.");
                            }
                        } else {
                            phoneBook.printContacts();
                        }
                        break;

                case "exit":
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}
