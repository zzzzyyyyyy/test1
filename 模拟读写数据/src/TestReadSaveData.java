public class TestReadSaveData {
    public static void main(String[] args) {
        BusinessA businessA=new BusinessA(new ReadSaveTextFile());
        businessA.saveData("保存到文本文件中");
        BusinessB businessB=new BusinessB(new ReadSaveWordFlie());
        businessB.saveData("保存到word文件中");
    }
}
