import java.util.*;
 class Feb9
{
   public static void main(String[] args) {
	    Student obj = new Student();
	    Scanner sc = new Scanner(System.in);
	    obj.sn=sc.next();
	    obj.dep=sc.next();
	    obj.cgpa=sc.nextInt();
	    obj.placement();
	}
}
 class Student{
    String sn;
    String dep;
    int cgpa;
     public void placement(){
       if(cgpa>=7){
           System.out.println("Eligible");
       } else{
           System.out.println("Not Eligible");
       }
    }
}
