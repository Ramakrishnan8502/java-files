import java.util.*;
 class Country{
    Scanner sc = new Scanner(System.in);
    String na=sc.next();
    String cc=sc.next();
    String ic=sc.next();
    
    public static void  main(String ar[]){
        Country myObj =new Country();
        System.out.println("Country Name : "+myObj.na);
        System.out.println("Country Code : "+myObj.cc);
        System.out.println("ISD Code : "+myObj.ic);
    }
}
