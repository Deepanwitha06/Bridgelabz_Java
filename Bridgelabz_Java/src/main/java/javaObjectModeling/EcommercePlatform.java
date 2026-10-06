package javaObjectModeling;

/*
    E-commerce Platform with Orders, Customers, and Products
    ---------------------------------------------------------

    Class: EcommerceCustomer
        Attributes: customerId, customerName
        Relationship:
            Association with Order

    Class: Order
        Attributes: orderId, products
        Relationships:
            Association with EcommerceCustomer
            Aggregation with Product

    Class: Product
        Attributes: productId, productName, price

    Association:
        An EcommerceCustomer can place an Order.
        An EcommerceCustomer can place multiple Orders.

    Aggregation:
        An Order contains multiple Products.
        Products can exist independently of an Order.

    Communication:
        EcommerceCustomer communicates with Order through
        the placeOrder() method.

        Order communicates with Product through
        the displayOrder() method.
*/


// Product class
class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId,String productName,double price) {
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}


// Order class
class Order {
    private int orderId;

    // Aggregation
    private Product[] products;

    public Order(int orderId,Product[] products) {
        this.orderId=orderId;
        this.products=products;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);

        System.out.println("Products in Order:");

        for(Product product : products) {
            product.displayProduct();
            System.out.println();
        }
    }
}


// EcommerceCustomer class
class EcommerceCustomer {
    private int customerId;
    private String customerName;

    public EcommerceCustomer(int customerId,String customerName) {
        this.customerId=customerId;
        this.customerName=customerName;
    }

    // Communication between EcommerceCustomer and Order
    public void placeOrder(Order order) {System.out.println(customerName + " placed the following order:");
        order.displayOrder();
    }

    public void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}


// Main class
public class EcommercePlatform {
    public static void main(String[] args) {

        // Create Product objects
        Product product1= new Product(101,"Laptop",65000);
        Product product2= new Product(102,"Mouse",1200);
        Product product3= new Product(103,"Keyboard",2500);


        // Products can exist independently of Order
        Product[] products={product1, product2, product3};
        // Create Order
        Order order1= new Order(501,products);
        // Create EcommerceCustomer
        EcommerceCustomer customer1= new EcommerceCustomer(201,"Deepa");
        // EcommerceCustomer places Order
        customer1.placeOrder(order1);
    }
}
