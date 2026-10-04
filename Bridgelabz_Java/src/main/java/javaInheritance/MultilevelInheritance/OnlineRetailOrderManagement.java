package javaInheritance.MultilevelInheritance;
/*
    Multi level hierarchy
    base class: Order
               Attributes: oderId,orderDate
    subclass: ShippedOrder
               Attributes: trackingNumber
    subclass of ShippedOrder: DeliveredOrder
               Attributes: deliveryDate
        Method: getOrderStatus()
 */
class Order{
    int orderId;
    String orderDate;
    public Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order Id: "+orderId+"\nOrder date: "+orderDate);
    }
}

class ShippedOrder extends Order{
    long trackingNumber;
    ShippedOrder(int orderId,String orderDate,long trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }

    @Override
    public void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking number: "+trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    public DeliveredOrder(int orderId,String orderDate,long trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    @Override
    public void getOrderStatus(){
        System.out.println("Order status:Delivered ");
        super.getOrderStatus();
        System.out.println("Delivery date: "+deliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args){
        DeliveredOrder deliveredOrder=new DeliveredOrder(101,"22-09-2026",34567890,"30-09-2026");
        deliveredOrder.getOrderStatus();
    }
}
