import java.util.Scanner;

public class program1_8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        for(int i=a;i<=(a+b)/2;i++) {
            int temp=arr[i];
            arr[i]=arr[b+a-i];
            arr[b+a-i]=temp;
        }

        for(int i=c;i<=(c+d)/2;i++) {
            int temp=arr[i];
            arr[i]=arr[d+c-i];
            arr[d+c-i]=temp;
        }
        for (int i = 1; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
