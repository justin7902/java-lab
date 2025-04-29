import java.util.Scanner;

public class SymmetricMatrix {
    // Method to check if the matrix is symmetric
    public static boolean isSymmetric(int[][] matrix, int n) {
        // Check if matrix[i][j] == matrix[j][i] for all i and j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;  // If any element is not equal, matrix is not symmetric
                }
            }
        }
        return true;  // Matrix is symmetric
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read matrix dimensions
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][n];
        
        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is symmetric
        if (isSymmetric(matrix, n)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        
        scanner.close();
    }
}
