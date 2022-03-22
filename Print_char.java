import java.util.*;
public class Print_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String num="1";
        char letter=' ';
        for(char c:a.toCharArray()){
           
        
            if(!(c>='0' && c<='9')){
                letter=c;
                num="0";
            }else{
                    num+=c;
                    //System.out.println(num);
                    }
                    int n=Integer.parseInt(num);
                   //System.out.println(n);
                    for(int i=0;i<n;i++){
                       System.out.print(letter);
                    }
                }
             }
            }
