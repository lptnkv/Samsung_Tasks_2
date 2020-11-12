import java.util.Scanner;

public class program1_7_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = 1;
        while (x / 10 != 0){
            n += 1;
            x /= 10;
        }
        System.out.println(n);
    }
}
