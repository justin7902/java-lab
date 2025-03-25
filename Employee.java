import java.util.Scanner;

public class Employee {
    int eNo;
    String eName;
    int eSalary;

    public void read(Scanner sc) { // Pass Scanner object to prevent memory leaks
        System.out.print("Enter ID: ");
        eNo = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        eName = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public void display() {
        System.out.println("Employee Found!");
        System.out.println("ID: " + eNo);
        System.out.println("Name: " + eName);
        System.out.println("Salary: " + eSalary);
    }

    public static void main(String[] args) {
        int n = 3;
        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[n];

        // Reading Employee Data
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read(sc);
        }

        // Employee Search
        while (true) {
            System.out.print("Enter ID to search (or enter -1 to exit): ");
            int No = Integer.parseInt(sc.nextLine());

            if (No == -1) { // Exit condition
                System.out.println("Exiting program...");
                break;
            }

            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (emp[i].eNo == No) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee with ID " + No + " not found.");
            }
        }
        sc.close(); // Close the scanner to prevent memory leaks
    }
}
