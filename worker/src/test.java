public class test {
    public static void main(String[] args) {
    worker w1=new worker("张三",2000);
    w1.increase();
    w1.print();
    Manager w2=new Manager("李四",2000,500);
    w2.increase();
    w2.print();
    worker w3=new Manager("王五",2000,500);
    w3.increase();
    System.out.println("w3.wage="+w3.getWage());
    w3.print();//从中可以看出子类中默认使用的子类定义的属性，除非明确使用super调用
        //当父类和子类定义的方法名一样时，子类对象内存里只有子类定义的方法，不再有父类定义的方法，
        //这种现象称作子类的方法覆盖了父类的同名方法。
}
}

