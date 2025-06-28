public class Pat4 {
    static void pattern4(int N)
    {
        for (int i = 0; i <= N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        System.out.println();
    }
}