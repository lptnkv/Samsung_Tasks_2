import java.util.Scanner;

public class program1_7_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = 0;
        while (a != 0) {
            n += 1;
            a /= 2;
        }
        System.out.println(n);
    }
}
