import java.util.*;
import java.text.*;
public class Circle1{
    static  DecimalFormat dp = new DecimalFormat("0.00");
        static void display(int a,int b){
            double c=a;
            double d=b/100;
            double e=b;
            System.out.println("Circle: "+"radius="+c+" "+"color=red");
            System.out.println("Cylinder: "+"radius="+d+" "+"color=red"+"height="+e);
        
        }static void Circle_area(int a){
            double b=a;
            double c=(3.142)*(b*b);
            System.out.println(dp.format(c));
            
        }static void Cylinder_area(int a,int b){
            double c=b/10;
            double d=b;
            double e=(2*3.142*c*d+2*3.142*c*c);
            System.out.println(dp.format(e));
        } static void Cylinder_volume(int a,int b){
            double c=b/100.0;
            double d=(3.142*c*c*b)*100;
             System.out.println(dp.format(d));
        }
        public static void main(String ar[]){
            Scanner sc = new Scanner(System.in);
           
            int a=sc.nextInt();
            int b=sc.nextInt();
            display(a,b);
            Circle_area(a);
            Cylinder_area(a,b);
            Cylinder_volume(a,b);
        }
}
