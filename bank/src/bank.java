public class bank {
    public static void main(String[] args) {
        Account zhangSan=new Account("001","张三",1000);
        Account LiSi= new Account("002","李四",1000);
        Account gg=new Account("003","王五",1000);
        zhangSan.deposite(2000);
        LiSi.withdraw(500);
        zhangSan.changeMoney(LiSi,300);
        System.out.println("张三的余额是"+zhangSan.getBalance());
        System.out.println("李四的余额是"+LiSi.getBalance());
        System.out.println("此时银行一个有"+Account.numofAccount+"个账户");
        System.out.println("此时银行的总余额是"+Account.sum);
        System.out.println("今天银行的流水是"+Account.ss);
    }
}
