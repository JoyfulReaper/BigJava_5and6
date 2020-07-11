public class Sum10 {
    public static void main(String[] args)
    {
        System.out.println("Sum of the first 10 positive integers: " + sum(10));
    }

    private static int sum(int n)
    {
        if(n == 1)
            return 1;
        return n + sum(--n);
    }
}