import java.util.Scanner;

public class ReplaceTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = in.nextLine();
        in.close();

        input = input.replace('s', '$').replace('i', '!');
        System.out.println(input);
    }
}