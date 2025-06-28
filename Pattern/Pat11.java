public class Pat11 {
    static void pattern11(int N) {

        int bin = 1;

        for (int i = 0; i < N; i++) {

            if (i % 2 == 0) bin = 1;

            else bin = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(bin);
                bin = 1 - bin;
            }
            System.out.println();
        }
    }
}
