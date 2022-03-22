import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.util.Date;
import java.util.*;
 class Event1{
    String name;
    String details;
    String type;
    String OwnerName;
   
    Event1(String name,
    String details,
    String type,
    String OwnerName ){
        this.name=name;
        this.details=details;
        this.OwnerName=OwnerName;
        this.type=type;
   
    }
    
 }
class Exhibition extends Event1{
    int noOfstalls;
  
    Exhibition(String name,String details,String type,String OwnerName,int noOfstalls,double amount,long difference){
    super( name,details,type,OwnerName);
       this.noOfstalls=noOfstalls;
       double b=0;
       b=(0.05*amount*difference*noOfstalls);
       System.out.println(b);
    }

  }


class StageEvent extends Event1{

    int noOfSeats;
    StageEvent(String name,String details,String type,String OwnerName,int noOfSeats,double amount,long difference){
        super(name,details,type,OwnerName);
        this.noOfSeats=noOfSeats;
        double d2=0.0;
        d2=(0.15*amount*difference*noOfSeats);
        System.out.println(d2);
}
        
    }
public class Event{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat ok=new SimpleDateFormat("dd/MM/yyyy");
        int a=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        String details=sc.nextLine();
        String type=sc.nextLine();
        String owner=sc.nextLine();
        double amount=sc.nextDouble();

       if(a==1){
           int noOfstalls =sc.nextInt();sc.nextLine();
           String date1=sc.nextLine();
           String date2=sc.nextLine();
           Date start=ok.parse(date1);
           Date end=ok.parse(date2);
           long diff=end.getTime()-start.getTime();
           long difference = diff/ (1000 * 60 * 60 * 24)% 365;
        //    System.out.println(difference);
           Exhibition obj1 = new Exhibition(name, details, type,owner, noOfstalls, amount, difference);
       }else if(a==2){
           int noOfSeats=sc.nextInt();sc.nextLine();
           String date1=sc.nextLine();
           String date2=sc.nextLine();
           Date start=ok.parse(date1);
           Date end=ok.parse(date2);
           long diff=end.getTime()-start.getTime();
           long difference = diff/ (1000 * 60 * 60 * 24)% 365;
        //    System.out.println(difference);
           StageEvent obj2 =  new StageEvent(name, details, type, owner, noOfSeats, amount, difference);
          }
     }
}