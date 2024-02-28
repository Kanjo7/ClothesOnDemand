import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPants {
    public MenuPants() {
    }

    public void menuMaterial(PantBuilder pantBuilder) {

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
                        pantBuilder.addMaterial("Bomull");
                        return;
                    case 2:
                        pantBuilder.addMaterial("Linne");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuMaterial(pantBuilder);
                return;
            }
        }
    }

    public void menuFit(PantBuilder pantBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj passform");
            System.out.println("1. Regular fit");
            System.out.println("2. Slim fit");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        pantBuilder.addFit("Regular fit");
                        return;
                    case 2:
                        pantBuilder.addFit("Slim fit");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuFit(pantBuilder);
                return;
            }
        }
    }

    public void menuType(PantBuilder pantBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj typ");
            System.out.println("1. Jeans");
            System.out.println("2. Chinos");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        pantBuilder.addType("Jeans");
                        return;
                    case 2:
                        pantBuilder.addType("Chinos");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuType(pantBuilder);
                return;
            }
        }
    }
}