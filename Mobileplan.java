import java.util.*;
class Mobileplan{
 static Scanner sc = new Scanner(System.in);
    
     static int  a=sc.nextInt();
     static int b=sc.nextInt();
     static int c=sc.nextInt();
     static double A,B;
    public static void main(String args[]){
       
        if(A==B){
            System.out.println("Plan A costs "+A);
            System.out.println("Plan B costs "+B);
            System.out.println("Plan A and B are the same price");
         }else if(A<B){
             System.out.println("Plan A costs "+A);
             System.out.println("Plan B costs "+B);
             System.out.println("Plan B is cheapest");
         }else if(B<A){
             System.out.println("Plan A costs "+A);
             System.out.println("Plan B costs "+B);
             System.out.println("Plan A is cheapest");
         }
    }
    public static void PlanA(){
        
        if(a>100){
           A=(a-100)*0.25+b*0.15+c*0.20; 
        }else{
            A=a*0+b*0.15+c*0.20;
        }
    }
    public static void planB(){
        if(a>250){
            B=(a-250)*0.45+b*0.35+c*0.25;
        }else{
            B=a*0+b*0.35+c*0.25;
        }
    }
}
