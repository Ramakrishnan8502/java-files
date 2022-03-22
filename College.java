import java.util.*;
 class college1{
    static Scanner sc=new Scanner(System.in);
    String clgname;
    String clgcode;
    public void getclgdetails(){
    
    clgname=sc.nextLine();
    clgcode=sc.nextLine();
}
public void clgdisplay(){
    System.out.println("Clg name is "+clgname);
    System.out.println("College code is "+clgcode);

}
    

} class dept extends college1{
    static Scanner sc = new Scanner(System.in);
    String deptname; 
    String deptcode;
    public void getdeptdetails(){ 
       deptname =sc.nextLine();
       deptcode=sc.nextLine();
    }public void deptdisplay(){
        System.out.println("Dept name is "+ deptname);
    System.out.println("Dept code is "+ deptcode);
    }

}

public class College{
    public static void main(String ar[]){
        dept obj = new dept();
        obj.getclgdetails();
        obj.clgdisplay();
        obj.getdeptdetails();
        obj.deptdisplay();
    }
}