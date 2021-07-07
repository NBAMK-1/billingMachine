package projects6;


import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;

    public Product(String pname, int qty, double price, double totalPrice) {
        this.pname = pname;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    public static void displayFormat(){
        System.out.print("\n Name     Quantity   Price    TotalPrice\n");
    }
    public void display(){
        System.out.format("%9s %8d %10.2f %10.2f\n",pname,qty,price,totalPrice);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overallPrice = 0.0;
        char choice = '\0';

        Scanner scn = new Scanner(System.in);
        ArrayList<Product> product = new ArrayList<Product>();

        do {
            System.out.println("Enter product details,");
            System.out.println("Name: ");
            productName = scn.next();

            System.out.println("Quantity: ");
            quantity = scn.nextInt();

            System.out.println("Price(per item):");
            price = scn.nextDouble();

            totalPrice = price * quantity;

            overallPrice += totalPrice;

            product.add(new Product(productName,quantity,price,totalPrice));

            System.out.print("want to add more item ? (Y or N ):");
            choice = scn.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');

        Product.displayFormat();
        for (Product p :product) {
            p.display();
        }

        System.out.println("\n Over all price = " + overallPrice);
    }
}
