import java.util.Scanner;

public class SizeCommand implements CommandInterface {
    @Override
    public void execute(Pants pant) {
        System.out.println("1. Medium");
        System.out.println("2. Small");
        System.out.print("Välj storlek: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Byxorna har storleken Medium\n");
                break;
            case 2:
                System.out.println("Byxorna har storleken Small\n");
                break;
        }
    }

    @Override
    public void execute(TShirt tShirt) {
        System.out.println("1. Large");
        System.out.println("2. Medium");
        System.out.print("Välj storlek: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Tshirt har storleken Large\n");
                break;
            case 2:
                System.out.println("Tshirt har storleken Medium\n");
                break;
        }
    }

    @Override
    public void execute(Skirt skirt) {
        System.out.println("1. Small");
        System.out.println("2. Large");
        System.out.print("Välj storlek: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Kjolen har storleken Large\n");
                break;
            case 2:
                System.out.println("Kjolen har storleken Medium\n");
                break;
        }
    }
}
