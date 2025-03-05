import java.util.Arrays;

public class Sorting{
    public static void main(String[] args){
        String[] words={"Virat", "Jadeja","Zaka","Messi","Anderson"};
        Arrays.sort(words);
        System.out.println("Sorted Strings:");
        for(String word : words){
            System.out.print(word+",");
        }
    }
}