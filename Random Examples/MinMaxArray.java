import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args)
    {
        int[] arr = { 1,2,3,4,5 };
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
    
        System.out.println(min + " " + max);
    }
}
