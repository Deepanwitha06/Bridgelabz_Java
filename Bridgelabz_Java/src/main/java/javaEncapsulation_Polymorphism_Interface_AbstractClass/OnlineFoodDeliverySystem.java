package javaEncapsulation_Polymorphism_Interface_AbstractClass;
/*
    Interface : Discountable
                Methods: applyDiscount(), getDiscountDetails()

    Abstract Class : FoodItem
                     Attributes: itemName, price, quantity
                     Methods: calculateTotalPrice(), getItemDetails()
                     Implements the Discountable interface

    Subclasses : VegItem, NonVegItem
*/
import java.util.ArrayList;
import java.util.List;

// Interface
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Abstract class
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName,double price,int quantity) {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName=itemName;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0) {
            this.quantity=quantity;
        } else {
            System.out.println("Quantity must be positive.");
        }
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item Name: "+itemName+"\nPrice Per Item: Rs. "+price+"\nQuantity: "+quantity);
        System.out.printf("Discount: Rs. %.2f%n",applyDiscount());
        System.out.println("Discount Details: "+getDiscountDetails());
        System.out.printf("Total Price: Rs. %.2f%n",calculateTotalPrice());
    }
}

// VegItem class
class VegItem extends FoodItem {
    public VegItem(String itemName,double price,int quantity) {
        super(itemName,price,quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity()-applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getPrice()*getQuantity()*0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on vegetarian food items.";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem {
    private double additionalCharge;

    public NonVegItem(String itemName,double price,int quantity,double additionalCharge) {
        super(itemName,price,quantity);
        this.additionalCharge=additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        if(additionalCharge>=0) {
            this.additionalCharge=additionalCharge;
        } else {
            System.out.println("Additional charge cannot be negative.");
        }
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice()+additionalCharge)*getQuantity()-applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return (getPrice()+additionalCharge)*getQuantity()*0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on non-vegetarian food items.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    // Process order using polymorphism
    public static void processOrder(List<FoodItem> foodItems) {
        double grandTotal=0;

        for(FoodItem item:foodItems) {
            System.out.println("\n");
            item.getItemDetails();
            grandTotal+=item.calculateTotalPrice();
        }

        System.out.println("\n");
        System.out.printf("Grand Total: Rs. %.2f%n",grandTotal);
    }

    public static void main(String[] args) {
        FoodItem item1=new VegItem("Vegetable Biryani",150,2);
        FoodItem item2=new NonVegItem("Chicken Biryani",250,2,30);
        FoodItem item3=new VegItem("Paneer Fried Rice",180,1);

        List<FoodItem> foodItems=new ArrayList<>();

        foodItems.add(item1);
        foodItems.add(item2);
        foodItems.add(item3);

        processOrder(foodItems);
    }
}