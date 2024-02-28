import java.util.Scanner;

public class MenuCustomer {

    public MenuCustomer() {
    }

    public void addName(Customer customer) {
        System.out.print("Namn: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.print("Efternamn: ");
        Scanner scanner1 = new Scanner(System.in);
        String userInput1 = scanner1.next();
        customer.setName(userInput + " " + userInput1);
    }

    public void addAddress(Customer customer) {
        System.out.print("Adress: ");
        Scanner scanner = new Scanner(System.in);
        String userInputAddress = scanner.nextLine();
        customer.setAddress(userInputAddress);
    }

    public void addEmail(Customer customer) {
        System.out.print("Email: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        customer.setEmail(userInput);
    }
}
