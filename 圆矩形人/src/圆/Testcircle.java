package 圆;

import 圆.Circle;

public class Testcircle {
    public static void main(String[] args) {
        Circle c1=new Circle(20);
        double s=c1.getArea();
        System.out.println("c1的面积是："+s);
        Circle c2=new Circle();
        c2.setRadius(15);
        double perimeter=c2.getPerimeter();
        System.out.println("c2的周长是"+perimeter);
    }
}
