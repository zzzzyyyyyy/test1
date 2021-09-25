package zz1;

public class 蒙特卡洛 {//用蒙特卡洛算法求pi的值
    public static void main(String[] args) {
        double PI=0;
        int N=10000;
        int sum=0;
        double x,y;
        for (int i=0; i<N; i++){
            x=Math.random();
            y=Math.random();
            if (x*x+y*y<1)sum++;
        }
        System.out.println("PI="+(double)sum/N*4);
    }
}
