import java.util.Scanner;

public class Symmetric{ 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of matrix");
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter the Elements");
        for (int i = 0; i < n; i++) {
            for(int j=0; j< n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        boolean Symmetric=true;
        for (int i = 0; i < n; i++) {
            for(int j=0; j< n;j++){
                if(matrix[i][j] != matrix[j][i]){
                    Symmetric=false;
                    break;
                }
            }
        }
        System.out.println(Symmetric? "Symmetric" : "Not Symmetric");
        sc.close();
    } 
}