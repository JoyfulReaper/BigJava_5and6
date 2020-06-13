import java.util.ArrayList;
import java.util.Random;

public class LotteryPrinter
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        System.out.println("Play this combination, it'll make you rich! (Or maybe not)");
        while(list.size() != 6)
        {
            int n = random.nextInt(49) + 1;
            if(!list.contains(n))
                list.add(n);
        }


        StringBuilder sb = new StringBuilder(18);
        for(int n : list)
            sb.append(n).append("-");

        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb.toString());
    }
}