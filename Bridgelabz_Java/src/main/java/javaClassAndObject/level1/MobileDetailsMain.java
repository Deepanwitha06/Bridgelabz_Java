package javaClassAndObject.level1;
import java.util.Scanner;
/*
    create a class to
 */
class MobilePhone{
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public MobilePhone(String model,double price){
        this.model=model;
        this.price=price;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void display(){
        System.out.println("Mobile phone details: ");
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Price : "+ price+"\n");
    }
}

public class MobileDetailsMain {
    /*
    public static void display(String brand,String model,double price){
        System.out.println("Brand : "+ brand);
        System.out.println("Model : "+ model);
        System.out.println("Price : "+ price);
    }
    */
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //create MobilePhone class object
        //create variables and take user inputs for different objects
        System.out.println("Enter the brand,model and price");
        String brand = input.nextLine();
        String model = input.nextLine();
        double price = input.nextDouble();

        //1st object
        MobilePhone mobilePhone1 = new MobilePhone(model,price);
        mobilePhone1.setBrand(brand);

        //2nd object
        MobilePhone mobilePhone2 = new MobilePhone("Iphone",130008.6);
        mobilePhone2.setBrand("Apple");
        //dis[play
        //display(mobilePhone1.getBrand(),mobilePhone1.getModel(),mobilePhone1.getPrice());
        //display(mobilePhone2.getBrand(),mobilePhone2.getModel(),mobilePhone2.getPrice());

        mobilePhone1.display();
        mobilePhone2.display();

        input.close();

    }
}
