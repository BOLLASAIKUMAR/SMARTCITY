package SMARTCITYPROJECT;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class SHOPPINGDATA 
{    
	  private String name;
	 private String productname,productname2,productname3;
	  private int quantity,quantity2,quantity3,size;
	  private long cost,cost2,cost3;
	  private long totalcost,phone;
	  
	  Scanner sc=new Scanner(System.in);
	  public void reg()
	  {
		System.out.println("Enter a name") ;
		name=sc.next();
		System.out.println("Enter a phone_num");
		phone=sc.nextLong();
		
	  }
	  public void log()
	  {
		  System.out.println("Customer name :"+name) ; 
	  }
	  public void grocery()
		{
			String search;
			try {
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter the name of item ");
			search=s.nextLine();
			
			if(search.startsWith("oil"))
			{	
				productname="oil";
				System.out.println("enter the quantity");
				quantity=s.nextInt();
				cost=180*quantity;	
			}
			else if(search.startsWith("sugar"))
			{
				
				productname2="sugar";
				System.out.println("enter the quantity in kg");
				quantity2=s.nextInt();
				cost2=40*quantity;

				
			}
			else if(search.startsWith("salt"))
			{
				productname3="salt";
				System.out.println("enter the quantity in kg");
				quantity3=s.nextInt();
				cost3=20*quantity;
				
			}
			else
			{
				System.out.println("oops not found");
			}
		}
			catch(InputMismatchException e)
			{
				System.out.println("you have entered wrong type of data");
				grocery();
				
			}	
			catch(Exception e)
			{
				e.printStackTrace();
				grocery();
			}
			finally
			{
				totalcost=cost+cost2+cost3;
			}
			
		}
	  public void electric()
		{
			String search1;
			try
			{
			Scanner k=new Scanner(System.in);
			 System.out.println("welcome to Electronics section");
			   System.out.println("search your items here");
			   search1=k.nextLine();
			   if(search1.equals("mobile"))
			   {
				   productname="mobile";
				  System.out.println("enter your quantity");
				  quantity=k.nextInt();
				  cost=50000*quantity;
				  
			   }
			   else if(search1.equals("laptop"))
			   {
				  productname2="laptop";
				   System.out.println("enter your quantity");
				   quantity2=k.nextInt();
				   cost2=35000*quantity;
				  
				 
			   }
			   else if(search1.equals("mouse"))
			   {
				   productname3="mouse";
				   System.out.println("enter your quantity");
				   quantity3=k.nextInt();
				   cost3=500*quantity;
				  	  
			   }
			}
			catch(InputMismatchException e)
			{
				System.out.println("enter correct data");
				electric();
			}
			catch(Exception e)
			{
				System.out.println("oops");
				electric();
			}
			finally
			{
				totalcost=cost+cost2+cost3;
			}
		}
	  public void footwear() 
		{
			int size;
			String search2;
			Scanner sc=new Scanner(System.in);
			try
			{
			  System.out.println("welcome to Footwear section");
			   System.out.println("search your items here");
			   search2=sc.nextLine();
			   if(search2.equals("shoes"))
			   {
				   productname="shoes";
				   System.out.println("enter your size");
				   size=sc.nextInt();
				   System.out.println("enter your quantity");
				   quantity=sc.nextInt();
				   cost=500*quantity;

			   }
			   else if(search2.equals("sandals"))
			   {
				   productname2="sandals";
				   System.out.println("enter your size");
				   size=sc.nextInt();
				   System.out.println("enter your quantity");
				   quantity2=sc.nextInt();
				   cost2=500*quantity;

			   }
			   else if(search2.equals("slippers"))
			   {
				   productname="slippers";
				   System.out.println("enter your size");
				   size=sc.nextInt();
				   System.out.println("enter your quantity");
				   quantity3=sc.nextInt();
				   cost3=500*quantity;
			   }
			   else
			   {
				   System.out.println("oops not found");
			   }
			  	   
		}
			catch(InputMismatchException e)
			{
				System.out.println("enter correct input type to select");
				footwear();
			}
			catch(Exception e)
			{
				System.out.println("oops");
				footwear();
			}
			finally
			{
				totalcost=cost+cost2+cost3;
			}
		
		}
	  public void login()
	  {
		  System.out.println("Name of the Customer: " + name);  
	        System.out.println("phone no.: " +phone);  
	        System.out.println("Product name1: " +productname+" Quantity :"+quantity+" cost :$"+cost);  
	        System.out.println("Product name1: " +productname2+" Quantity :"+quantity2+" cost :$"+cost2);
	        System.out.println("Product name1: " +productname3+" Quantity :"+quantity3+" cost :$"+cost3); 
	        System.out.println("Total cost :"+totalcost);
	  }
	 
	  

}

