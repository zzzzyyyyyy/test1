package zz1;

public class Circle extends Shape{
    private double radius;
    public void setRadius(double radius){this.radius=radius;}
    public double getRadius(){return radius;}
    public Circle(double radius){this.radius=radius;}
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double  getPerimeter(){
        return 2*Math.PI*radius;
    }

}
