import java.util.*;
public class Special_number {
   
    public static void main(String[] args) {
        int num=0;
        int val=0;
        int count=0;
         int countmax=0;
         int nummax=0;
         int number =0;
      
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<Integer>arr= new ArrayList<Integer>();
        ArrayList<Integer>arr1= new ArrayList<Integer>();
        
        for(int j=0;j<str.length();j++){
            arr1.add(Integer.parseInt(str.substring(j, j+1)));
        }
       
        for(int i=0;i<str.length()-1;i++){
            arr1.add(Integer.parseInt(str.substring(i, i+2)));
        }
      if(arr1.contains(0)){
        arr1.remove(arr1.indexOf(0));
      }


        for(int i=0;i<str.length()-1;i=i+1){
            arr.add(Integer.parseInt(str.substring(i, i+2)));
        }
        System.out.println(arr1+" "+arr);
           for(int i=0;i<arr.size()-1;i++){
            int n=arr.get(i);
            //System.out.println(n);
           for(int j=1;j<=n;++j){
            if(n%j==0){
                val=j;
                //System.out.println(val);
                if(arr1.contains(val)){
                    count++;
                    System.out.println("Count is :"+count);
                   number=n;
                    System.out.println("number is :"+number);
                   if(countmax<count){
                   
                        countmax=count;
                        number=n;
                    } else if(countmax==count){
                        if(number>n){
                            number = n;
                        }
                    }
                    System.out.println("count max :"+countmax);
                }
                
            }
        }
        count=0;
      
          }
          System.out.println(number);
}
}
