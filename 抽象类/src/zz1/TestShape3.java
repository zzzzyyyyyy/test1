package zz1;

public class TestShape3 {
    public double sumCiecle(Circle[] circles){
        double sum=0;
        for (int i=0; i<circles.length; i++)
            sum=sum+circles[i].getArea();
        return sum;
    }
    public double sumRectangle(Rectangle[] rectangles){
        double sum=0;
        for (int i=0; i<rectangles.length; i++)
            sum=sum+rectangles[i].getArea();
        return sum;
    }

    public static void main(String[] args) {
        Circle[] c=new Circle[2];
        Rectangle[] r=new Rectangle[2];
        c[0]=new Circle(3);
        c[1]=new Circle(4);
        r[0]=new Rectangle(4,3);
        r[1]=new Rectangle(5,4);
        TestShape3 ts=new TestShape3();
        System.out.println("sumCircle="+ts.sumCiecle(c));
        System.out.println("sumRectangle="+ts.sumRectangle(r));
    }
}

