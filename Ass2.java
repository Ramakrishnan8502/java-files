import java.util.*;
class WorkerDetail{
   public int HRA(int Salary){
       int h=(int)(0.6*Salary);
       return h;
   }
   
}class OfficerSal extends WorkerDetail{
   public int Da(int Salary){
       int d=(int)(0.98*Salary);
       return d;  
   }
   
}class ManagerSal extends WorkerDetail{
   int ca=0;
   int gs=0;
   public int Cityallowance(int Salary){
       ca=(int)((0.2)*Salary);
       return ca;
   }
   public int GrossSalary(int Salary,int hra,int da){
       gs=Salary+Cityallowance(Salary)+hra+da;
       return gs;
   }
   
}
class Ass2{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int Employeecode=sc.nextInt();
       String Employeename=sc.next();
             int Salary=sc.nextInt();
             ManagerSal obj1 = new ManagerSal();
              OfficerSal obj2= new OfficerSal();
             System.out.println("Code :"+Employeecode);
             System.out.println("Name : "+Employeename);
             System.out.println("Salary "+ Salary);
             int hra = obj1.HRA( Salary);
             System.out.println("HRA :"+(double)hra);
             int da= obj2.Da(Salary);
             System.out.println("DA :"+(double)da);
             System.out.println("City Allowance :"+ (double)obj1.Cityallowance(Salary));
             System.out.println("Gross Salary :"+ (double)obj1.GrossSalary(Salary, hra, da));
   }
   
}



