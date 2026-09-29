package javaClassAndObject.level1;
import java.util.Scanner;
/*
     create a class to to track inventory of items
 */
class Item{
    private String itemCode;
    private String itemName;
    private double price;

    public void setItemCode(String itemCode){
        this.itemCode=itemCode;
    }
    public Item(String  itemName,double price){
        this.itemName=itemName;
        this.price=price;
    }

    public String getItemCode(){
        return itemCode;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }

    public double calculateTotalCost(int quantity){
        return quantity*price;
    }
}
public class InventoryMain {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take inputs
        System.out.println("Enter the item details(Item code,Item name,price: ");
        String itemCode=input.nextLine();
        String itemName=input.nextLine();
        double price=input.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity=input.nextInt();

        //item class object
        Item item=new Item(itemName,price);
        item.setItemCode(itemCode);
        System.out.println("Item details:");
        System.out.println("Item code: "+item.getItemCode());
        System.out.println("Item Name: "+item.getItemName());
        System.out.println("Item Price: "+item.getPrice());

        double totalCost=item.calculateTotalCost(quantity);
        System.out.println("TotalCost= "+totalCost);

        input.close();;
    }
}
