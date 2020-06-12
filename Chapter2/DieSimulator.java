import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DieSimulator {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int dies = random.nextInt(1000001);

        System.out.println("Rolling " + dies + " dice becasue I can. Results: ");
        HashMap<Integer, Integer> res = RollSomeDiceses(dies);
        for (Map.Entry m:res.entrySet())
            System.out.println(m.getKey()+": "+m.getValue()); 

        int result = 0;
        System.out.println("\n-1 to quit");
        while(true)
        {
            int roll = random.nextInt(6) + 1;
            System.out.print("Guess the die roll: ");
            result = (int) in.nextDouble();
            if(result == -1)
                break;
            if(result > 6 || result < 1)
                System.out.println("It's a 6 sided die, you will never win like that, LOL!");

            if(roll == result )
                System.out.println("No way! You guessed " + roll + " correctly! You win $0!");
            else
                System.out.println("Nope, I rolled a " + roll + "!");
        }
        in.close();
    }

    public static HashMap<Integer, Integer> RollSomeDiceses(int rolls)
    {
        Random random = new Random();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 1; i < 7; i++)
            map.put(i, 0);

        for(int i = 0; i < rolls; i++)
        {
            int roll = random.nextInt(6) + 1;
            map.put(roll, map.get(roll) + 1);
        }
        return map;
    }
}