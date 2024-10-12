import java.util.Random;
import java.util.Scanner;

public class HomeTask09
{
    public static void main(String[] args) //заменить все значения меньше 0 на квадраты этих значений
    {
        Scanner input = new Scanner(System.in);
        int n = 10;

        int[] random = new int[n];
        int powflag=0;
        Random rnd = new Random();
        System.out.println("Исходный массив:");
        System.out.print("[");
        for (int i = 0; i < n; i++) //заполнение массива
        {
            random[i] = rnd.nextInt(-2,n+1);
            if (random[i] == -2) powflag = 1;
            if (i != n-1) System.out.printf("%d, ", random[i]);
            else System.out.printf("%d", random[i]);
        }
        System.out.println("]");
        System.out.println("Полученный массив:");
        System.out.print("[");
        for (int i = 0; i < n; i++)
        {
            if(powflag == 1)
            {
                if(random[i] <= -1) random[i] = (int)Math.pow(random[i], 2);//возведение в квадрат чисел <0
            }
            if (i != n-1) System.out.printf("%d, ", random[i]);
            else System.out.printf("%d", random[i]);
        }
        System.out.println("]");
    }
}