import java.util.Scanner;

public class program1_7_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = 0;
        while (x != 0) {
            if (x % 10 % 2 != 0){
                a = x % 10;
                break;
            }
            x /= 10;
        }
        if (a == 0){
            System.out.println("NO");
        }
        else {
            System.out.println(a);
        }
    }
}
