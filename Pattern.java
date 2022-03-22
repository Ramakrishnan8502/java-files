import java.util.*;
class Pattern{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=1;j<a;i++){
            if(i+j==a-2){
                System.out.print("b");
            }
            else if(i+j==a){
                System.out.print("a");
            }
            else{
                System.out.print("*");
            }
           }
          
          
          System.out.println();
        }
    }
       
    
}