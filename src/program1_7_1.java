import java.util.Scanner;

public class program1_7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int n = 0;
        while(x >= 0) {
            x = in.nextInt();
            n++;
        }
        System.out.println(n);
    }
}
