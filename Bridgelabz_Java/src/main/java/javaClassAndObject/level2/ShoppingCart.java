package javaClassAndObject.level2;
import java.util.Scanner;
/*
     create a class CartItem
     Attributes : itemName, price, quantity
     Methods: Add an item to the cart
              Remove an item to the cart
              display the total cost
 */
class CartItem{
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public void addToCart(int increase){
        quantity+=increase;
    }

    public void removeFromCart(int decrease){
        if(decrease<=quantity) {
            quantity -= decrease;
        }else{
            System.out.println("Not enough items");
        }
    }

    public void displayTotalCost(){
        System.out.println("Total cost : "+quantity*price);
    }
}
public class ShoppingCart {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create variables and take input
        System.out.println("Enter the item name,prica and quantity in cart: ");
        String itemName=input.nextLine();
        double price=input.nextDouble();
        int quantity=input.nextInt();
        CartItem cartItem=new CartItem(itemName,price,quantity);
        System.out.println("option 1 : Add item to cart\nOption 2: Remove items from cart\nOptionm 3 : Total cost\n");
        int choice;
        do {
            System.out.println("Enter the choice:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    int increase;
                    do {
                        System.out.println("Enter the no.of items to add in cart: ");
                        increase = input.nextInt();
                    }while(increase<=0);
                    cartItem.addToCart(increase);
                    break;
                case 2:
                    int decrease;
                    do {
                        System.out.println("Enter the valid no.of items to remove from the cart: ");
                        decrease = input.nextInt();
                    }while(decrease<=0);
                    cartItem.removeFromCart(decrease);
                    break;
                case 3:
                    cartItem.displayTotalCost();
                    break;
            }
        }while(choice!=4);

        input.close();

    }
}
