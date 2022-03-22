import java.util.*;
public class Example1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>=0;i--){
            for(int j=a;j>=0;j--){
                if(a-1<i+j){
                    System.out.print("*"+" ");
                }
            }System.out.println(  );
        }
    }
    
}
