package LinkedList;


import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName=itemName;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}

class InventoryLinkedList {
    private Item head;

    // Add item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        Item newItem=new Item(itemName,itemId,quantity,price);
        newItem.next=head;
        head=newItem;

        System.out.println("Item added at the beginning.");
    }

    // Add item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        Item newItem=new Item(itemName,itemId,quantity,price);

        if(head==null) {
            head=newItem;
        } else {
            Item current=head;

            while(current.next!=null) {
                current=current.next;
            }

            current.next=newItem;
        }

        System.out.println("Item added at the end.");
    }

    // Add item at a specific position (1-based indexing)
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        if(position<1) {
            System.out.println("Invalid position.");
            return;
        }

        if(position==1) {
            addAtBeginning(itemName,itemId,quantity,price);
            return;
        }

        Item current=head;

        for(int i=1;i<position-1 && current!=null;i++) {
            current=current.next;
        }

        if(current==null) {
            System.out.println("Invalid position.");
            return;
        }

        Item newItem=new Item(itemName,itemId,quantity,price);
        newItem.next=current.next;
        current.next=newItem;

        System.out.println("Item added at position "+position+".");
    }

    // Remove item by Item ID
    public void removeItem(int itemId) {
        if(head==null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if(head.itemId==itemId) {
            head=head.next;
            System.out.println("Item removed successfully.");
            return;
        }

        Item current=head;

        while(current.next!=null && current.next.itemId!=itemId) {
            current=current.next;
        }

        if(current.next==null) {
            System.out.println("Item not found.");
            return;
        }

        current.next=current.next.next;
        System.out.println("Item removed successfully.");
    }

    // Update quantity by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        if(newQuantity<0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }

        Item current=head;

        while(current!=null) {
            if(current.itemId==itemId) {
                current.quantity=newQuantity;
                System.out.println("Quantity updated successfully.");
                return;
            }

            current=current.next;
        }

        System.out.println("Item not found.");
    }

    // Search item by Item ID
    public void searchById(int itemId) {
        Item current=head;

        while(current!=null) {
            if(current.itemId==itemId) {
                displayItem(current);
                return;
            }

            current=current.next;
        }

        System.out.println("Item not found.");
    }

    // Search item by Item Name
    public void searchByName(String itemName) {
        Item current=head;
        boolean found=false;

        while(current!=null) {
            if(current.itemName.equalsIgnoreCase(itemName)) {
                displayItem(current);
                found=true;
            }

            current=current.next;
        }

        if(!found) {
            System.out.println("Item not found.");
        }
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        Item current=head;
        double totalValue=0;

        while(current!=null) {
            totalValue+=current.price*current.quantity;
            current=current.next;
        }

        System.out.printf("Total inventory value: %.2f%n",totalValue);
    }

    // Display all items
    public void displayInventory() {
        if(head==null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Item current=head;

        System.out.println("\n--- Inventory Records ---");

        while(current!=null) {
            displayItem(current);
            current=current.next;
        }
    }

    // Display one item
    private void displayItem(Item item) {
        System.out.println("Item Name: "+item.itemName);
        System.out.println("Item ID: "+item.itemId);
        System.out.println("Quantity: "+item.quantity);
        System.out.printf("Price: %.2f%n",item.price);
        System.out.printf("Item Value: %.2f%n",item.price*item.quantity);
        System.out.println("-----------------------------");
    }

    // Sort by Item Name or Price, ascending or descending
    public void sortInventory(int sortBy, boolean ascending) {
        if(head==null || head.next==null) {
            System.out.println("Inventory sorted successfully.");
            return;
        }

        head=mergeSort(head,sortBy,ascending);
        System.out.println("Inventory sorted successfully.");
    }

    // Merge sort for the linked list
    private Item mergeSort(Item start, int sortBy, boolean ascending) {
        if(start==null || start.next==null) {
            return start;
        }

        Item middle=findMiddle(start);
        Item secondHalf=middle.next;
        middle.next=null;

        Item left=mergeSort(start,sortBy,ascending);
        Item right=mergeSort(secondHalf,sortBy,ascending);

        return merge(left,right,sortBy,ascending);
    }

    // Find the middle node using slow and fast pointers
    private Item findMiddle(Item start) {
        Item slow=start;
        Item fast=start.next;

        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    // Merge two sorted lists
    private Item merge(Item left, Item right, int sortBy, boolean ascending) {
        Item dummy=new Item("",0,0,0);
        Item current=dummy;

        while(left!=null && right!=null) {
            int comparison;

            if(sortBy==1) {
                comparison=left.itemName.compareToIgnoreCase(right.itemName);
            } else {
                comparison=Double.compare(left.price,right.price);
            }

            if(!ascending) {
                comparison=-comparison;
            }

            if(comparison<=0) {
                current.next=left;
                left=left.next;
            } else {
                current.next=right;
                right=right.next;
            }

            current=current.next;
        }

        if(left!=null) {
            current.next=left;
        } else {
            current.next=right;
        }

        return dummy.next;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InventoryLinkedList inventory=new InventoryLinkedList();
        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add item at beginning");
            System.out.println("2. Add item at end");
            System.out.println("3. Add item at specific position");
            System.out.println("4. Remove item by ID");
            System.out.println("5. Update item quantity");
            System.out.println("6. Search item by ID");
            System.out.println("7. Search item by name");
            System.out.println("8. Display inventory");
            System.out.println("9. Calculate total inventory value");
            System.out.println("10. Sort inventory");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter item name: ");
                    String itemName=sc.nextLine();

                    System.out.print("Enter item ID: ");
                    int itemId=sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int quantity=sc.nextInt();

                    System.out.print("Enter price: ");
                    double price=sc.nextDouble();
                    sc.nextLine();

                    if(itemId<=0 || quantity<0 || price<0) {
                        System.out.println("Invalid ID, quantity, or price.");
                        break;
                    }

                    if(choice==1) {
                        inventory.addAtBeginning(itemName,itemId,quantity,price);
                    } else if(choice==2) {
                        inventory.addAtEnd(itemName,itemId,quantity,price);
                    } else {
                        System.out.print("Enter position (starting from 1): ");
                        int position=sc.nextInt();
                        sc.nextLine();

                        inventory.addAtPosition(itemName,itemId,quantity,price,position);
                    }
                    break;
                }

                case 4:
                    System.out.print("Enter item ID to remove: ");
                    int deleteId=sc.nextInt();
                    inventory.removeItem(deleteId);
                    break;

                case 5:
                    System.out.print("Enter item ID: ");
                    int updateId=sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQuantity=sc.nextInt();

                    inventory.updateQuantity(updateId,newQuantity);
                    break;

                case 6:
                    System.out.print("Enter item ID to search: ");
                    int searchId=sc.nextInt();
                    inventory.searchById(searchId);
                    break;

                case 7:
                    System.out.print("Enter item name to search: ");
                    String searchName=sc.nextLine();
                    inventory.searchByName(searchName);
                    break;

                case 8:
                    inventory.displayInventory();
                    break;

                case 9:
                    inventory.calculateTotalValue();
                    break;

                case 10:
                    System.out.println("Sort by:");
                    System.out.println("1. Item Name");
                    System.out.println("2. Price");
                    System.out.print("Enter choice: ");
                    int sortBy=sc.nextInt();

                    if(sortBy!=1 && sortBy!=2) {
                        System.out.println("Invalid sort option.");
                        break;
                    }

                    System.out.println("Order:");
                    System.out.println("1. Ascending");
                    System.out.println("2. Descending");
                    System.out.print("Enter choice: ");
                    int order=sc.nextInt();

                    if(order!=1 && order!=2) {
                        System.out.println("Invalid order.");
                        break;
                    }

                    inventory.sortInventory(sortBy,order==1);
                    inventory.displayInventory();
                    break;

                case 11:
                    System.out.println("Exiting Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice!=11);

        sc.close();
    }
}
