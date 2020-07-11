public class TicTacToeBoardPrinter {
    public static void main(String[] args)
    {
        for(int i = 0; i < 3; i++)
        {
            printBoxTops(3);
            printBoxSides(3);
        }
        printBoxTops(3);
    }

    private static void printBoxTops(int n)
    {
        for(int i = 0; i < n; i++)
            System.out.print("+---");
        System.out.println("+");
    }
    private static void printBoxSides(int n)
    {
        for(int i = 0; i < n; i++)
            System.out.print("|   ");
        System.out.println("|");
    }
}