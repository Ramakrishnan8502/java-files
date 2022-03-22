import java.util.*;
public class Account {
    public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    int acty=sc.nextInt();
    sc.nextLine();
    String name = sc.next();
    String acno=sc.next();
    sc.nextLine();
    double amount = sc.nextDouble();
    sc.nextLine();
    String date1= sc.next();
    String date2=sc.next();
     double ct1=Account.currentaccount(amount,date1,date2);
     double ct2=Account.savingsaccount(amount,date1,date2);
    if(acty==1){
       System.out.println(ct1);
    }else if(acty==2){
        System.out.println(ct2);
    }else{
        System.out.println("Invalid");
    }
    }
    static double currentaccount(double a,String d1,String d2){
        int b=Integer.parseInt(d1.substring(7,10));
        int c=Integer.parseInt(d2.substring(7,10));
        int f=c-b;
        double e=(int)f;
        Double out = (12.0/100.0)*a*e;

        return  out;

    }static double savingsaccount(double a,String d1,String d2){
        int b=Integer.parseInt(d1.substring(7,10));
        int c=Integer.parseInt(d2.substring(7,10));
        int f=c-b;
        double e=(int)f;
        Double out = (5.0/100.0)*a*e;

        return  out;
    }
}
