package SMARTCITYPROJECT;

import java.util.Scanner;


public class LOGIN extends DETAILS
{
	long p;
	String e;
public void login()
{
	System.out.println("***welcome to lOGIN_PORTAL*****");
	Scanner s=new Scanner(System.in);
	System.out.println("enter phone number");
	p=s.nextLong();
	System.out.println("enter email_id");
	s.next();
	e=s.nextLine();
	
	
	if((p==al1.getPhn()) || (e.equals(al1.getEmail())))
	{
		System.out.println("welcome "+al1.getName());
		System.out.println("your details");
		System.out.println("date_of_birth="+al1.getDob());
		System.out.println("email_id="+al1.getEmail());
		System.out.println("phone_number="+al1.getPhn());
	}
	else if((p==al2.getPhn()) || (e.equals(al2.getEmail())))
	{
		System.out.println("welcome "+al2.getName());
		System.out.println("your details");
		System.out.println("date_of_birth="+al2.getDob());
		System.out.println("email_id="+al2.getEmail());
		System.out.println("phone_number="+al2.getPhn());
	}
	else if((p==al3.getPhn()) || (e.equals(al3.getEmail())))
	{
		System.out.println("welcome "+al3.getName());
		System.out.println("your details");
		System.out.println("date_of_birth="+al3.getDob());
		System.out.println("email_id="+al3.getEmail());
		System.out.println("phone_number="+al3.getPhn());
	}
	else
	{
		System.out.println("oops data not found");
		LOGIN l=new LOGIN();
		l.login();
	}
}
}

