import java.util.*;
public class Diagnol {
    public static void main(String ar[]) 
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b=a;
       int arr[][] = new int[a][b];
       for(int i=0;i<=a-1;i++){
           for(int j=0;j<a;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       int length=arr.length;
       int arr1 [][]= new int[length][length]; 
        int var = 1;
      for(int i=0;i<var;i++){
        for(int j=0;j<var;j++){
           if(arr[i][j]>0){
               arr1[i][j]=arr[i][j];
               var++;
           }
           System.out.print(arr1[i][j]+" ");
        }
       System.out.println();
      }
    }
    
}
