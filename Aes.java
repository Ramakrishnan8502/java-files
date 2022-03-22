import java.util.*;
class Aes{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt();
        int count=1;
        for(int i=0;i<=l;i++){
            for(int j=i+1;j<=l;j++){
                if(i+j/4==l){
                    count=count+1;
                }
            }

        }
        System.out.println(count);
    }
}