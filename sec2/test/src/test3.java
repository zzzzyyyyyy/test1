import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a < b) {
            int temp;
            temp=a;a=b;b=temp;
        }
        int c;
        do{
            c=a%b;
            a=b;b=c;
        }while (c!=0);
        System.out.println("这两个数的最大公因数为"+a);
    }
}
