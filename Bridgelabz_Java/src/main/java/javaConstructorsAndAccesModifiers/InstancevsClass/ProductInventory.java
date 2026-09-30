package javaConstructorsAndAccesModifiers.InstancevsClass;
import java.util.Scanner;
/*
      create a class Product
      Attributes: instance Variables/non-static : productName,price
                  class Variables/static:  totalProducts
      Methods: instance/non-static method :  displayProductDetails()
                class/static method       :displayTotalProduct()
 */
class Product{
    private String productName;                     //instance variable
    private double price;                           //instance variable
    private static int totalProducts=0;             //class variable

    public Product(String productName,double price){
        this.price=price;
        this.productName=productName;
        totalProducts++;
    }

    //instance method
    public void displayProductDetails(){
        System.out.println("Product Details :");
        System.out.println("Product Name: "+productName);
        System.out.println("Price : "+price);
    }

    //class method
    public static void displayTotalProducts(){
        System.out.println("The total No.of products : "+totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter the product name and price:");
        String productName1=input.nextLine();
        double price1=input.nextDouble();
        input.nextLine();

        //create class objects
        Product product1=new Product(productName1,price1);

        System.out.println("Enter the product name and price:");
        String productName2=input.nextLine();
        double price2=input.nextDouble();
        input.nextLine();

        //create class objects
        Product product2=new Product(productName2,price2);

        Product.displayTotalProducts();
        System.out.println("\n");
        product1.displayProductDetails();
        product2.displayProductDetails();

        input.close();
    }
}
