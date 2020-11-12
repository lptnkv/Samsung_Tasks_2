import java.util.Scanner;

public class program1_7_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 10;
        int sum = 0;
        while(true) {
            x = in.nextInt();
            if (x / 10 > 0 && x / 10 < 10){
                sum = sum + x % 10 + x / 10;
            }
            else {
                break;
            }
        }
        System.out.println(sum);
    }
}
