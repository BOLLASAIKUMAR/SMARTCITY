package SMARTCITYPROJECT;

import java.util.Scanner;

public class AIR {
	
	public void air()
	{
		int op;
		CANCELLATION r=new CANCELLATION();
		while(true)
		{
		Scanner sa=new Scanner(System.in);
		System.out.println("1.REGISTRATION\n2.LOGIN\n3.RESERVATION\n4.CANCELLATION\n5.EXIT");
		System.out.println("select any one option");
		op=sa.nextInt();
		switch(op)
		{
		case 1:
		r.registration();
		 break;
		
		case 2:
		r.login();
		 break;
		case 3:
		r.reservation();
		 break;
		case 4:
			r.cancel();
			break;
		case 5:
			SMARTCITY SM=new SMARTCITY();
			SM.smart();
			break;
			
		default:
			System.out.println("you have entered wrong input");
			break;

		 }
		}
	}
}
	
      
	