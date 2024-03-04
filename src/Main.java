import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Pipeline
        PipelineCommand pipelineCommand = new PipelineCommand();

        pipelineCommand.addInterface(new CommandColor());
        pipelineCommand.addInterface(new SizeCommand());
        pipelineCommand.addInterface(new LengthCommand());

        // Objekt
        CEO ceo = new CEO();
        Customer customer = new Customer();

        MenuPants menuPants = new MenuPants();
        MenuSkirt menuSkirt = new MenuSkirt();
        MenuTShirt menuTShirt = new MenuTShirt();
        MenuCustomer menuCustomer = new MenuCustomer();

        Receipt receipt = new Receipt();

        // Lägger in värden i kund
        menuCustomer.addName(customer);
        menuCustomer.addAddress(customer);
        menuCustomer.addEmail(customer);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            Pants pants = new Pants();
            Skirt skirt = new Skirt();
            TShirt tShirt = new TShirt();

            // Meddelar CEO
            pants.addPropertyChangeListener(ceo);
            skirt.addPropertyChangeListener(ceo);
            tShirt.addPropertyChangeListener(ceo);

            System.out.println("");
            System.out.println("Vad vill du köpa? ");
            System.out.println("1. Byxa " + pants.getPrice());
            System.out.println("2. Kjol " + skirt.getPrice());
            System.out.println("3. Tshirt " + tShirt.getPrice());
            System.out.println("");
            System.out.print("Ditt val: ");

            int userChoice = scanner.nextInt();
            switch (userChoice) {

                case 1:
                    PantBuilder pantBuilder = new PantBuilder();
                    menuPants.menuMaterial(pantBuilder);
                    menuPants.menuFit(pantBuilder);
                    menuPants.menuType(pantBuilder);
                    Pants orderPants = pantBuilder.build();
                    System.out.println("---------------------------------------------------");
                    // Skickar meddelande till CEO om att en order är lagd
                    pants.setReceivedOrder(true);
                    System.out.println("---------------------------------------------------");
                    pipelineCommand.useCommand(orderPants);
                    System.out.println("---------------------------------------------------");
                    // Skickar meddelande till CEO är färdig tillverkad
                    pants.setFinishedManufacturing(true);
                    System.out.println("---------------------------------------------------");
                    // Kvitto
                    receipt.pantsReceipt(orderPants, customer);
                    return;

                case 2:
                    SkirtBuilder skirtBuilder = new SkirtBuilder();
                    menuSkirt.menuMaterial(skirtBuilder);
                    menuSkirt.menuWaistline(skirtBuilder);
                    menuSkirt.menuPattern(skirtBuilder);
                    Skirt orderSkirt = skirtBuilder.build();
                    System.out.println("---------------------------------------------------");
                    skirt.setReceivedOrder(true);
                    System.out.println("---------------------------------------------------");
                    pipelineCommand.useCommand(orderSkirt);
                    System.out.println("---------------------------------------------------");
                    skirt.setFinishedManufacturing(true);
                    System.out.println("---------------------------------------------------");
                    receipt.skirtReceipt(orderSkirt, customer);
                    return;

                case 3:
                    TShirtBuilder tShirtBuilder = new TShirtBuilder();
                    menuTShirt.menuMaterial(tShirtBuilder);
                    menuTShirt.menuSleeves(tShirtBuilder);
                    menuTShirt.menuNeck(tShirtBuilder);
                    TShirt orderTshirt = tShirtBuilder.build();
                    System.out.println("---------------------------------------------------");
                    tShirt.setReceivedOrder(true);
                    System.out.println("---------------------------------------------------");
                    pipelineCommand.useCommand(orderTshirt);
                    System.out.println("---------------------------------------------------");
                    tShirt.setFinishedManufacturing(true);
                    System.out.println("---------------------------------------------------");
                    receipt.tShirtReceipt(orderTshirt, customer);
                    return;
            }
        }
    }
}