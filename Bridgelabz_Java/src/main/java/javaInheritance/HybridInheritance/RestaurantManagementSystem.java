package javaInheritance.HybridInheritance;
/*
    Superclass : Person
                Attributes: name,id
    Subclasses: chef, Waiter
    Interface: Worker
              method: performDuties()
 */

class Person{
    String name;
    int id;
    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker{
    void performDuties();
}

class Chef extends Person implements Worker{
    public Chef(int id,String name){
        super(id, name);
    }

    public void performDuties(){
        System.out.println("Chef cooks food");
        super.displayDetails();
    }
}

class Waiter extends Person implements Worker{
    public Waiter(int id,String name){
        super(id, name);
    }

    public void performDuties(){
        System.out.println("Waiter serves food");
        super.displayDetails();
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args){
        Chef chef=new Chef(105,"Rama");
        Waiter waiter=new Waiter(101,"Ramu");

        chef.performDuties();
        waiter.performDuties();
    }
}
