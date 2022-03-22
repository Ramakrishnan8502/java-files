import java.util.*;
 public class Doubleerror{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String d1=sc.nextLine();
        String d2=sc.nextLine();
       int b=Integer.parseInt(d1.substring(7,10));
        int c=Integer.parseInt(d2.substring(7,10));
        int e=c-b;
        double db =(((12.0/100.0)*7000.0)*e);
        System.out.println(db);
    }
}