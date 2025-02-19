public class MatrixAddition{
    public static void main(String args[]){
        int[][] matrix1={
            {1,2,3},
            {2,4,5},
            {3,6,7},
        };
        int[][] matrix2={
            {6,7,8},
            {8,5,9},
            {2,6,8},
        };
        int [][] result=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Matrix After Addition");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(result[i][j]+ "");
            }
            System.out.println();
        }
        
    }
}