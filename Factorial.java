import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int fac=1;
        int sum=1;
        //int d=1;
        int b=1;
        int c=1;
        for(int i=2;i<a+1;i++){
          sum=sum*i;
          System.out.print(sum+" ");
        }
    }
}
