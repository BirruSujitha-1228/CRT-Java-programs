import java.util.HashMap;
import java.util.Scanner;

public class SimplePhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\nPhone Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Switch statement
            switch (choice) {
                case 1:
                    // Add contact
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    // Check if name already exists
                    if (phoneBook.containsKey(name)) {
                        System.out.println("This contact already exists. Overwriting...");
                    }

                    System.out.print("Enter phone number: ");
                    String number = scanner.nextLine();
                    phoneBook.put(name, number);
                    System.out.println("Contact added.");
                    break;

                case 2:
                    // Display contacts
                    if (phoneBook.isEmpty()) {
                        System.out.println("Phone book is empty.");
                    } else {
                        System.out.println("Contacts:");
                        for (String contactName : phoneBook.keySet()) {
                            System.out.println(contactName + ": " + phoneBook.get(contactName));
                        }
                    }
                    break;

                case 3:
                    // Delete contact
                    System.out.print("Enter name of contact to delete: ");
                    String deleteName = scanner.nextLine();

                    if (phoneBook.containsKey(deleteName)) {
                        phoneBook.remove(deleteName);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the phone book.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }

        } while (choice != 4);
		//applying bubble sort technique;
		String[] name ={name};
		//before sorting contact names
        for(String names:name){
			System.out.print(names + " ");
        }

        // Sort the array alphabetically
        Arrays.sort(name);

        System.out.println("\nAfter sorting:");
        for (String names : name) {
            System.out.print(name + " ");
		}
			

        scanner.close();
    }
}
