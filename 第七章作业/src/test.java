public class test {
    public static void main(String[] args) {
        String string=null;
        StringBuffer stringBuffer=new StringBuffer();
        long startTime1=System.currentTimeMillis();
        for(int i=1;i<=100000;i++){
            string=string+String.valueOf(i);
        }
        long endTime1=System.currentTimeMillis();
        System.out.println("使用String实现循环，程序的运行时间为:"+(endTime1-startTime1)+"毫秒");
        long startTime2=System.currentTimeMillis();
        for (int i=1;i<=10000;i++){
            stringBuffer=stringBuffer.append(i);
        }
        long endTime2=System.currentTimeMillis();
        System.out.println("使用StringButter实现循环，程序的运行时间为:"+(endTime2-startTime2)+"毫秒");
    }
}
