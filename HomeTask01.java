public class HomeTask01                 // чётные числа Фиббоначи
{
    public static void main(String[] args)
    {
        long[] fib = new long[15];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= 14; i++)
        {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int j = 0; j < 15; j++)
        {
            if (fib[j] % 2 == 0) System.out.println(fib[j]);
        }
    }
}