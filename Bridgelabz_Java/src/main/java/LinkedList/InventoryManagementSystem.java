package LinkedList;
/*
       using single linked list, inventory management system
       methods: Add an item at the beginning, end, or at a specific position.
       Remove an item based on Item ID.
       Update the quantity of an item by Item ID.
       Search for an item based on Item ID or Item Name.
       Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
       Sort the inventory based on Item Name or Price in ascending or descending order.
 */

class Item{
    String itemName;
    int itemID;
    double quantity;
    double price;
    Item next;

    public Item(String itemName, int itemID, double quantity, double price){
        this.itemID=itemID;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        this.next=null;
    }
}

class ItemLinkedList{
    Item head;

    //insert at begging
    public void insertAtBeginning(String itemName, int itemID, double quantity, double price){
        Item newitem=new Item( itemName,  itemID,  quantity,  price);
        if(head==null){
            head=newitem;
            return;
        }
        newitem.next=head;
        head=newitem;
        return;
    }

    public void insertAtEnd(String itemName, int itemID, double quantity, double price) {
        Item newitem = new Item(itemName, itemID, quantity, price);
        if(head==null){
            head=newitem;
            return;
        }
        Item current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newitem;
        newitem.next=null;
        return;
    }

    public void insertAtPosition(String itemName, int itemID, double quantity, double price,int position) {
        Item newitem = new Item(itemName, itemID, quantity, price);
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            insertAtBeginning(itemName, itemID, quantity, price);
            return;
        }
        Item current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }
        newitem.next = current.next;
        current.next = newitem;
    }

    //remove an item based on item id
    public void deleteByItemid(int targetitemId){
        if(head==null){
            System.out.println("No items");
            return;
        }
        if(head.itemID==targetitemId){
            head=head.next;
            return;
        }
        Item current=head;
        while(current.next!=null){
            if(current.next.itemID==targetitemId){
                current.next=current.next.next;
                return;
            }
            current=current.next;

        }
        if(current.itemID==targetitemId){
            current.next=null;
            return;
        }
        System.out.println("no record with give id");
        return;
    }

    //update quantity by itemID
    public void updateQuantity(int targetitemID,double targetQuantity){
        if(head==null){
            System.out.println("No items");
            return;
        }
        Item current=head;
        while(current!=null){
            if(current.itemID==targetitemID){
                current.quantity=targetQuantity;
                System.out.println("Successful update");
                return;
            }
            current=current.next;
        }
        System.out.println("no record with give id");
        return;
    }

    //search based on itemid or itemname
    public boolean searchByItemID(int targetitemID){
        if(head==null){
            System.out.println("No items");
            return false;
        }Item current=head;
        while(current!=null){
            if(current.itemID==targetitemID){
                return true;
            }
            current=current.next;
        }
        System.out.println("no record with give id");
        return false;
    }
    public boolean searchByItemName(String targetitemName){
        if(head==null){
            System.out.println("No items");
            return false;
        }
        Item current=head;
        while(current!=null){
            if(current.itemName.equalsIgnoreCase(targetitemName)){
                return true;
            }
            current=current.next;
        }
        System.out.println("no record with give name");
        return false;
    }

    public void totalValue(){
        double total=0;
        Item current=head;
        while(current!=null){
            total+=(current.price*current.quantity);
            current=current.next;
        }
        System.out.println("Total value of inventory: "+total);
        return;
    }

    //sort inventory

    public void sortByPrice(){
        if(head==null){
            return;
        }

        for(Item current=head;current.next!=null;current=current.next){
            for(Item index=current.next;index!=null;index=index.next){
                if(current.price>index.price){
                    String tempName=current.itemName;
                    current.itemName=index.itemName;
                    index.itemName=tempName;

                    int tempID=current.itemID;
                    current.itemID=index.itemID;
                    index.itemID=tempID;

                    double tempQuantity=current.quantity;
                    current.quantity=index.quantity;
                    index.quantity=tempQuantity;

                    double tempPrice=current.price;
                    current.price=index.price;
                    index.price=tempPrice;
                }
            }
        }

        Item displaycurrent=head;
        while(displaycurrent!=null){
            System.out.println("Item ID: "+displaycurrent.itemID+ "\nItem Name: "+displaycurrent.itemName+ "\nQuantity: "+displaycurrent.quantity+ "\nPrice: "+displaycurrent.price);
            displaycurrent=displaycurrent.next;
        }
    }



    public void sortByName(){
        if(head==null){
            return;
        }

        for(Item current=head;current.next!=null;current=current.next){
            for(Item index=current.next;index!=null;index=index.next){
                if(current.itemName.compareToIgnoreCase(index.itemName)>0){
                    String tempName=current.itemName;
                    current.itemName=index.itemName;
                    index.itemName=tempName;

                    int tempID=current.itemID;
                    current.itemID=index.itemID;
                    index.itemID=tempID;

                    double tempQuantity=current.quantity;
                    current.quantity=index.quantity;
                    index.quantity=tempQuantity;

                    double tempPrice=current.price;
                    current.price=index.price;
                    index.price=tempPrice;
                }
            }
        }

        Item displaycurrent=head;
        while(displaycurrent!=null){
            System.out.println("Item ID: "+displaycurrent.itemID+ "\nItem Name: "+displaycurrent.itemName+ "\nQuantity: "+displaycurrent.quantity+ "\nPrice: "+displaycurrent.price);
            displaycurrent=displaycurrent.next;
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args){
        ItemLinkedList list=new ItemLinkedList();

        list.insertAtEnd("Laptop",101,5,50000);
        list.insertAtEnd("Mouse",102,10,500);
        list.insertAtBeginning("Keyboard",103,4,1500);
        list.insertAtPosition("Monitor",104,3,8000,2);

        System.out.println("Inventory:");
        list.sortByPrice();

        System.out.println("\nSorted by item name:");
        list.sortByName();

        System.out.println("\nTotal inventory value:");
        list.totalValue();

        System.out.println("\nSearch item ID 102:");
        System.out.println(list.searchByItemID(102));

        System.out.println("\nUpdating quantity:");
        list.updateQuantity(102,15);

        System.out.println("\nDeleting item ID 103:");
        list.deleteByItemid(103);
        list.sortByName();
    }
}
