package Generics;

import java.util.LinkedList;
import java.util.List;

interface ProductCategory{
    String getCategory();
}

class BookCategory implements ProductCategory{
    @Override
    public String getCategory(){
        return "Books";
    }
}

class ClothingCategory implements ProductCategory{
    @Override
    public String getCategory(){
        return "Clothing";
    }
}


class GadgetCategory implements ProductCategory{
    @Override
    public String getCategory(){
        return "Gadgets";
    }
}

class Product<T extends ProductCategory>{

    private T category;

    private int productId;
    private String productName;
    private double price;

    public Product(int productId,String productName,double price,T category){
        this.price=price;
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public T getCategory(){
        return category;
    }

    public void updatePrice(double newPrice){
        this.price=newPrice;
    }

    public void display(){
        System.out.println("\nProduct details: \nProduct ID: "+productId+"\nProduct name: "+productName+"\nCategory: "+category.getCategory()+"\nPrice: "+price);
    }
}

class MarketPlace{
    private List<Product<?>> products;

    public MarketPlace(){
        products=new LinkedList<>();
    }

    public void addProduct(Product<?> product){
        products.add(product);
    }

    public <T extends Product<?>> void applyDiscount(T product, double percentage){
        if(percentage<0 || percentage>100) {
            System.out.println("Invalid discount percentage");
            return;
        }

        double discount=product.getPrice()*percentage/100;
        double finalPrice=product.getPrice()-discount;

        product.updatePrice(finalPrice);
        System.out.println("Discount applied: "+percentage+"%");
        System.out.println("Discount amount: ₹"+discount);
        System.out.println("Final price: ₹"+finalPrice);
    }

    public void displayProducts() {
        for(Product<?> product:products) {
            product.display();
        }
    }
}


public class DynamicOnlineMarketplace {
    public static void main(String[] args) {

        Product<BookCategory> book=new Product<>(101,"Java Programming",500,new BookCategory());
        Product<ClothingCategory> clothing=new Product<>(102,"T-Shirt",800,new ClothingCategory());
        Product<GadgetCategory> gadget=new Product<>(103,"Headphones",2000,new GadgetCategory());

        MarketPlace marketPlace=new MarketPlace();

        marketPlace.addProduct(book);
        marketPlace.addProduct(clothing);
        marketPlace.addProduct(gadget);

        System.out.println("Before discount:");
        marketPlace.displayProducts();

        System.out.println("\nApplying discount to book:");
        marketPlace.applyDiscount(book,10);

        System.out.println("\nApplying discount to clothing:");
        marketPlace.applyDiscount(clothing,20);

        System.out.println("\nApplying discount to gadget:");
        marketPlace.applyDiscount(gadget,15);

        System.out.println("\nAfter discount:");
        marketPlace.displayProducts();
    }
}