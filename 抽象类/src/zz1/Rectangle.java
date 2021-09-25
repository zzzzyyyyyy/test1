package zz1;

public class Rectangle extends Shape{
    private double x,y;
    public void setX(double x){this.x=x;}
    public double getX(){return x;}
    public void setY(double y){this.y=y;}
    public double getY(){return y;}
    public Rectangle (double x,double y){
        this.x= x;
        this.y= y;
    }
    public double getArea(){
        return x*y;
    }
    public double getPerimeter(){
        return 2*(x+y);
    }
}
