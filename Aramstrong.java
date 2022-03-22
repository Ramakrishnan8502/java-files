import java.util.*;
public class Aramstrong{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        String num=sc.nextLine();
        int len=num.length();
        int number=Integer.parseInt(num);
        for(int i=0;i<len;i++){
          sum=sum+(int)(Math.pow( Integer.parseInt(num.charAt(i)+""),len));
          System.out.println(sum);
          //sum=0;
        }
        if(sum==number){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");  
        }
    }
}