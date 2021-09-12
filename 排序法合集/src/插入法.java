import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Arrays;
import java.util.Scanner;
public class 插入法 {
    public static void main(String[] args) {
        System.out.println("请输入数组的个数");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ss.nextInt();
        }
        for (int i = 1; i < n; i++)
            for (int j = i; j >= 1; j--)
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {
                    break;
                }
            System.out.println(Arrays.toString(a));
        }
}