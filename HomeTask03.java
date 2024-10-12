public class HomeTask03
{
    public static void main(String[] args)//проверка на идентичность элементов массива
    {
        boolean flag = false;
        int[] inputArray = {9,89,89,89,89,89,89,89,89,89,89,89,89,89};
        int etalon = inputArray[0];

        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i] == etalon) flag = true;
            else
            {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}