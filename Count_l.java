import java.util.*;

public class Count_l {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='l'){
               count++;
            }
        }
        System.out.println(count);

    }
}
