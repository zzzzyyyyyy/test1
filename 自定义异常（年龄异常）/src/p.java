public class p {
    public static void main(String[] args) {
        Person p=new Person();
        try {
            p.setAge(500);
        }catch (AgeException e){
            System.out.println("给age赋值错误:"+e.getMessage());
        }
    }
}
