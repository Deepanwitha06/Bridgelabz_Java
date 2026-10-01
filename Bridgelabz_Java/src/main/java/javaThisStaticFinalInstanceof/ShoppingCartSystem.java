package javaThisStaticFinalInstanceof;
import java.util.Scanner;
/*
      create,
      class : Product
      Attributes: discount         (static)
                  productName, price,quantity           (instance)
                  productID             (final instance)
      Methods:   updateDiscount()  - static
      Constructor -    initialize productName, price, and quantity
 */
class Product{
    private static double discount=50;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    //constructor to initialize productName, price, and quantity
    public Product(String productName,double price,int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = switch (productName) {
            case "Ball" -> 1;
            case "Box" -> 2;
            case "Umbrella" -> 3;
            default -> 4;
        };
    }

    //static method
    public static void  updateDiscount(double newDiscount){
        discount=newDiscount;
    }

    public void display(){
        System.out.println("Product Details: ");
        System.out.println("Product ID: "+productID+"\nProduct Name: "+productName+"\nPrice: "+price+"\nQuantity: "+quantity);
        double totalPrice=price*quantity;
        double discountamount=totalPrice*discount/100;
        System.out.println("Discount Percentage: "+discount);
        System.out.println("Total cost: "+(totalPrice-discountamount));
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the product name, price and quantity: ");
        String name=input.nextLine();
        double price=input.nextDouble();
        int quantity=input.nextInt();

        //class object
        Product product=new Product(name,price,quantity);
        if(product instanceof Product) {
            product.display();
        }

        System.out.println("\nEnter the new discount percentage: ");
        double newDiscount=input.nextDouble();
        Product.updateDiscount(newDiscount);
        System.out.println("\nAfter new discount update: ");
        if(product instanceof Product) {
            product.display();
        }

        input.close();
    }
}
