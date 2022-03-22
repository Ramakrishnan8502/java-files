public class New{
    public static void main(String ar[]){
        int  n=5;
       // int a[]=new int[n];
        int a[]={5,7,9,2,3};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
            if(a[i]>a[j]){
                a[i]=a[i]+a[j];
                a[j]=a[i]-a[j];
                a[i]=a[i]-a[j];
            }
        }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}