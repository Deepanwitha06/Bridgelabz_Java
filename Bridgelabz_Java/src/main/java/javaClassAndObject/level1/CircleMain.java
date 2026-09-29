package javaClassAndObject.level1;
import java.util.Scanner;
/*
     create a class to compare area of circle and circumferance of circle

 */
class Circle {
    private double radius;
    private double area;
    private double circumferance;

    public Circle(double radius){
        this.radius=radius;
    }

    public void calculateAreaCircumference(){
        area=radius*radius*Math.PI;
        circumferance=2*Math.PI*radius;
    }

    public void display(){
        System.out.println("Area = "+area+"\nCircumference = "+circumferance);
    }
}

public class CircleMain{
    public static void main(String[] args){
        //create Scanner object
        Scanner input=new Scanner(System.in);

        //create variabe and take input
        System.out.println("Enter radius: ");
        double radius=input.nextDouble();

        Circle c=new Circle(radius);
        c.calculateAreaCircumference();
        c.display();
    }
}
