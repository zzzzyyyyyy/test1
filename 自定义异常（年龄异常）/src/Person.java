public class Person {
    private String name;
    private int age;
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getAge(){return age;}
    public void setAge(int age) throws AgeException{
        if(age<0||age>200)
            throw new AgeException();
        this.age=age;
    }
}
