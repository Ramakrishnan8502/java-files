import java.util.*;
public class practise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
       String c= a.substring(0,1);
       String d=a.substring(1);
        String b=c.toUpperCase();
        System.out.println(b+d);
    }
}