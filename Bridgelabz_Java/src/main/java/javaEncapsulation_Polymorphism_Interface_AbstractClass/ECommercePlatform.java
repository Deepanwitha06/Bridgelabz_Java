package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Taxable
                Methods: calculateTax(), getTaxDetails()
    Abstract Class : Product
                     Attributes: productId, name, price
                     Method: calculateDiscount()
                     Implements the Taxable interface
    Subclasses : Electronics, Clothing, Groceries
*/
import java.util.ArrayList;
import java.util.List;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId,String name,double price) {
        this.productId=productId;
        this.name=name;
        this.price=price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if(productId>0) {
            this.productId=productId;
        } else {
            System.out.println("Invalid product ID.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0) {
            this.price=price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: "+productId+"\nName: "+name+"\nPrice: Rs. "+price);
        System.out.println("Discount: Rs. "+calculateDiscount());
        System.out.println("Tax: Rs. "+calculateTax());
        System.out.println("Tax Details: "+getTaxDetails());
        System.out.printf("Final Price: Rs. %.2f%n",calculateFinalPrice());
    }

    // Calculate final price
    public double calculateFinalPrice() {
        return price+calculateTax()-calculateDiscount();
    }
}

// Electronics class
class Electronics extends Product {
    private double warrantyYears;

    public Electronics(int productId,String name,double price,double warrantyYears) {
        super(productId,name,price);
        this.warrantyYears=warrantyYears;
    }

    public double getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(double warrantyYears) {
        if(warrantyYears>=0) {
            this.warrantyYears=warrantyYears;
        } else {
            System.out.println("Warranty period cannot be negative.");
        }
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax: 18%";
    }
}

// Clothing class
class Clothing extends Product {
    private String size;

    public Clothing(int productId,String name,double price,String size) {
        super(productId,name,price);
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size=size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax: 5%";
    }
}

// Groceries class
class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId,String name,double price,String expiryDate) {
        super(productId,name,price);
        this.expiryDate=expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate=expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.02;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries tax: 2%";
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {

        Product product1=new Electronics(101,"Laptop",50000,2);
        Product product2=new Clothing(102,"T-Shirt",1000,"M");
        Product product3=new Groceries(103,"Rice",2000,"30-12-2026");

        List<Product> products=new ArrayList<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);

        for(Product product:products) {
            System.out.println("\n");
            product.displayDetails();
        }
    }
}