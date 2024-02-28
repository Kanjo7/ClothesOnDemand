import java.util.Scanner;

public class LengthCommand implements CommandInterface {

    @Override
    public void execute(Pants pant) {
        System.out.println("1. 32");
        System.out.println("2. 29");
        System.out.print("Välj byxlängd: ");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("Klipper önskad byxlängd 33");
                break;
            case 2:
                System.out.println("Klipper önskad byxlängd 29");
                break;
        }
    }

    @Override
    public void execute(TShirt tShirt) {
    }

    @Override
    public void execute(Skirt skirt) {
    }
}
