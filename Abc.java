import java.util.*;
public class Main {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a= sc.nextLine();
    int b=a.length();
    char arr[]= new char[b];
     char ch=' ';
    
    for(int i=0;i<b;i++){
        arr[i]=a.charAt(i);
    }
    for(int j=0;j<arr.length;j++){
       for(int k=j+1;k<arr.length;k++){
         
         ch=arr[j];
         arr[j]=arr[k];
         arr[k]=ch;
          System.out.println(Arrays.toString(arr));

       }
     
      
            
    }
    
    }
}
