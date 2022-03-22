import java.util.*;
class Array{
    public static void main(String ar[]){
        n=5;
       
        int a[]=new int;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }

            }
            System.out.println(a[i]+" ");


        }


    }
}