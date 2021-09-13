package 矩形;

import java.util.Scanner;

public class Testretangle {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        double x=ss.nextDouble();
        double y=ss.nextDouble();
        rectangle r1=new rectangle(x,y);
        System.out.println("该矩形的面积是:"+r1.getArea());
        System.out.println("该矩形的周长是"+r1.getperimeter());
    }
}
