package Generics;
import java.util.LinkedList;
import java.util.List;

abstract class WarehouseItem{
    private int itemId;
    private String itemName;

    public WarehouseItem(int itemId,String itemName){
        this.itemId=itemId;
        this.itemName=itemName;
    }
    public  int getItemId(){
        return itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public abstract void display();
}

//electronice subclass
class Electronics extends WarehouseItem{
    private int warrantyYears;
    public Electronics(int itemId,String itemName,int warrantyYears){
        super(itemId,itemName);
        this.warrantyYears=warrantyYears;
    }

    @Override
    public void display(){
        System.out.println("\nItem details: \nItems Id: "+getItemId()+"\nItem Name: "+getItemName()+"\nWarranty years: "+warrantyYears);
    }
}

//groceries subclass
class Groceries extends WarehouseItem{
    private String expiryDate;
    public Groceries(int itemId,String itemName,String expiryDate){
        super(itemId,itemName);
        this.expiryDate=expiryDate;
    }

    @Override
    public void display(){
        System.out.println("\nItem details: \nItems Id: "+getItemId()+"\nItem Name: "+getItemName()+"\nexpiry Date: "+expiryDate);
    }
}

//subclass: furniture
class Furniture extends WarehouseItem{
    private String material;
    public Furniture(int itemId,String itemName,String material){
        super(itemId,itemName);
        this.material=material;
    }

    @Override
    public void display(){
        System.out.println("Item details: \nItems Id: "+getItemId()+"\nItem Name: "+getItemName()+"\nMaterial: "+material);
    }
}

// generic class with upper boundary warehouse items(T extends Warehouse items)
// hence the class can only read or take the warehouse items like electronics,groceries and furniture
class Storage<T extends WarehouseItem>{
    private List<T> items;

    //constructore for creating ht elist
    public Storage(){
        this.items=new LinkedList<>();
    }

    //getter method to get the items in the storage
    public List<T> getItems(){
        return items;
    }
    // here we didnt use public <T> void addItem because if we use that the T belongs to the method but the T also belongs tot he class
    // which implies the T belonging to the method can be diffrenet from the one belongong to the class
    public void addItem(T item){
        items.add(item);
    }

    public static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items){
            item.display();
        }
    }
}


public class SmartWarehouseManagementSystem {
    public static void main(String[] args){
        Electronics electronics=new Electronics(101, "Laptop", 2);
        Groceries groceries=new Groceries(102, "Rice", "5-10-2027");
        Furniture furniture=new Furniture(103, "Chair", "Wood");

        /*
        Storage<Electronics> electronicsStorage=new Storage<>();

        Storage<Groceries> groceriesStorage=new Storage<>();
        Storage<Furniture> furnitureStorage=new Storage<>();

        electronicsStorage.addItem(electronics);
        groceriesStorage.addItem(groceries);
        furnitureStorage.addItem(furniture);

        List<Electronics> electronicsList=electronicsStorage.getItems();
        List<Groceries> groceriesList=groceriesStorage.getItems();
        List<Furniture> furnitureList=furnitureStorage.getItems();

        Storage.displayItems(electronicsList);
        Storage.displayItems(groceriesList);
        Storage.displayItems(furnitureList);
        */

        Storage<WarehouseItem> warehouseItemStorage=new Storage<>();

        warehouseItemStorage.addItem(electronics);
        warehouseItemStorage.addItem(groceries);
        warehouseItemStorage.addItem(furniture);

        List<WarehouseItem> warehouseItemList=warehouseItemStorage.getItems();
        Storage.displayItems(warehouseItemList);
    }
}
