import java.util.*;
class Patient1 {
    String PatientId;
    String Name;
    String Age;
    String Gender;
    String Address;
    String Mobile_Number;
   public void display(String PatientId,String Name,String Age,String Gender,String Address,String Mobile_Number){
    this.PatientId=PatientId;
    this.Name=Name;
    this.Age=Age;
    this.Gender=Gender;
    this.Address=Address;
    this.Mobile_Number=Mobile_Number;
    System.out.println("PID: "+PatientId);
    System.out.println("Name: "+Name);
    System.out.println("Age: "+Age);
    System.out.println("Gender: "+Gender);
    System.out.println("Address: "+Address);
    System.out.println("Mobile Number: "+Mobile_Number);
   }
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        String pid=sc.nextLine();
        String name=sc.nextLine();
        String age=sc.nextLine();
        String gender=sc.nextLine();
        String address=sc.nextLine();
        String mobilenumber=sc.nextLine();;
        String roomnumber=sc.nextLine();
    
       double Consultation_Fee=sc.nextDouble(); 
       double testfee=sc.nextDouble();
       sc.nextLine();
        String doa=sc.next();
     String dischargedate=sc.next();
     
     int nodays=sc.nextInt();
      double roomrent=sc.nextDouble();
      sc.nextLine();
      String dateofbill=sc.nextLine();
        Patient1 obj1 = new Patient1();
        obj1.display(pid,name,age,gender,address,mobilenumber);
        In_patient obj2= new In_patient();
        obj2.display(roomnumber,Consultation_Fee,testfee,doa,dischargedate,nodays,roomrent,dateofbill);
        Bill obj3= new Bill();
        obj3.display(nodays,roomrent,Consultation_Fee,testfee);

    }
    
}class In_patient extends Patient1{
    void display(String Room_Number,Double Consultation_Fee,double Test_Fee,String DOA,String DOC,int NoDays,double Room_Rent,String dob){
        System.out.println("Room Number: "+Room_Number);
        System.out.println("Consultation Fee: "+Consultation_Fee);
        System.out.println("Test Fee: "+Test_Fee);
        System.out.println("DOA: "+DOA);
        System.out.println("Discharge Date: "+DOC);
        System.out.println("Number of Days: "+NoDays);
        System.out.println("Room Rent: "+Room_Rent);
        System.out.println("Date of bill: "+dob);
    }

}class Bill extends In_patient{
    void display(int Number_of_Days,double Room_Rent,double Consultation_Fee,double Test_Fee){
        Double total=0.0;
        total=Room_Rent*Number_of_Days+Consultation_Fee+Test_Fee;
        System.out.println("Total amount: "+total);
    }
}


