public class Pat10 {
    static void pattern10(int N){
    up(N);
    down(N);
    }

    static void up(int N)
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

    static void down(int N) {

        for (int i = 1; i < N; i++) {

            for (int j = 1; j < N + 1 - i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
