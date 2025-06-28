public class Pat14 {

    static void pattern14(int N)
    {
        for (int i = 0; i <= N; i++)
        {
            for(char ch = 'A'; ch<='A'+i;ch++){

                System.out.print(ch + " ");

            }

            System.out.println();
        }
    }

}
