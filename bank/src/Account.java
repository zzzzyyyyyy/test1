import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.nio.channels.Pipe;
import java.util.Date;

public class Account {
    public static int numofAccount=0;
    public static double sum=0;
    public static double ss=0;
    private String id,name;
    private double balance;
    private Date datetime;
    //public void setSum(double sum){this.sum=sum;}
    //public double getSum(){return sum;}
    //public void setNumofAccount(int numofAccount){this.numofAccount=numofAccount;}
    //public int getNumofAccount(){return numofAccount;}
    public String getId(){return id;}
    public void setId(String id){this.id=id;}
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance=balance;}
    public Date getDatetime(){return datetime;}
    public void setDatetime(Date datetime){this.datetime=datetime;}
    public Account(String id,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
        this.datetime=new Date();
        numofAccount++;
    }
    public Account(){
        this.id="";
        this.name="";
        this.balance=0;
        this.datetime=new Date();
        numofAccount++;
    }
    public void deposite(double money){this.balance=this.balance+money;
    this.sum=this.balance+ money;
    this.ss=this.balance+money;}
    public void withdraw(double money){
        if (this.balance<money){
            System.out.println("您的余额不足，不能取钱");
            return;
        }
        this.balance=this.balance-money;
        this.sum=this.sum-money;
        this.ss=this.ss-money;
    }
    public void changeMoney(Account other,double money){
        if (this.balance<money){
            System.out.println("您的余额不足，不能转账");
            return;
        }
        this.balance=this.balance-money;
        other.balance=other.balance+money;
    }
    public void print(){
        System.out.println("账号:"+id+" 户名:"+name+" 余额:"+balance);
    }
}
