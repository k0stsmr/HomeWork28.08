import java.util.Random;
import java.util.Scanner;

public class HomeTask10
{
    public static void main(String[] args)//поиск элементы, делящегося без остатка на соседние
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int n = input.nextInt();

        int[] random = new int[n];
        int index=-1;
        Random rnd = new Random();
        System.out.println("Исходный массив:");
        System.out.print("[");
        for (int i = 0; i < n; i++) //заполнение массива
        {
            random[i] = rnd.nextInt(0,34);
            if (i != n-1) System.out.printf("%d, ", random[i]);
            else System.out.printf("%d", random[i]);
        }
        System.out.println("]");
        System.out.println("Индекс элемента, кратного двум соседним:");
        for (int i = 1; i < n-1; i++)
        {
            if (random[i-1] == 0 || random[i+1] == 0) continue;
            if(random[i] % random[i-1] == 0 && random[i] % random[i+1] == 0)
            {
                index = i;
                System.out.println(index);
            }
        }
        if (index == -1) System.out.print(index);
    }
}