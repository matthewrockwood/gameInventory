public class Main {
    public static void main(String[] args) {
        gameObject sword = new gameObject("Sword", 1);
        gameObject shield = new gameObject("Shield", 2);
        gameObject bow = new gameObject("Bow", 3);

        Inventory inv1 = new Inventory("Matt", 1);

        inv1.addItem(sword);
        inv1.addItem(shield);
        inv1.addItem(bow);


        inv1.showInv();

        inv1.removeItem(4);
        inv1.removeItem(2); //will remove the last item

        inv1.showInv();

    }
}