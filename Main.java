

class ComplexNumber {
    double real;  
    double imaginary;  

    // Constructor to initialize the complex number
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add another complex number to the current complex number
    ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;  // Add real parts
        double newImaginary = this.imaginary + other.imaginary;  // Add imaginary parts
        return new ComplexNumber(newReal, newImaginary);  // Return the new complex number
    }

    
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        
        ComplexNumber complexNum1 = new ComplexNumber(3, 4);
        ComplexNumber complexNum2 = new ComplexNumber(1, 2);

        
        ComplexNumber result = complexNum1.add(complexNum2);

    
        System.out.print("Result of adding the two complex numbers: ");
        result.display();
    }
}
