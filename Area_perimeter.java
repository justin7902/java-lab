import java.util.Scanner;


interface Shape{
    double area();
    double perimeter();
}

class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*radius*radius;
    }
}

class Rectangle implements Shapes{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    } 
    public double perimeter(){
        return 2 * (length + width);
    }
}

public class Area_perimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true) { 
            System.out.println("\n Menu");
            System.out.println("1.Calculate Circle");
            System.out.println("2.Calculate Rectangle");
            System.out.println("3.Exit");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the radius of Circle:");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of Circle:" + circle.area());
                System.out.println("Perimeter of circle:" + circle.perimeter());
                break;
                case 2:
                System.out.println("Enter the Length & Width");
                double length = sc.nextDouble();
                double width = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of Rectangle:" +rectangle.area());
                System.out.println("Perimeter of Rectangle:" +rectangle.area());
                break;
                case 3:
                System.out.println("Exiting.....");
                sc.close();
                System.exit(0);
                break;
                default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }
}
