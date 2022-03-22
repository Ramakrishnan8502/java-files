import java.util.*;
class Countevenodd{
    public static void main(String ar[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int even=0;
        int odd=0;
        int b[]=new int[a];
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
            if(b[i]%2==0){
                even=even+1;
            }
            else{
                odd+=odd+1;
            }
            
        }
        System.out.println(even+" "+odd);
    }
}