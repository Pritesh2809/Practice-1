public class Pat17 {
    static void pattern17(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N + 1 - i; j++) {
                System.out.print((char)((int)('A'+i)) + " ");
            }

            System.out.println();
        }
        System.out.println();
    }
}
