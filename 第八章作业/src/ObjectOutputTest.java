import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {
    public static void main(String[] args) throws Exception{
        ObjectOutputTest test=new ObjectOutputTest();
        Employee em=new Employee(29,"james",4000f);
        test.WriteObj(em);
    }

    public void WriteObj(Object obj) throws Exception{
        FileOutputStream fo=null;
        ObjectOutputStream oos=null;
        fo=new FileOutputStream("D:\\obj.ini");
        oos =new ObjectOutputStream(fo);
        oos.writeObject(obj);
        oos.flush();
        oos.close();
        fo.close();
    }
}
