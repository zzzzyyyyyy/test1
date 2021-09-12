import sun.text.resources.cldr.eo.FormatData_eo;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        System.out.println("请输入数组的个数");
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = ss.nextInt();
        }
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
        public static void quickSort ( int[] a, int l, int r){
            int i, j, temp, t;
            if (l > r) {
                return;
            }
            i = l;
            j = r;
            t = a[l];//t是最开始的索引值
            while (i < j) {
                while (t <= a[j] && i < j) {
                    j--;
                }
                while (t >= a[i] && i < j) {
                    i++;
                }
                if (i < j) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            a[l] = a[i];
            a[i] = t;

            quickSort(a, l, j - 1);
            quickSort(a, j + 1, r);
        }
    }

