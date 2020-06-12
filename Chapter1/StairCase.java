public class StairCase {
    public static void main(String[] args)
    {
        printBoxes(4);
    }

    public static void printBoxes(int boxes)
    {
        for(int i = 0; i < boxes; i++)
        {
            int spacesBefore = (4 * (boxes - i) - 4);
            for(int j = 0; j <= i; j++)
            {
                if(j == 0)
                    System.out.print(" ".repeat(spacesBefore));
                System.out.print("+---");
            }
            System.out.print("+\n");

            for(int j = 0; j <=i; j++)
            {
                if(j == 0)
                    System.out.print(" ".repeat(spacesBefore));
                System.out.print("|   ");
            }
            System.out.print("|\n");
        }
        for(int i = 0; i < boxes; i++)
            System.out.print("+---");
            System.out.println("+");
    }
}