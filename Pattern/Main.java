import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        while (true) {
            System.out.print("Enter the number: ");
            int N = scanner.nextInt();
            System.out.println("\nChoose a pattern to print:");
            System.out.print("Enter your choice (1 to 13): ");
            int patternChoice = scanner.nextInt();
            switch (patternChoice) {
                case 1:
                    Pat1.pattern1(N);
                    break;
                case 2:
                    Pat2.pattern2(N);
                    break;
                case 3:
                    Pat3.pattern3(N);
                    break;
                case 4:
                    Pat4.pattern4(N);
                    break;
                case 5:
                    Pat5.pattern5(N);
                    break;
                case 6:
                    Pat6.pattern6(N);
                    break;
                case 7:
                    Pat7.pattern7(N);
                    break;
                case 8:
                    Pat8.pattern8(N);
                    break;
                case 9:
                    Pat9.pattern9(N);
                    break;
                case 10:
                    Pat10.pattern10(N);
                    break;
                case 11:
                    Pat11.pattern11(N);
                    break;
                case 12:
                    Pat12.pattern12(N);
                    break;
                case 13:
                    Pat13.pattern13(N);
                    break;
                case 14:
                    Pat14.pattern14(N);
                    break;
                case 15:
                    Pat15.pattern15(N);
                    break;
                case 16:
                    Pat16.pattern16(N);
                    break;
                case 17:
                    Pat17.pattern17(N);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 13.");
            }
            System.out.print("\nDo you want to print another pattern? (yes/no): ");
            choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Program exited.");
                break;
            }
        }
    }
}
