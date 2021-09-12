import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        System.out.println("请输入数组的个数");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ss.nextInt();
        }
        for (int i = n / 2; i > 0; i = i / 2)
            for (int j = i; j < n; j++) {
                for (int k = j; k >= i;k=k-i ) {
                    if (a[k] < a[k - i]) {
                        int temp = a[k];
                        a[k] = a[k - i];
                        a[k - i] = temp;
                    } else {
                        break;
                    }
                }
            }

        System.out.println(Arrays.toString(a));
    }
}
