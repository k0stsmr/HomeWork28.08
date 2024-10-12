import java.util.Random;
public class HomeTask05
{
    public static void main(String[] args)//поиск повторяющихся значений в массиве
    {
        int[][] random = new int[10][2];
        int count=0;
        Random rnd = new Random();
        System.out.println("Сгенерированный случайный массив:");
        System.out.print("[");
        for (int i = 0; i < 10; i++) //заполнение массива
        {
            random[i][0] = rnd.nextInt(-10,11);
            random[i][1] = 0;
            System.out.printf(" %d", random[i][0]);
        }
        System.out.println("]");
        System.out.println("Повторяющиеся значения:");

        for (int i = 0; i < 10; i++)
        {
            if (random[i][1] == 0)
            {
                for (int j = i+1 ; j < 10; j++)
                {
                    if (random[i][0] == random[j][0])
                    {
                        count++;
                        random[i][1] = 1;
                        random[j][1] = 1;
                    }
                }
            }
            else continue;

            if (random[i][1] !=0) //вывод повторяющихся значений
            {
                if (count == 2 || count == 3 || count == 4) System.out.printf("%d - %d раза%n", random[i][0], count);
                else System.out.printf("%d - %d раз%n", random[i][0], count);// поигрался со склонениями )))
                count = 0;
            }
        }
    }
}