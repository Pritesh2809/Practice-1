public class Pro11 {
    static void Pro11(int N){
        int num = N, sum = 0;
        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println ("Sum of digits : " + sum);
    }
}
