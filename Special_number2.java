import java.util.ArrayList;
import java.util.Scanner;
public class Special_number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in=sc.nextInt();
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        while(in!=0){
            if((in%10)!=0)
           // System.out.println("%10 "+in%10);
                one.add(in%10);
            if((in%100)>9)
           // System.out.println("%100 :"+in%100);
                two.add(in%100);
            in=in/10;
        }
       // System.out.println(one);
        //System.out.println(two);
        int res=two.get(0);
        int mx=0;
        for(int i=0;i<two.size();i++){
            int max=0;
            for(int j=0;j<one.size();j++){
                if(two.get(i)%one.get(j)==0){
                    max++;
                }
            }
            for(int j=0;j<two.size();j++){
                
                    System.out.println(two.get(i)%two.get(j));
                    max++;
                }
            }
            //System.out.println(two.get(i)+" "+max+" "+mx);
            if(mx<=max){
                if(mx==max && res<two.get(i)){
                    res=two.get(i);
                }
                else if(mx<max){
                    res=two.get(i);
                }
                mx=max;
            }
        }
        //System.out.println(res);
        sc.close();        
    }
}
