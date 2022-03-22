import java.util.*;

public class String_arrange {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
            int num=(int)c;
            arr[i]=num;
        }
        //System.out.print(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            for(int j=1;j<n-1;i++){
                if(arr[i]<arr[j]){
                    count=arr[i];
                    arr[i]=arr[j];
                    arr[j]=count;
                    
                   // System.out.println(arr[i]);
                }

            }
         System.out.print(arr[i]);
        }
    }
    
}
