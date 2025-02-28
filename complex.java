import java.util.Scanner;
public class complex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of the first complex number");
        double real1=sc.nextDouble();
        double img1=sc.nextDouble();
        System.out.print("Enter the real and imaginary part of the second complex number");
        double real2=sc.nextDouble();
        double img2=sc.nextDouble();
        double sumreal=real1+real2;
        double sumimg=img1+img2;
        System.out.println("Sum="+sumreal + "+" +sumimg+ "i");
        sc.close();
    }
}