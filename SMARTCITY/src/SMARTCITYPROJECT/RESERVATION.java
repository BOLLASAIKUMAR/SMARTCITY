package SMARTCITYPROJECT;

import java.util.Scanner;

public class RESERVATION extends LOGIN 
{
	int seats;
	long ph,c;
	String s,d,r;
 public void reservation()
 {
	 System.out.println("*****welcome to airline_reservation******");
	 Scanner scc=new Scanner(System.in);
	 System.out.println("enter phone_num");
	 ph=scc.nextLong();
	 if(ph==al1.getPhn())
	 {
		 System.out.println("enter source ");
		 s=scc.next();
		 System.out.println("enter destination");
		 d=scc.next();
		 System.out.println("enter number of seats");
		 seats=scc.nextInt();
		 al1.setSeats(seats);
		 al1.setSource(s);
		 al1.setDestination(d);
		 if(s.startsWith("hy") && d.startsWith("ban"))
		 {
			 System.out.println("name="+al1.getName());
			 System.out.println("email="+al1.getEmail());
			 System.out.println("phone_num="+al1.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al1.getSource()+"\ndestination="+al1.getDestination());
			 c=4000;
			 r="hyd2ban";
			 al1.setVisa(r);
			 pay=c*al1.getSeats();
			 al1.setPay(pay);
			 System.out.println("Total charges="+al1.getPay());
			 System.out.println("Reservation_id="+al1.getVisa());
		 }
		 else if(s.startsWith("hy") && d.startsWith("ch"))
		 {
			 System.out.println("name="+al1.getName());
			 System.out.println("email="+al1.getEmail());
			 System.out.println("phone_num="+al1.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al1.getSource()+"\ndestination="+al1.getDestination());
			 c=5000;
			 r="hyd2ch";
			 al1.setVisa(r);
			 pay=c*al1.getSeats();
			 al1.setPay(pay);
			 System.out.println("Total charges="+al1.getPay());
			 System.out.println("Reservation_id="+al1.getVisa());
		 }
		 else if(s.startsWith("hy") && d.startsWith("de"))
		 {
			 System.out.println("name="+al1.getName());
			 System.out.println("email="+al1.getEmail());
			 System.out.println("phone_num="+al1.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al1.getSource()+"\ndestination="+al1.getDestination());
			 c=4000;
			 r="hyd2de";
			 al1.setVisa(r);
			 pay=c*al1.getSeats();
			 al1.setPay(pay);
			 System.out.println("Total charges="+al1.getPay());
			 System.out.println("Reservation_id="+al1.getVisa());
		 }
		 else
		 {
			 System.out.println("flights unavailable");
		 }
	 }
	 else if(ph==al2.getPhn())
	 {
		 System.out.println("enter source ");
		 s=scc.next();
		 System.out.println("enter destination");
		 d=scc.next();
		 System.out.println("enter number of seats");
		 seats=scc.nextInt();
		 al1.setSeats(seats);
		 al2.setSource(s);
		 al2.setDestination(d);
		 if(s.startsWith("hy") && d.startsWith("ban"))
		 {
			 System.out.println("name="+al2.getName());
			 System.out.println("email="+al2.getEmail());
			 System.out.println("phone_num="+al2.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al2.getSource()+"\ndestination="+al2.getDestination());
			 c=4000;
			 r="hyd2ban";
			 al2.setVisa(r);
			 pay=c*al2.getSeats();
			 al2.setPay(pay);
			 System.out.println("Total charges="+al2.getPay());
			 System.out.println("Reservation_id="+al2.getVisa());
		 }
		 else if(s.startsWith("hy") && d.startsWith("ch"))
		 {
			 System.out.println("name="+al2.getName());
			 System.out.println("email="+al2.getEmail());
			 System.out.println("phone_num="+al2.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al2.getSource()+"\ndestination="+al2.getDestination());
			 c=5000;
			 r="hyd2ch";
			 al2.setVisa(r);
			 pay=c*al2.getSeats();
			 al2.setPay(pay);
			 System.out.println("Total charges="+al2.getPay());
			 System.out.println("Reservation_id="+al2.getVisa());

		 }
		 else if(s.startsWith("hy") && d.startsWith("de"))
		 {
			 System.out.println("name="+al2.getName());
			 System.out.println("email="+al2.getEmail());
			 System.out.println("phone_num="+al2.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al2.getSource()+"\ndestination="+al2.getDestination());
			 c=4000;
			 r="hyd2de";
			 al2.setVisa(r);
			 pay=c*al2.getSeats();
			 al2.setPay(pay);
			 System.out.println("Total charges="+al2.getPay());			
			 System.out.println("Reservation_id="+al2.getVisa());
		 }
		 else
		 {
			 System.out.println("flights unavailable");
		 }
	 }
	 else if(ph==al3.getPhn())
	 {
		 System.out.println("enter source ");
		 s=scc.next();
		 System.out.println("enter destination");
		 d=scc.next();
		 System.out.println("enter number of seats");
		 seats=scc.nextInt();
		 al1.setSeats(seats);
		 al3.setSource(s);
		 al3.setDestination(d);
		 if(s.startsWith("hy") && d.startsWith("ban"))
		 {
			 System.out.println("name="+al3.getName());
			 System.out.println("email="+al3.getEmail());
			 System.out.println("phone_num="+al3.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al3.getSource()+"\ndestination="+al3.getDestination());
			 c=4000;
			 r="hyd2ban";
			 al3.setVisa(r);
			 pay=c*al3.getSeats();
			 al3.setPay(pay);
			 System.out.println("Total charges="+al3.getPay());

			 System.out.println("Reservation_id="+al3.getVisa());

		 }
		 else if(s.startsWith("hy") && d.startsWith("ch"))
		 {
			 System.out.println("name="+al3.getName());
			 System.out.println("email="+al3.getEmail());
			 System.out.println("phone_num="+al3.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al3.getSource()+"\ndestination="+al3.getDestination());
			 c=5000;
			 r="hyd2ch";
			 al3.setVisa(r);
			 pay=c*al3.getSeats();
			 al3.setPay(pay);
			 System.out.println("Total charges="+al3.getPay());
			 System.out.println("Reservation_id="+al3.getVisa());

		 }
		 else if(s.startsWith("hy") && d.startsWith("de"))
		 {
			 System.out.println("name="+al3.getName());
			 System.out.println("email="+al3.getEmail());
			 System.out.println("phone_num="+al3.getPhn());
			 System.out.println("Travelling route:"+"\nsource="+al3.getSource()+"\ndestination="+al3.getDestination());
			 c=4000;
			 r="hyd2de";
			 al3.setVisa(r);
			 pay=c*al3.getSeats();
			 al3.setPay(pay);
			 System.out.println("Total charges="+al3.getPay());

			 System.out.println("Reservation_id="+al3.getVisa());
		 }
		 else
		 {
			 System.out.println("flights unavailable");
		 }
	 }
 }
}

