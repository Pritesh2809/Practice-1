public class Pat6 {
    static void pattern6(int N) {
        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N + 1 - i; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }

        System.out.println();
    }
}
