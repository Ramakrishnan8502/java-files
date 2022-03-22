import java.util.LinkedList;
import java.util.Scanner;
public class Sub_sequnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.length();
        LinkedList<Integer> arr= new LinkedList<Integer>();
        for(int i=0;i<=b;i++){
           // arr.add(Integer.parseInt(a.substring(i)));
          // arr.add(Integer.parseInt(a.substring()));
          for(int j=i+1;j<=b;j++){
              System.out.println(a.substring(i, j));
          }

        }
        //System.out.println(arr);
    
}
}