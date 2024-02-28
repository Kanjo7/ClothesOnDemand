import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSkirt {
    public MenuSkirt() {
    }

    public void menuMaterial(SkirtBuilder skirtBuilder) {

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
                        skirtBuilder.addMaterial("Bomull");
                        return;
                    case 2:
                        skirtBuilder.addMaterial("Linne");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuMaterial(skirtBuilder);
                return;
            }
        }
    }

    public void menuWaistline(SkirtBuilder skirtBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj midjemått");
            System.out.println("1. 36");
            System.out.println("2. 38");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        skirtBuilder.addWaistline("36");
                        return;
                    case 2:
                        skirtBuilder.addWaistline("38");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuWaistline(skirtBuilder);
                return;
            }
        }
    }

    public void menuPattern(SkirtBuilder skirtBuilder) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Välj mönster");
            System.out.println("1. Rutigt");
            System.out.println("2. Randigt");
            System.out.print("Ditt val: ");

            try {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        skirtBuilder.addPattern("Rutigt");
                        return;
                    case 2:
                        skirtBuilder.addPattern("Randigt");
                        return;
                    default:
                        System.out.println("Felaktigt val. Var god välj igen.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Felaktig inmatning. Var god ange ett heltal.");
                menuPattern(skirtBuilder);
                return;
            }
        }
    }
}