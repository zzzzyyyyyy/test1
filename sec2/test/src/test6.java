import java.util.Random;

public class test6 {
    public static void main(String[] args) {
    int max=0,min=0,sum=0;
    double aver=0.0;
        Random random=new Random();
        int []a=new int[20];
    for( int i=0; i<20; i++){
      a[i]=random.nextInt(20);
    }
    for ( int i=0; i<20; i++){
        System.out.println("a["+i+"]="+a[i] );
        sum+=a[i];
        aver=sum/20;
    }
    for (int j=0; j<19; j++)
        for (int i=0;i<19-j; i++)
            if (a[i]>a[i+1]){
                int t;
                t=a[i];a[i]=a[i+1];a[i+1]=t;
            }
            System.out.println("max="+a[19]);
            System.out.println("min="+a[0]);
            System.out.println("aver="+aver);
            System.out.println("sum="+sum);
    }
}
