import java.util.*;
public class Shape1 {
    public static void main(String ar[]){
   Scanner sc = new Scanner(System.in);
   int a=sc.nextInt();
   if(a==1){
       int rad=sc.nextInt();
       Circlearea(rad);
     }  else if(a==2){
         int length=sc.nextInt();
         int bredth=sc.nextInt();
         Recarea(length, bredth);
     }else if(a==3){
         int lengthS=sc.nextInt();
         Square(lengthS);
     }else{
         System.out.println("Invalid Input");
     }
    }

public static void  Circlearea(int rad){
  double  cirarea=0;
  cirarea =((3.14)*(rad*rad));
  System.out.println("Circle area "+ cirarea);
}public static void  Recarea(int length,int breadth){
    int area=0;
    area= (length*breadth);
    System.out.println("Rec area "+ area);
}
public static void  Square(int lengthS){
    int areaS =0;
     areaS=(lengthS*lengthS);
     System.out.println("Square area "+ areaS);
}
}  

