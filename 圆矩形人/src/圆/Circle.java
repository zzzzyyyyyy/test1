package 圆;

public class Circle {
    private  double radius;
    public Circle(double radius)
    {this.radius=radius;
    }

    public Circle() {

    }


    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public double getPerimeter()
    {
        return 2*radius*Math.PI;
    }
}
