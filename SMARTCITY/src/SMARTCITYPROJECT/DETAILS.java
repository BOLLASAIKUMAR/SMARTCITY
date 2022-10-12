package SMARTCITYPROJECT;

import java.util.Scanner;

public class DETAILS 
{
	String name;
	String source;
	String destination;
	String visa;
	long dob;
	String email;
	long phn;
	long pay;
	
	AIR_LINE al1=new AIR_LINE();
	AIR_LINE al2=new AIR_LINE();
	AIR_LINE al3=new AIR_LINE();
	
	public void registration()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("welcome to online Airline Reservation system");
		
		System.out.println("user 1");
		System.out.println("enter name ");
		name=sc.nextLine();
		
		System.out.println("enter date_of_birth in DDMMYYYY in format");
		dob=sc.nextLong();
		
		System.out.println("enter email");
		email=sc.next();
		
		System.out.println("enter you phn number");
		phn=sc.nextLong();
		
		al1.setName(name);
		al1.setDob(dob);
		al1.setEmail(email);
		al1.setPhn(phn);
		
	
		System.out.println("user 2");
		System.out.println("enter name ");
		name=sc.next();
	
		System.out.println("enter date_of_birth in DDMMYYYY in format");
		dob=sc.nextLong();
		
		System.out.println("enter email");
		email=sc.next();
		
		System.out.println("enter you phn number");
		phn=sc.nextLong();
		
		al2.setName(name);
		al2.setDob(dob);
		al2.setEmail(email);
		al2.setPhn(phn);
		
		System.out.println("user 3");
		System.out.println("enter name ");
		name=sc.next();
		
		System.out.println("enter date_of_birth in DDMMYYYY in format");
		dob=sc.nextLong();
		
		System.out.println("enter email");
		email=sc.next();
		
		System.out.println("enter you phn number");
		phn=sc.nextLong();
		
		al3.setName(name);
		al3.setEmail(email);
		al3.setDob(dob);
		al3.setPhn(phn);
		
	}

}
