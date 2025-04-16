import java.util.Scanner;
 

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shap
e {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
}

public class Area_Perimeter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Menu");
            System.out.println("1. Calculate Circle");
            System.out.println("Calculate Rectangle");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice){
                case 1:
                System.out.println("Enter radius of circle");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the Cicle is" + circle.area());
                System.out.println("Perimeter of the Circle is" + circle.perimeter());
                break;
                case 2:
                System.out.println("Enter length and breadth of rectangle");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, breadth);
                System.out.println("Area of the Rectangle is" + rectangle.area());
                System.out.println("Perimeter of the Rectangle is" + rectangle.perimeter());
                break;
                case 3:
                System.out.println("Exiting the program");
                sc.close();
                System.exit(0);
                default:
                System.out.println("Invalid choice");
                break;
                }
            }
    }
}