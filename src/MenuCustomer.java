import java.util.Scanner;

public class MenuCustomer {

    // Konstruktor
    public MenuCustomer() {
    }

    // Användaren fyller i sitt namn
    public void addName(Customer customer) {
        System.out.print("Namn: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.print("Efternamn: ");
        Scanner scanner1 = new Scanner(System.in);
        String userInput1 = scanner1.next();
        customer.setName(userInput + " " + userInput1);
    }

    // Användaren fyller i sin adress
    public void addAddress(Customer customer) {
        System.out.print("Adress: ");
        Scanner scanner = new Scanner(System.in);
        String userInputAddress = scanner.nextLine();
        customer.setAddress(userInputAddress);
    }

    // Användaren fyller i sitt mail
    public void addEmail(Customer customer) {
        System.out.print("Email: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        customer.setEmail(userInput);
    }
}
