import java.util.Scanner;

public class program1_7_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = n - 1;
        int sum = 0;
        while (n > 25){
            sum += n;
            n -= 2;
        }
        System.out.println(sum);
    }
}
