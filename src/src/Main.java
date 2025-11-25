import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n Contact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    contacts.add(name);
                    System.out.println(" Contact added!");
                }
                case 2 -> {
                    System.out.println("\n Contact List:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter contact number to remove: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < contacts.size()) {
                        contacts.remove(index);
                        System.out.println("🗑️ Contact removed!");
                    } else {
                        System.out.println(" Invalid number!");
                    }
                }
                case 4 -> {
                    System.out.println(" Exiting program...");
                    return;
                }
                default -> System.out.println(" Invalid option, try again.");
            }
        }
    }
}
