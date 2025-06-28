public class Pro13 {
    static void Pro13(int N){

        int result = 0;
        while(N != 0)
        {
            int pick_last = N % 10;
            result = result + pick_last;
            N = N / 10;
        }
        if(N % result == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}
    