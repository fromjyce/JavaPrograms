/*Write a Java Program to create  a class called circle with private instance variable radius, provided public setter and getter methods. 
However provide two methods  - calculate_area() and calculate_perimeter() based on the radius value*/
import java.util.*;

class Circle {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newradius) {
        this.radius = newradius;
    }
}
public class CircleEncapsulation {
    Circle circle = new Circle();
    Scanner scan = new Scanner(System.in);
    void setnewradius() {
        System.out.print("Enter New Radius: ");
        double newradius = scan.nextDouble();
        circle.setRadius(newradius);
        scan.nextLine();
        System.out.println("Radius Set Successfully");
    }

    void getradius() {
        System.out.println("Radius: " + circle.getRadius());
    }

    void getperimeter() {
        double perimeter = Math.PI*(2*circle.getRadius());
        System.out.println("Perimeter of the Circle: " + perimeter);
    }
    void getarea() {
        double area = Math.PI*(circle.getRadius()*circle.getRadius());
        System.out.println("Area of the Circle:  " + area);
    }
    public static void main(String[] args) {
        CircleEncapsulation circleencaps = new CircleEncapsulation();
        
        System.out.print("Enter the Radius: ");
        double radius = circleencaps.scan.nextDouble();
        circleencaps.circle.setRadius(radius);
        circleencaps.scan.nextLine();
        int choice = 0;
        while(choice != 5) {
            System.out.print("\nDo you want to \n1. Set Radius Again \n2. Get Radius \n3. Find Area \n4. Find Perimeter \n5. Exit \nEnter Your Choice: ");
            choice = circleencaps.scan.nextInt();
            circleencaps.scan.nextLine();
            switch(choice) {
                case 1:
                    circleencaps.setnewradius();
                    break;
                case 2:
                    circleencaps.getradius();
                    break;
                case 3:
                    circleencaps.getarea();
                    break;
                case 4:
                    circleencaps.getperimeter();
                    break;
                default:
                    System.out.println("Exiting...");
                    break;
            }
        }

    }
}
