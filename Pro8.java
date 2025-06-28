public class Pro8 {
    static void Pro8(int N){


        if (N % 400 == 0)
            System.out.println (N + " is a Leap Year");

        else if (N % 4 == 0 && N % 100 != 0)
            System.out.println (N + " is a Leap Year");

        else
            System.out.println (N + " is not a Leap Year");
    }
}
