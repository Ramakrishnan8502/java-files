import java.util.*;
public class Train_ticket
{
     static Scanner sc= new Scanner(System.in);
          static int upperBredth =3;
		  static int midBredth =3;
		  static int lowerBredth =3;
		  static int user_id=100;
		static  ArrayList<String> Bredthlist = new ArrayList<String>();
		static  ArrayList<Integer> Bredthlist1 = new ArrayList<Integer>();
		    
	public static void Homepage() {
	  boolean loop = true;
	   
	  while(loop==true){
	      System.out.println("1.Book a ticket");
		System.out.println("2.Cancel  ticket");
		System.out.println("3.Available ticket");
		System.out.println("4.Booked a ticket");
		System.out.println("5.Exit");
		System.out.println();
		System.out.println("Enter the number for Choosing");
		int a = sc.nextInt();
		
		switch(a){
		    case 1:
		        TicketBooking();
		        break;
		    case 2:
		        TicketCancel();
		        break;
		    case 3:
		        AvailableTicket();
		        break;
		    case 4:
		        BookedTickets();
		        break;
		    case 5:
		        Exit();
		        loop=false;
		        break;
		}
	      
	  }
		
		}
		public static void TicketBooking(){
		   
		   
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
				Homepage();;
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
				Homepage();
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
				Homepage();
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
		     	public static void TicketCancel(){
		   
		         System.out.println("Ticket cancel  system");
		    }
		   public static void AvailableTicket(){
		      
		       System.out.println("available upper bredth is :"+ upperBredth);
		     System.out.println("available Middle bredth is :"+ midBredth);
		     System.out.println("available  lower bredth is :"+ lowerBredth);
		     String bredth= sc.nextLine();
		   }
		   public static void BookedTickets(){
		   System.out.println("Booked Ticket is + :");
		   for(int i=0;i<Bredthlist.size()-1;i++){
		       System.out.println(Bredthlist.get(i)+" ");
		       System.out.println(Bredthlist.get(i+1)+" ");
		       System.out.println(Bredthlist1.get(i)+" ");
		       System.out.println(Bredthlist1.get(i+1)+" ");
		       
		   }
		   }
		   public static void  Exit(){
		    System.out.println("Thank you ");
		    
		    }
			public static void main(String ar[]){
				Homepage();
			}

		    
		}

