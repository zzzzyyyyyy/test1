public class BusinessB {
    private IReadSaveData iReadSaveData;
    public IReadSaveData getiReadSaveData(){
        return iReadSaveData;
    }
    public void setiReadSaveData(IReadSaveData iReadSaveData){
        this.iReadSaveData=iReadSaveData;
    }
    public BusinessB(IReadSaveData iReadSaveData){
        this.iReadSaveData=iReadSaveData;
    }
    public void saveData(String data){
        iReadSaveData.saveData(data);
    }
    public String readData(){
        return iReadSaveData.getData();
    }
}
