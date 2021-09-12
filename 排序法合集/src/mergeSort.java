import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        System.out.println("请输入数组的个数");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ss.nextInt();
        }
        int[] b = new int[a.length];
        mergeSort(a,0,a.length-1,b);
        System.out.println(Arrays.toString(a));
    }


    public static void merge(int[] a, int low, int mid, int high, int[] b) {
        int i = 0;
        int j = low, k = mid + 1;
        while (j <= mid && k <= high) {
            if (a[j] < a[k]) {
                b[i++] = a[j++];
            } else {
                b[i++] = a[k++];
            }
        }
        while (j <= mid) {
            b[i++] = a[j++];
        }
        while (k <= high) {
            b[i++] = a[k++];
        }
        for (int t = 0; t < i; t++) {
            a[low + t] = b[t];
        }
    }

    public static void mergeSort(int[] a, int low, int high, int[] b) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid, b);
            mergeSort(a, mid + 1, high, b);
            merge(a,low,mid,high,b );

        }
    }
}