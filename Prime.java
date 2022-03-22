import java.util.*;
class Prime{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        int even=0;
        int odd=0;
        
        for(int i=1;(i<=a.length());i++){
            b[i]=sc.nextInt();
            if(b[i]%2==0){
                even=even+b[i];
            }
              else{
                  odd=odd+b[i];
              }  
            System.out.print(odd+" "+even);
            
            
        }
    
}