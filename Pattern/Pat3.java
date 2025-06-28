public class Pat3 {
    static void pattern3(int N)
    {
        for (int i = 0; i <= N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print((j+1) + " ");
            }

            System.out.println();
        }
    }
}