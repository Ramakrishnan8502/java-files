import java.util.*;
public class Power {
    public static void main(String ar[]){
        //int count=0;
        int  k=0;
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length()-1;i++){
            int n=Integer.parseInt(str.substring(i,i+1));
            int m=Integer.parseInt(str.substring(i+1,i+2));
           double count = Math.pow(n,m);
         //System.out.println(count);
            k=(int)(k+count);
        if(i==str.length()-2){
            k=k+m;
        }
    }
       System.out.println(k);
    }
}
