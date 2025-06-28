import java.util.Scanner;

public class Pro4 {
    static void Pro4(int N){
        Scanner scanner = new Scanner(System.in);
        System.out.print("range num for Natural numbers");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = N; i <= b; i++)
            sum = sum + i;
        System.out.println ("The sum is " + sum);
    }
}
