import java.util.Scanner;

public class ArraySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter " +size+" 3elemnts");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to be searched");       
        int key=sc.nextInt(); 
        boolean found = false;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("Element found at index" +i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array");
        }
        sc.close();
    }
}