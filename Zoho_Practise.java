import java.util.*;

import javax.xml.bind.ParseConversionEvent;
public class Zoho_Practise {
    static Scanner sc = new Scanner(System.in);
    public static void main(String ar[]){
    String a=sc.nextLine();
    String num ="";
    char letter=' ';
    for(char c:a.toCharArray()){
        if(!(c>=0 && c<=9)){
           if(num!=""){
            int n= Integer.parseInt(num);
            for(int i=0;i<n;i++){
                System.out.println(letter);
            }
        }
            letter =c;
            num="";

        }else{
            num+=c;
           
        }
        
        
    }
    int n= Integer.parseInt(num);
    for(int i=0;i<n;i++){
        System.out.println(letter);

    }
}
}

