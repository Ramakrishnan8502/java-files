import java.util.*;
public class Find_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter String value here");
       int a=sc.nextInt();
        int arr[][]=new int[a][a];
        int arr1[][]=new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=sc.nextInt();
            }
        }for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            int sum=0;
            for(int j=0;j<a;j++){
                sum=sum+arr[i][j]*arr1[j][i];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        
        
    }
}
