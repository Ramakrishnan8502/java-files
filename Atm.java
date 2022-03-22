import java.util.*;
public class Atm{
public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("1,Admin");
        System.out.println("2,User");
        System.out.print("Plese Enter");
        int b= sc.nextInt();
      while(b<4){
            if(b==1){
                System.out.print("Enter the User Name ");
               String admname=sc.next();
               System.out.print("Enter the PinNumber ");
               int admpin =sc.nextInt();
               if(admpin!=8502){
                   System.out.println("Invalid Password");
               }
                 else  if(admpin ==8502){
                   System.out.println("1.Load Amount ");
                   System.out.println("2.check balance ");
                   System.out.println("3.back ");
                   System.out.println("Enter here");
                  int a1= sc.nextInt();
                  while(true){
                    System.out.println("Enter the  value of Rs 100 ");
                    int aa=sc.nextInt();
                    System.out.println("Enter the value of Rs 200 ");
                    int bb=sc.nextInt();
                    System.out.println("Enter the value of Rs 500 ");
                    int cc=sc.nextInt();
                    System.out.println("Enter the value of Rs 2000 ");
                    int dd=sc.nextInt();
                    if(a1==1){
                        
                        System.out.println("Your balance amount is :"+(aa*100+bb*200+cc*500+dd*2000));
                        System.out.println("The Amount added Succesfully");
                        System.exit(0);
                        
                      }
                       if(a1==2){
                        System.out.println("This ATM Amount is :"+(aa*100+bb*200+cc*500+dd*2000));
                        System.out.println("The number of 100 is :"+aa+"* 100 ="+aa*100);
                        System.out.println("The number of 200 is :"+bb+"* 200 ="+bb*200);
                        System.out.println("The number of 500 is :"+cc+"* 500 ="+cc*500);
                        System.out.println("The number of 2000 is :"+dd+"* 2000 ="+dd*2000);
                        break;
                          
      }
        
                    }
        
                }else if(b==2){
                   //user
                    
                }
                  }
                 else{
               System.out.print("Invalid Input");
               break;
           }

        }
    }
}