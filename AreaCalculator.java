
import java.util.Scanner;

class Shape{
    double area(double radius){
        return Math.PI*radius*radius;
    }
    double area(double length,double width){
        return length*width;
    }
    double area(double base,double height,boolean isTriangle){
        return 0.5*base*height;
    }
}

public class AreaCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape=new Shape();
        System.out.println("Enter the radius");
        double radius=sc.nextDouble();
        System.out.println("Area of Circle"+ shape.area(radius));
        System.out.println("Enter the length and width");
        double length=sc.nextDouble();
        double width= sc.nextDouble();
        System.out.println("Area of Rectangle" +shape.area(length,width));
        System.out.println("Enter the base and height");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.println("Area of Trianle" +shape.area(base,height,true));
        sc.close();
    }
}