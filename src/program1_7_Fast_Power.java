import java.util.Scanner;

public class program1_7_Fast_Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        int exp = in.nextInt();
        double res = 1;
        while (exp != 0) {
            if (exp % 2 != 0){
                res *= base;
            }
            exp /= 2;
            base *= base;
        }
        System.out.println(res);

    }
}
