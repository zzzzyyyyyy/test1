import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        int a = age+100;
        int b=0;
        for ( ; age<=a; age++)
        {

            if((age%4==0)&&(age%100!=0)) {
                b++;
            }
            if (age%400==0){
                b++;
            }
        }
        System.out.println("他一生能过"+b+"个闰年");
    }
}