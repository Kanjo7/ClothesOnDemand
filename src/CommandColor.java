import java.util.Scanner;

public class CommandColor implements CommandInterface {

    // Användaren väljer färg för ett par byxor
    @Override
    public void execute(Pants pant) {
        System.out.println("");
        System.out.println("1. Vit ");
        System.out.println("2. Svart ");
        System.out.print("Välj färg: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Byxorna färgas vitt\n");
                break;
            case 2:
                System.out.println("Byxorna färgas svart\n");
                break;
        }
    }

    // Användaren väljer färg för Tshirt
    @Override
    public void execute(TShirt tShirt) {
        System.out.println("");
        System.out.println("1. Röd ");
        System.out.println("2. Blå ");
        System.out.print("Välj färg: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Tshirt färgas Rött\n");
                break;
            case 2:
                System.out.println("Byxorna färgas Blått\n");
                break;
        }
    }

    // Användaren väljer färg för kjol
    @Override
    public void execute(Skirt skirt) {
        System.out.println("");
        System.out.println("1. Rosa ");
        System.out.println("2. Vit ");
        System.out.print("Välj färg: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Kjolen färgas Rosa\n");
                break;
            case 2:
                System.out.println("Kjolen färgas vitt\n");
                break;
        }
    }
}
