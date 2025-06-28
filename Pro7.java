public class Pro7 {
    static void Pro7(int N){
        int num1 = N, num2 = N*3, num3 = N-2;

        if (num1 >= num2 && num1 >= num3)
            System.out.println (num1 + " is the greatest");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println (num2 + " is the greatest");

        else if (num3 >= num1 && num3 >= num2)
            System.out.println (num3 + " is the greatest");
    }
}
