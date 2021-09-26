public class ReadSaveTextFile implements IReadSaveData{
    public void saveData(String data){
        System.out.println("将数据保存到了文本文件中");
    }
    public String getData(){
        System.out.println("从文本文件中读取了数据");
        return null;
    }
}

