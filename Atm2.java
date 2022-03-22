import java.util.*;
public class Atm2{

    static Scanner sc = new Scanner(System.in);
    static int[] dono = {100,200,500,2000};
    static int[] amnt = {0,0,0,0};
    static int atmbal = 0;
    static void home(){
        System.out.println("Welcome");
        System.out.println("1.Admin");
        System.out.println("2.User");
        System.out.println("Enter here");
        int a= sc.nextInt();
        switch(a){
            case 1:
            System.out.println("\033[H\033[2J");
            admin();
            break;
            case 2:
            System.out.println("\033[H\033[2J");
            user.useraccess();
            break;
            default:
            System.out.println("Invalid Input");
            System.out.println("Press enter to continue");
            sc.nextLine();
            sc.nextLine();
            System.out.println("\033[H\033[2J");
            home();
            break;
        }
    }

    static void admin(){
            System.out.println("Enter name");
            String s=sc.next();
            System.out.println("Enter your Pin");
            int b=sc.nextInt();
            if(s.equals("admin")&&(b==1234)){
                System.out.println("\033[H\033[2J");
                System.out.println("Admin login Succesfull");
                adminlogin();
                }
            else{
                System.out.println("\033[H\033[2J");
                System.out.println("Incorrect name/pin");
                home();
            }
            }

    static void adminlogin(){
                System.out.println("1.Load Amount");
                System.out.println("2.Check balance");
                System.out.println("3.back to main Menu");
                System.out.println("Enter here");
                int c=sc.nextInt();
                    switch(c){
                        case 1:
                        System.out.println("\033[H\033[2J");
                        loadamount();
                        break;
                        case 2:
                        System.out.println("\033[H\033[2J");
                        System.out.println(atmbal);
                        adminlogin();
                        break;
                        case 3:
                        System.out.println("\033[H\033[2J");
                        home();
                        break;
                        default:
                        System.out.println("Invalid input");
                        System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
                        admin();
                        break;
        }
    }

    static void loadamount(){
        for(int i=0;i<4;i++){
            System.out.print("No. of "+dono[i]+"'s -->");
            amnt[i]+=sc.nextInt();
            atmbal+=amnt[i]*dono[i];
        }
        System.out.println("Amount added successfully");
        System.out.println("Press enter to continue");
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("\033[H\033[2J");
        adminlogin();
    }

    public static void main(String args[]){
        home();
    }
    }