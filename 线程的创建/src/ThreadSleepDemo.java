public class ThreadSleepDemo extends Thread{
    public void run(){
        for (int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleepDemo t1=new ThreadSleepDemo();
        ThreadSleepDemo t2=new ThreadSleepDemo();
        t1.start();t2.start();
    }
}
