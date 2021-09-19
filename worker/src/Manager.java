public class Manager extends worker {
     private double allowance;
     private double wage;
     public void setAllowance(double allowance){this.allowance=allowance;}
     public double getAllowance(){return allowance;}
     public void setWage(double wage){this.wage=wage;}
     public double setWage(){return wage;}

     public Manager(String name, double wage, double allowance) {
         super(name,wage);
         this.allowance = allowance;
     }

     public void increase() {
         this.wage = this.wage + 300;
         this.allowance = this.allowance + 200;
     }

      public void print() {
          System.out.println(getName() + " wage:" + wage);
          System.out.println(getName() + " super wage:" + super.getWage());
         System.out.println(getName() + " allowance:" + allowance);
     }


 }
