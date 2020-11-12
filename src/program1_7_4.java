import java.util.Scanner;

public class program1_7_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res = 0;
        while (a >= b){
            res += 1;
            a -= b;
        }
        System.out.println(res + " " + a);
    }
}
