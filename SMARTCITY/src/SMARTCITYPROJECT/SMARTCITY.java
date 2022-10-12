package SMARTCITYPROJECT;

import java.util.Scanner;

public class SMARTCITY {

	public void smart()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("*****welcome to smart_city*****");
		System.out.println("1.AIRLINE_RESERVATION\n2.HOTEL_BOOKING\n3.SHOPPING\n4.TRANSPORTATION\n5.EXIT");
		System.out.println("select any one");
		int o=sc.nextInt();
		
		switch(o)
		{
		case 1:
			AIR a=new AIR();
			a.air();
			break;
			
		case 2:
			HOTELBOOKING h=new HOTELBOOKING();
			h.hotel();
			break;
			
		case 3:
			SHOPPINGMENU s=new SHOPPINGMENU();
			s.shop();
			break;
			
		case 4:
			TRANSPORTATIONMAIN t=new TRANSPORTATIONMAIN();
			t.transport();
			break;
			
		case 5:
			System.exit(0);
			
		}

	 }
	}
	public static void main(String args[])
	{
		SMARTCITY SM=new SMARTCITY();
		SM.smart();
	}

}

