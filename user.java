import java.util.*;
public class user{
    static Scanner sc = new Scanner (System.in);
    static String username[] ={"ram","sam"};
    static int userbalance[]={10000,20000};
    static int pinnumber[]={1234,4321};
    static String bank[]={"SBI","IOB"};
    static int trans1[] ={0,0,0,0,0};
    static int trans2[] ={0,0,0,0,0};
    static int ind = 0,attempt=3;
    static int count1=0;
    static int count2=0;
    static int count3=0;
    static int count4=0;
    static int withdraw=0;
    static void useraccess(){
        System.out.println("Enter name");
            String s=sc.next();
            System.out.println("Enter your Pin");
            int b=sc.nextInt();
            for(int i=0;i<username.length;i++){
                    if(s.equals(username[i])){
                        ind = i;
                        break;
                    }
                    else{
                        System.out.println("User not found");
                        System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        Atm2.home();
                    }
            }

            if(s.equals(username[ind]) && pinnumber[ind]==b){
                if(attempt>0){
                System.out.println("User login successfull");
                System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                userpage();
            }
            else if(attempt==0){
                    System.out.println("Maximum attempts exceeded");
                    System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                    Atm2.home();
                }
            }
            else{
                System.out.println("Incorrect username/pin");
                attempt--;
                System.out.println("Attempts remaining: "+ attempt);
                System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                Atm2.home();
            }
    }

    static void userpage(){
        System.out.println("Welcome");
        System.out.println("1.Withdraw");
        System.out.println("2.Check account balance");
        System.out.println("3.Mini Statement");
        System.out.println("4.Pin change");
        System.out.println("5.back ");
        System.out.println("6.Exit");
        System.out.println("Enter your choice");
        int u=sc.nextInt();
        switch(u){
            case 1:
            System.out.println("\033[H\033[2J");
            withdraw();
            break;
            case 2:
            System.out.println("Your account balance is: "+userbalance[ind]);
            System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
            userpage();
            break;
            case 3:

            ministatement();
            break;
            case 4:
           pinchange();
            break;
            case 5:
            Atm2.home();
            break;
            default:
            System.out.println("Invalid input");
                        System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        userpage();
                         break;
 } 
 }

    static void withdraw(){
        
            System.out.print("Enter amount to be withdrawn: ");
        int as = sc.nextInt();
        if(as<=userbalance[ind] && Atm2.atmbal>=as){
            System.out.println("Amount withdrawal successfull");
         userbalance[ind]-=as;
            Atm2.atmbal-=as;
            withdraw = as;
           count1=userbalance[ind]-as;
           count2=count1-as;
           count3=count2-as;
           count4=count3-as;
        }
        else if(Atm2.atmbal<as){
            System.out.println("Insufficient balance in machine");
        }
        else if(as>userbalance[ind]){
            System.out.println("Insufficient balance");
        }
        System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        userpage();
    }
            
 static void  ministatement(){
            System.out.println("welcome");
            if(userbalance[ind]==count1){
                System.out.println("No_transactions");
            }
             else if(userbalance[ind]<count1){
                 System.out.println("balance amount ="+count1);
                 System.out.println("withdrwal amount ="+(userbalance[ind]-count1));
             }else if(count1<count2){
                System.out.println("balance amount ="+count2);
                System.out.println("withdrwal amount ="+(count1-count2));
             }else if(count2<count3){
                System.out.println("balance amount ="+count3);
                System.out.println("withdrwal amount ="+(count2-count3));
             }else if(count3<count4){
                System.out.println("balance amount ="+count4);
                System.out.println("withdrwal amount ="+(count3-count4));
                System.out.println("Thank you");
                System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        userpage();
             }
        }
            
           
 public static void pinchange(){
                System.out.println("welcome");
                System.out.println("Enter your old Pin");
                int pc=sc.nextInt();
                if(pc==pinnumber[ind]){
                   System.out.println("Enter the new pin number");
                   int np=sc.nextInt();
                   pinnumber[ind]=np;
                   System.out.println("Pin number changed Succesfully");
                   System.out.println("Press enter to continue");
                   sc.nextLine();
                   sc.nextLine();
                   System.out.println("\033[H\033[2J");
                   userpage(); 
                }
                else if(pc!=pinnumber[ind]){
                    System.out.println("Invalid pin ");
                    System.out.println("Press enter to continue");
                    sc.nextLine();
                    sc.nextLine();
                    System.out.println("\033[H\033[2J");
                    userpage();
                }
                
            }
} 