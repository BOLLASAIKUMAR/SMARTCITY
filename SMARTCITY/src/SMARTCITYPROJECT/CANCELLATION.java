package SMARTCITYPROJECT;

import java.util.Scanner;

public class CANCELLATION extends RESERVATION
{
	long phn;
	String rs;
public void cancel()	
{
	System.out.println("Welcome to Airline_Cancellation_ticket ****");
	Scanner sn=new Scanner(System.in);
   System.out.println("enetr phone number");
   phn=sn.nextLong();
   System.out.println("enter reservation_id");
   rs=sn.next();
   
   if(phn==al1.getPhn())
   {
	   System.out.println("your request for cancelling booking on");
	   System.out.println("RESERVATION_ID="+al1.getVisa());
	   System.out.println("Refund money="+al1.getPay());
	   
   }
   else  if(phn==al2.getPhn())
   {
	   System.out.println("your request for cancelling booking on");
	   System.out.println("RESERVATION_ID="+al2.getVisa());
	   System.out.println("Refund money="+al2.getPay());
	   
   }
   else if(phn==al3.getPhn())
   {
	   System.out.println("your request for cancelling booking on");
	   System.out.println("RESERVATION_ID="+al3.getVisa());
	   System.out.println("Refund money="+al3.getPay());
	   
   }
}
}
