import java.util.Scanner;

public class StairCase {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many stairs? ");

        printStairs(in.nextInt());

        in.close();
    }

    public static void printStairs(int boxes)
    {
        int boxWidth = 5;
        for(int i = 0; i < boxes; i++)
        {
            int spacesBefore = ((boxWidth - 1) * (boxes - i) - (boxWidth - 1));
            for(int j = 0; j <= i; j++)
            {
                // Print the top
                if(j == 0)
                    System.out.print(" ".repeat(spacesBefore));
                System.out.print("+---");
            }
            System.out.print("+\n");

            for(int j = 0; j <=i; j++)
            {
                // Print the sides
                if(j == 0)
                    System.out.print(" ".repeat(spacesBefore));
                System.out.print("|   ");
            }
            System.out.print("|\n");
        }
        // Print the bottom
        for(int i = 0; i < boxes; i++)
            System.out.print("+---");
            System.out.println("+");
    }
}