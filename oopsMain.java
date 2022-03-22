import java.util.*;
public class oopsMain {
Scanner sc = new Scanner(System.in);
  String n=sc.next();
  String cc=sc.next();
  String ic=sc.next();
  

  public static void main(String[] args) {
    Main myObj1 = new Main();
    Main myObj2 = new Main();
    Main myobj3 = new Main();
    System.out.println("Country Name"+myObj1.n);
    System.out.println("Country Code"+myObj2.cc);
    System.out.println("ISD Code"+myObj2.ic);
  }
}
