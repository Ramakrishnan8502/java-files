import java.util.*;
public class Matcher{
    String name;
    String username;
    String password;
    String mobileNumber;
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        username = sc.next();
        password = sc.next();
        mobileNumber =sc.next();
    }
    public static void main(String args[]){
        Matcher obj1 = new Matcher();
        obj1.getDetails();
        Matcher obj2 = new Matcher();
        obj2.getDetails();
        if(obj1.mobileNumber.equals(obj2.mobileNumber)){
            System.out.println("Equal");
        }
        
    }
}