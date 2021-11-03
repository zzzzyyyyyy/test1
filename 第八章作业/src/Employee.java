import java.io.Serializable;
import java.time.format.SignStyle;

public class Employee implements Serializable {
    private int age;
    private  String name;
    private float salary;
    public Employee(int age,String name,float salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        return salary;
    }
    public String toString(){
        return "姓名："+name+",年龄："+age+",工资:"+salary;
    }
}
