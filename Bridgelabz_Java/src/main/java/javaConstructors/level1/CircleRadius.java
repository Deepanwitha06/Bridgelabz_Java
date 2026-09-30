package javaConstructors.level1;
import java.util.Scanner;
/*
     create a class Circle
     Attributes: radius
     Constructor chaining
 */
class Circle{
    private double radius;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public void display(){
        System.out.println("The radius of circle : "+radius);
    }
}

public class CircleRadius {
    public static void main(String[] args){
        //create scanner object
        Scanner input=new Scanner(System.in);

        //create class object
        Circle circle1=new Circle();
        System.out.println("Through constructor chaining (default value): ");
        circle1.display();

        System.out.println("Enter the radius: ");
        double radius= input.nextDouble();
        Circle circle2=new Circle(radius);
        System.out.println("Through user-provided value : ");
        circle2.display();

        input.close();
    }
}
