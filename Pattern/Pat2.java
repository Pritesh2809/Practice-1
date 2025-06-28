public class Pat2 {
    static void pattern2(int N)
    {
        for (int i = 0; i <= N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
