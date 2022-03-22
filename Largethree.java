import java.util.*;
public class Largethree{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int max=0;
        int temp=0;
        int b[]=new int[n-2];
        for(int i=0;i<n-2;i++){
            String sub =s.substring(i,i+3);
            int n1=Integer.parseInt(sub);
           b[i]=n1;
           

        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-2;j++){
                if(b[i]<b[j]){
                     temp=b[i];
                     b[i]=b[j];
                     b[j]=temp;
                }
            }

        }
        System.out.println(b[0]+" "+b[1]);
        

        
    }
}