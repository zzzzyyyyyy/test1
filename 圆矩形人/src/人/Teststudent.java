package 人;

public class Teststudent {
    public static void main(String[] args) {
        student ss=new student();
        ss.sex='男';
        ss.age=18;
        ss.name="张三";
        ss.high=175;
        System.out.println("该学生的名字是"+ss.name);
        System.out.println("该学生的身高是"+ss.high);
        System.out.println("该学生的性别是"+ss.sex);
        System.out.println("该学生的年龄是"+ss.age);
        }

}
