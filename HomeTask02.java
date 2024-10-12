import java.util.Random;

public class HomeTask02
{
    public static void main(String[] args)
    {
        int[] random = new int[30];
        Random rnd = new Random();

        for (int i = 0; i <= 29; i++)
        {
            random[i] = rnd.nextInt(-70,50);
        }
        int maxRnd = random[0];
        int minRnd = random[0];
        for (int j = 0; j <= 29; j++)
        {
            if (random[j] <= minRnd) minRnd = random[j];
            if (random[j] >= maxRnd) maxRnd = random[j];
        }
        System.out.printf("Минимальное случайное число: %d%n", minRnd);
        System.out.printf("Максимальное случайное число: %d", maxRnd);
    }
}