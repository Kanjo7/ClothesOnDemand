public class Receipt {

    // konstruktor
    public Receipt() {
    }

    // Kundinformation och kvitto för ett par byxor
    public void pantsReceipt(Pants pants, Customer customer) {

        System.out.println("Kvitto");

        System.out.println("ID: " + customer.getId());
        System.out.println("Namn: " + customer.getName());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("---------------------------------------------------");

        System.out.println("Order ID " + pants.getId());
        System.out.println("Information om din order: ");
        System.out.println(pants.getName());
        System.out.println(pants.getMaterial());
        System.out.println(pants.getFit());
        System.out.println(pants.getType());
        System.out.println("Pris för byxorna: " + pants.getPrice() + " kronor");
    }

    // Kundinformation och kvitto för kjol
    public void skirtReceipt(Skirt skirt, Customer customer) {

        System.out.println("Kvitto");

        System.out.println("ID: " + customer.getId());
        System.out.println("Namn: " + customer.getName());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("---------------------------------------------------");

        System.out.println("Order ID " + skirt.getId());
        System.out.println("Information om din order: ");
        System.out.println(skirt.getName());
        System.out.println(skirt.getMaterial());
        System.out.println(skirt.getWaistline());
        System.out.println(skirt.getPattern());
        System.out.println("Pris för kjolen: " + skirt.getPrice() + " kronor");
    }

    // Kundinformation och kvitto för Tshirt
    public void tShirtReceipt(TShirt tShirt, Customer customer) {

        System.out.println("Kvitto");

        System.out.println("ID: " + customer.getId());
        System.out.println("Namn: " + customer.getName());
        System.out.println("Adress: " + customer.getAddress());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("---------------------------------------------------");

        System.out.println("Order ID: " + tShirt.getId());
        System.out.println("Information om din order: ");
        System.out.println(tShirt.getName());
        System.out.println(tShirt.getMaterial());
        System.out.println(tShirt.getSleeves());
        System.out.println(tShirt.getNeck());
        System.out.println("Pris för Tshirten: " + tShirt.getPrice() + " kronor");
    }
}
