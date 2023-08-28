/*Write a Java Program to create an abstract class named Shape that contains two integers and an empty method named print Area (). 
Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method print Area () that prints the area of the given shape.  */
import java.util.*;

abstract class Shape {
    int a;
    int b;
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea()
     { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length of the Rectangle: ");
        double length = scan.nextInt();
        System.out.print("Enter the Breadth of the Rectangle: ");
        double breadth = scan.nextInt();
        System.out.println("Area of the Rectangle: " + breadth*length + " sq.units ") ;
        scan.close();
    }
}

class Triangle extends Shape {
    void printArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Height of the Triangle: ");
        double height = scan.nextInt();
        System.out.print("Enter the Base of the Triangle: ");
        double base = scan.nextInt();
        System.out.println("Area of the Triangle: " + 0.5*base*height + " sq.units ");
        scan.close();
    }
}

class Circle extends Shape {
    void printArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double radius = scan.nextInt();
        System.out.println("Area of the Circle: " + Math.PI*(radius*radius) + " sq.units ");
        scan.close();
    }
}


public class PrintAreaOfShapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to Find Area for \n1. Circle \n2. Rectangle \n3. Triangle \nEnter your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                Circle circle = new Circle();
                circle.printArea();
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.printArea();
                break;
            case 3:
                Triangle triangle = new Triangle();
                triangle.printArea();
                break;
            default:
                System.out.println("Enter a Valid Integer!!");
                break;
        }
        scan.close();
    }
}
