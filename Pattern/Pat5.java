public class Pat5 {
    static void pattern5(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N + 1 - i; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }
        System.out.println();
    }
}
