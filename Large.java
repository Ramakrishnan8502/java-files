import java.util.*;
public class Large{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int max=0;
        for(int i=0;i<n-2;i++){
            String sub =s.substring(i,i+3);
            int n1=Integer.parseInt(sub);
            if(max<n1){
                max=n1;
            }
        }
        System.out.println(max);
    }
}