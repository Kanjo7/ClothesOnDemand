import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTShirt {

    // Konstruktor
    public MenuTShirt() {
    }

    // Användaren väljer material för Tshirt
    public void menuMaterial(TShirtBuilder tShirtBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj material");
            System.out.println("1. Bomull");
            System.out.println("2. Linne");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        tShirtBuilder.addMaterial("Bomull");
                        return;
                    case 2:
                        tShirtBuilder.addMaterial("Linne");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuMaterial(tShirtBuilder);
                return;
            }
        }
    }

    // Användaren väljer armlängd för Tshirt
    public void menuSleeves(TShirtBuilder tShirtBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj armlängd");
            System.out.println("1. 13");
            System.out.println("2. 19");
            System.out.print("Ditt val:");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        tShirtBuilder.addSleeves("13");
                        return;
                    case 2:
                        tShirtBuilder.addSleeves("19");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuSleeves(tShirtBuilder);
                return;
            }
        }
    }

    // Användaren väljer krage för Tshirt
    public void menuNeck(TShirtBuilder tShirtBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj krage");
            System.out.println("1. Rund hals");
            System.out.println("2. V-ringad");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        tShirtBuilder.addNeck("Rund hals");
                        return;
                    case 2:
                        tShirtBuilder.addNeck("V-ringad");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuNeck(tShirtBuilder);
                return;
            }
        }
    }
}