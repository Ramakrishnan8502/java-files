import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String ar[]){
        
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int arr []= new int[26];
        

     for(int i=0;i<a.length();i++){
         char ch=a.charAt(i);
         int n=ch-97;
         arr[n]=arr[n]+1;
         
            }
     for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
             System.out.println((char)(i+97)+"-->"+arr[i]);
         }
        }
        
    
           
    }
          
        }



