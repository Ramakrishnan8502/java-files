import java.util.*;
public class Example2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=i+1;j<=a;j++){
                if(a-1<=i+j){
                    System.out.print(" "+" * " );
                    System.out.print(" "+" "+" ");
                   
                }
                System.out.println();
                    
            }
        }
    }
    
}
