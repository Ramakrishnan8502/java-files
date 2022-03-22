import java.util.HashSet;
import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="naveen";
        int n=str.length();
        for(int i=0;i<Math.pow(n, n);i++){
            // System.out.println(i);
            String s=String.format("%"+n+"s",Integer.toString(i,n)).replace(" ","0");
            // System.out.println(s);
            HashSet<String>hs=new HashSet<>();
            for(int j=0;j<s.length();j++){
                hs.add(s.charAt(j)+"");
            }
            if(hs.size()==n){
                String ss="";
                for(int j=0;j<s.length();j++){
                    ss+=str.charAt(Integer.parseInt(s.charAt(j)+""))+"";
                }
                System.out.println(ss);
            }
        }
    }
}