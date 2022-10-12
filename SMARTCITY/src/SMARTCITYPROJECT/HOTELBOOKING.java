package SMARTCITYPROJECT;

import java.util.Scanner;


public class HOTELBOOKING {

	public void hotel()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        HOTELDATA C[] = new HOTELDATA[n];  
	        for (int i = 0; i < C.length; i++) 
	        {  
	            C[i] = new HOTELDATA();  
	            C[i].reg();  
	        } 
	        int ch;
	        do {  
	            System.out.println("***Hotel Booking System Application***");  
	            System.out.println("1. Search Hotel\n 2.Search Roomtype\n 3.Display all visitors\n 4.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) 
	                {	  
	                case 1:  
                        System.out.print("Enter phone no of the visitor: ");  
                        long phn_num = sc.nextLong();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(phn_num);  
                            if (found) { 
                            	C[i].searchhotel();
                                break;  
                            }  
                        }  
                        if (!found) 
                        {  
                            System.out.println("Search failed! Visitor doesn't exist..!!");  
                        }  
                        break;
                        
	                case 2:
	                	  System.out.print("Enter Phone No : ");  
	                        phn_num = sc.nextLong();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(phn_num);  
	                            if (found) {  
	                                C[i].stay();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Visitor doesn't exist..!!");  
	                        }  
	                        break; 
	                        
	                case 3:
	                	 for (int i = 0; i < C.length; i++) 
	         	        {  
	         	           C[i].log();
	         	        } 
	                  break;
	                	
	                        
	                case 4:
	                	SMARTCITY SM=new SMARTCITY();
	        			SM.smart();
	        			break;
	                	
	                default :
	                	System.out.println("oops something went wrong");
	                	break;
	                

	       }

      }while(ch!=5);
	}
}

