public class TicketBooking {
    Static Scanner sc = new Scanner(System.in);
    System.out.println("Ticket booking system");
    System.out.println("Enter the User name");
    String username=sc.nextLine();
    sc.nextLine();
    System.out.println("Enter the age");
    int age = sc.nextInt();
    sc.nextLine();
     System.out.println("Enter the bredth (uppper=upp,Middle = mid ,lower = low, ");
     System.out.println();
     System.out.println("available upper bredth is :"+ upperBredth );
     System.out.println("available Middle bredth is :"+midBredth);
     System.out.println("available  lower bredth is :"+lowerBredth);
     String bredth= sc.nextLine();
     if(bredth.equals("upp")){
         upperBredth--;
         Bredthlist.add(username);
         Bredthlist1.add(age);
         user_id = user_id+1;
         Bredthlist1.add(user_id);
        System.out.println("Your ticket book Succsfully");
        System.out.println("Name :"+username);
        System.out.println("age :"+age);
        System.out.println("Reference id :"+user_id);
        System.out.println("The availabele upperBredth is :"+upperBredth);
     }if(bredth.equals("mid")){
         midBredth--;
         Bredthlist.add(username);
         Bredthlist1.add(age);
         user_id = user_id+1;
         Bredthlist1.add(user_id);
        System.out.println("Your ticket book Succsfully");
        System.out.println("Name :"+username);
        System.out.println("age :"+age);
        System.out.println("Reference id :"+user_id);
        System.out.println("The availabele MiddleBredth is :"+midBredth);
     }if(bredth.equals("low")){
         lowerBredth--;
         Bredthlist.add(username);
         Bredthlist1.add(age);
         user_id = user_id+1;
         Bredthlist1.add(user_id);
        System.out.println("Your ticket book Succsfully");
        System.out.println("Name :"+username);
        System.out.println("age :"+age);
        System.out.println("Reference id :"+user_id);
        System.out.println("The availabele MiddleBredth is :"+lowerBredth);
     }
     if(upperBredth<=0){
         System.out.println("The upperBredth is already ful please choose another one");
         TicketBooking();
     }
      if(midBredth<=0){
         System.out.println("The MiddleBredth is already ful please choose another one");
         TicketBooking();
     }
          else if(lowerBredth<=0){
         System.out.println("The lowerBredth is already ful please choose another one");
         TicketBooking();
     }
}
}
