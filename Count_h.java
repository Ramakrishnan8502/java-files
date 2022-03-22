import java.util.*;
public class Count_h {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        for(char c:a.toCharArray()){
            if(c=='h'){
                count++;
            }
        }
        System.out.println(count);
    }
}
