import java.util.*;
public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]= new int[a];
        int count=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]<arr[j]){
                    count=arr[i];
                    arr[i]=arr[j];
                   arr[j]=count;
                    
                }
            }
           
        }for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
