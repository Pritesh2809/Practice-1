public class Pat8 {
    static void pattern8(int N) {
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
