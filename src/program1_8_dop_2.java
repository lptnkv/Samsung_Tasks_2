import java.util.Scanner;

public class program1_8_dop_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                k++;
            }
        }
        System.out.println(k);
    }
}
