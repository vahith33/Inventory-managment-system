import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InventoryManagement {


    static List<Product> array = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    private void display() {
        System.out.println("1.add an item");
        System.out.println("2.display all the item");
        System.out.println("3.search an item");
        System.out.println("4.delete an item");
        System.out.println("5.update an item");
        System.out.println("6.calculate the inventory value");
        System.out.println("exit the application input!");
        System.out.println();
        System.out.println();
    }

    static public void addItem() {
        System.out.println("enter the item ID");
        int id = scanner.nextInt();

        System.out.println("enter the item name");
        String name = scanner.next();

        System.out.println("enter the item quantity");
        int quantity = scanner.nextInt();

        System.out.println("enter the item price");
        float price = scanner.nextInt();

        System.out.println("enter the item discount");
        int discount = scanner.nextInt();

        Product product = new Product(id, name, quantity, price, discount);
        array.add(product);
        System.out.println("product added successfully");
    }

    static private void displayItems() {
        for (Product product : array) {
            System.out.println("id is" + product.getId());
            System.out.println("name is" + product.getName());
            System.out.println("quantity is" + product.getQuantity());
            System.out.println("price is" + product.getPrice());
            System.out.println("discount is" + product.getDiscount());
        }

    }

    static private void search() {
        System.out.println("enter the item to be search");
        int ser = scanner.nextInt();
        for (Product product : array) {
            boolean found;
            if (ser == product.getId()) {
                found = false;
                System.out.println("id is" + product.getId());
                System.out.println("name is" + product.getName());
                System.out.println("quantity is" + product.getQuantity());
                System.out.println("price is" + product.getPrice());
                System.out.println("discount is" + product.getDiscount());

            }
            if (found = false) {
                System.out.println("not found");
            }
        }
    }

    static private void deleteItem() {
        System.out.println("enter the item to be delete");
        int del = scanner.nextInt();
        for (Product product : array) {
            boolean found;
            if (del == product.getId()) {
                array.remove(product);
            }
        }
    }

    static private void update() {
        System.out.println("enter the id");
        int i = scanner.nextInt();
        for (Product product : array) {
            if (i == product.getId()) {
                System.out.println("enter the new price");
                int np = scanner.nextInt();
                product.setPrice(np);

                System.out.println("enter the new name");
                String nop = scanner.next();
                product.setName(nop);

                System.out.println("enter the new quantity");
                int ntp = scanner.nextInt();
                product.setQuantity(ntp);

                System.out.println("enter the new discount");
                int ngp = scanner.nextInt();
                product.setDiscount(ngp);
            }
            }

    }

    static private void calculateTotal() {
        float total = 0;
        for(Product product:array){
            total=total+( product.getQuantity() * product.getPrice());
            System.out.println("the total is "+total);
        }
    }


    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        int choice;
        do{
            im.display();


        System.out.println("enter the choice");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addItem();
                break;

            case 2:
                displayItems();
                break;
            case 3:
                search();
                break;
            case 4:
                deleteItem();
                break;
            case 5:
                update();
                break;
            case 6:
                calculateTotal();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice");
        }
    } while (choice != 7);
    }
}







//        Product product = new Product( 1,"printer",10, 8000.00f, 10);
//        System.out.println(product.id);

//        array.add(product);
//        System.out.println(array.get(0));


//        product.id=1;
//        product.name="printer";
//        product.quantity=10;
//        product.price=10000.00f;
//        product.discount=10;



