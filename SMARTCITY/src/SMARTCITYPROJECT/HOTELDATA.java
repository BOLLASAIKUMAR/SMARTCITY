package SMARTCITYPROJECT;

import java.util.Scanner;
public class HOTELDATA 
{
	
	  private String name;
	  private String email;
	  private String idproof;
	  private String hotel;
	  private String location;
	  private String roomtype;
	  private long phone;
	  private long Budget;
	 private long numofrooms;
	 private String roomnum;
	 private  long total;
	 private  int stay;
	  
	  Scanner sc=new Scanner(System.in);
	  
	  public void reg()
	  {
		  System.out.print("Enter phone Number: ");  
	        phone = sc.nextLong();  
	        System.out.print("Enter Email: ");  
	        email = sc.next();  
	        System.out.print("Enter Name: ");  
	        name = sc.next();  
	        System.out.print("Enter Id_proof: ");  
	        idproof = sc.next();  
	        System.out.println("Enter location :");
	        location=sc.next();
	  }
	  public void login()
	  {
		    System.out.println("Name of the visitor: " + name);  
	        System.out.println("phone no.: " +phone);  
	        System.out.println("ID_proof no: " +idproof);  
	        System.out.println("Email_id: " + email);  
	        System.out.println("Location :"+location);
	  }
	  public void searchhotel()
	  {   
		  System.out.println("Enter the location you want to stay");
		   String l=sc.next();
			
			System.out.println("Hotels available at "+l+" location");
			System.out.println("White Ridge");
			System.out.println("City holiday");
			System.out.println("Hotel Townhouse");
			System.out.println("Taj krishna");
			System.out.println("select any one Hotel from the above ");
			hotel=sc.next();
		    
			
	}
		  
	  public void stay()
	  {
		    System.out.println("Enter room type AC or NON_Ac");
		    
		    
		    roomtype=sc.next();
		    
		    if(roomtype.equalsIgnoreCase("ac"))
		    {
		    	Budget=4000;
			System.out.println("Enter the number of days you want to stay");
			stay=sc.nextInt();
			System.out.println("Enter the number of rooms ");
			numofrooms=sc.nextInt();
			System.out.println("enter the room numbers");
			roomnum=sc.next();
			total=(numofrooms*stay)*Budget;
			System.out.println("Total cost="+ total);
		    }
		    else if(roomtype.equalsIgnoreCase("non ac"))
		    {
		    	Budget=3500;
		    	System.out.println("Enter the number of days you want to stay");
				stay=sc.nextInt();
				System.out.println("Enter the number of rooms ");
				numofrooms=sc.nextInt();
				System.out.println("enter the room numbers");
				roomnum=sc.next();
				total=(numofrooms*stay)*Budget;
				System.out.println("Total cost="+ total);

		    }
			
	  }
	  public void log()
	  {
		    System.out.println("Name of the visitor: " + name);  
	        System.out.println("phone no.: " +phone);  
	        System.out.println("ID_proof no: " +idproof);  
	        System.out.println("Email_id: " + email);  
	        System.out.println("Location :"+location);
	        System.out.println("Hotel name :"+hotel);
	        System.out.println("Type of room :"+roomtype);
	        System.out.println("Number of rooms :"+numofrooms);
	        System.out.println("Room numbers :"+roomnum);
	        System.out.println("Total cost :"+total);
	        
	  }
	  
	  public boolean search(long phn_num) {  
	        if (phone==phn_num) {  
	            login();  
	            return (true);  
	        }  
	        return (false);  
	    }  

}

