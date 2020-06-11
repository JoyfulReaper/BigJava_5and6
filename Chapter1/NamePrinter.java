import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("");

        printLines(name.length());
        System.out.println("\n|" + name + "|");
        printLines(name.length());

        in.close();
    }

    public static void printLines(int number) 
    {
        System.out.print("+");
        for(int i = 0; i < number; i++)
        {
            System.out.print("-");
        }
        System.out.print("+");
    }
}