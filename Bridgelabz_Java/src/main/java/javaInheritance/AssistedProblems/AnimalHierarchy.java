package javaInheritance.AssistedProblems;
import java.util.Scanner;
/*
      Superclass: Animal
                  Attributes: name,age
                  Method: makeSound()
      Sub classes: Dog,Cat,Bird (each has unique behavior)
                  Method: makeSound()
 */
class Animal{
    protected String name;
    protected int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.println("Animals makes sound\n");
    }

    public void display(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}

class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Dogs bark\n");
    }
}

class Cat extends Animal{
    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cats meow\n");
    }
}

class Bird extends Animal{
    public Bird(String name,int age){
        super(name,age);
    }

    @Override
    public void makeSound(){
        System.out.println("Birds chirp\n");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create class objects
        System.out.println("Enter the name, age of the animal :");
        String animalName=input.nextLine();
        int animalAge=input.nextInt();
        input.nextLine();
        System.out.println("Enter the name, age of the Dog :");
        String dogName=input.nextLine();
        int dogAge=input.nextInt();
        input.nextLine();
        System.out.println("Enter the name, age of the Cat :");
        String catName=input.nextLine();
        int catAge=input.nextInt();
        input.nextLine();
        System.out.println("Enter the name, age of the Bird :");
        String birdName=input.nextLine();
        int birdAge=input.nextInt();

        Animal animal=new Animal(animalName,animalAge);
        Animal dog=new Dog(dogName,dogAge);
        Animal cat=new Cat(catName,catAge);
        Animal bird=new Bird(birdName,birdAge);

        animal.display();
        animal.makeSound();
        dog.display();
        dog.makeSound();
        cat.display();
        cat.makeSound();
        bird.display();
        bird.makeSound();

        input.close();
    }
}
