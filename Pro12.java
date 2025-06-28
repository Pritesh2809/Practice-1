public class Pro12 {
    static void Pro12(int N) {
        int num = 1234, reverse = 0, rem;

        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}
