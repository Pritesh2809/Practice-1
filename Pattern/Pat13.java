public class Pat13 {

    static void pattern13(int N)
    {
        int num = 0;
        for (int i = 0; i <= N; i++)
        {
            for (int j = 0; j < i; j++)
            {
                num = num +1;
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}
