package zz1;

public class TestShape4 {
    public double sumShape(Shape[] shapes){
        double sum=0;
        for (int i=0; i<shapes.length; i++)
            sum=sum+shapes[i].getArea();
        return sum;
    }

    public static void main(String[] args) {
        Shape[] s=new Shape[4];
        s[0]=new Circle(3);
        s[1]=new Circle(4);
        s[2]=new Rectangle(4,3);
        s[3]=new Rectangle(5,4);
        TestShape4 ts=new TestShape4();
        System.out.println("sumShape="+ts.sumShape(s));
    }
}
