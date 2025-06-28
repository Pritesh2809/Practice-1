public class Pat16 {

    static void pattern16(int N)
    {
        for (int i = 0; i <= N; i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i)) + " ");

            }

            System.out.println();
        }
    }

}
