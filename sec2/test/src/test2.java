import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("请输入n的值");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] F =new int[100];
        F[0]=1;F[1]=1;
        for ( int i=0; i<=n; i++){
            if (i>1){
                F[i]=F[i-2]+F[i-1];
            }
        }
        System.out.println("F["+n+"]="+F[n]);
    }
}
