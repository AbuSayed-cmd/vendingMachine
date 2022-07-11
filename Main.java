import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t*******************************************");
        System.out.println("\t         WELLCOME TO VENDING Machine       ");
        System.out.println("\t*******************************************");
        Item [][] items = new Item[][] {
                {new Item("Pepsi", 0.49, 5), new Item("kitkat", 1.99, 3), new Item("Donut", 1.99, 3)},
                {new Item("Cola", 0.49, 6), new Item("Snikers", 1.99, 5), new Item("cake", 1.99, 3)},
                {new Item("Fanta", 0.49, 4), new Item("Raffalo", 1.99, 8), new Item("Cookie", 1.99, 3)},
        };

        while (true){
                Machine machine = new Machine(items);
                System.out.println(machine);
                System.out.println("Pick a row: ");
                int row = scan.nextInt();

                System.out.println("Pick a spot in a row: ");
                int spot =scan.nextInt();

                boolean dispense = machine.Dispense(row, spot);
                System.out.println("\n" +machine);

                if (dispense == true){
                    System.out.println("\n Enjoy your Drink! press 1 to purchase another:");
                } else {
                    System.out.println("\nSory, we are out of this item. Press  1 to purchanse another item");
                }

                if(scan.nextInt() != 1){
                    break;
                }
        }


        //machine.Dispense(0, 1);
        //machine.Dispense(0,0);
        //System.out.println(machine.getItem(0,1));
        //System.out.println(machine.getItem(0,0));
        //Item item;
        //item = machine.getItem(2,1);
        //item.setPrice(10.99);
        //machine.setItem(item, 2 , 1);
        //System.out.println(machine.getItem (2,1));
    }
}
