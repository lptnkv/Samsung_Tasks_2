import java.util.Scanner;

public class program1_7_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        x = Math.abs(x);
        int min = 9;
        while (x != 0) {
            min = x % 10 == 0 ? min : Math.min(x % 10, min);
            x /= 10;
        }
        System.out.println(min);
    }
}
