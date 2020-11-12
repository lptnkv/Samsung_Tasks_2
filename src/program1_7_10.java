import java.util.Scanner;

public class program1_7_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt() + 1;
        for ( ; x < 10000; x++){
            if(isPrime(x)){
                System.out.println(x);
                break;
            }
        }

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
