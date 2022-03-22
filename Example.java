import java.util.*;
public class Example {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                
                    if(a-1<=i+j){
                        System.out.print("* ");
                        
                        
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                

                 
               
            }
            
            for(int j=a;j>=1;j--){
                if(a-1!=i+j){
                    System.out.print("* ");
                
                }
                else{
                System.out.print("  ");
                }
            }System.out.println(  );
        }
    }
    

    
