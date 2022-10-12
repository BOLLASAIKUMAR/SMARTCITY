package SMARTCITYPROJECT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SHOPPINGMENU extends SHOPPINGDATA {

	public void shop()
	{   
		int key;
		Scanner sc=new Scanner(System.in);
		 System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt(); 
	        Map<Integer,SHOPPINGDATA> cart =new HashMap<>();
	        SHOPPINGDATA C[] = new SHOPPINGDATA[n];  
	        for (int i = 0; i < C.length; i++) 
	        {  
	            C[i] = new SHOPPINGDATA();  
	            C[i].reg(); 
	            cart.put(i,C[i]);
	        } 
	        
	        
	        int ch;
	        do { 
	            System.out.println("***Shopping System Application***");  
	            System.out.println("1. Search Grocery\n 2.Search Electronic\n 3.Search Footwear\n 4.Display all Customers\n 5.Exit");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) 
	                {
	                case 1:
	                	 System.out.println("Enter the Customer_id Again");
	         			Integer k = sc.nextInt();
	         			boolean found=false;
	                        for (int i = 0; i < C.length; i++) {  
	                         found=cart.containsKey(k);
	                            if (found) {
	                            	C[i].log();
	                            	C[i].grocery();
	                                break;  
	                            }  
	                        }  
	                        if (!found) 
	                        {  
	                            System.out.println("Search failed! Customer doesn't exist..!!");  
	                        }  
	                        break;
	                        
	                case 2:
	                	 System.out.print("Enter Customer_id of the visitor: ");  
	                         k = sc.nextInt();  
	                          found=false;
		                        for (int i = 0; i < C.length; i++) {  
		                         found=cart.containsKey(k);
		                            if (found) {
		                            C[i].log();
	                            	C[i].electric();
	                                break;  
	                            }  
	                        }  
	                        if (!found) 
	                        {  
	                            System.out.println("Search failed! Customer doesn't exist..!!");  
	                        }  
	                        break;
	                	
                        
	                case 3:
	                	 System.out.print("Enter Customer_id of the visitor: ");  
	                         k = sc.nextInt();  
	                         found=false;
		                        for (int i = 0; i < C.length; i++) {  
		                         found=cart.containsKey(k);
		                            if (found) {
		                            	C[i].log();
	                            	C[i].footwear();
	                                break;  
	                            }  
	                        }  
	                        if (!found) 
	                        {  
	                            System.out.println("Search failed! Customer doesn't exist..!!");  
	                        }  
	                        break;
                        
	                case 4:
	                	 for(int i=0;i<C.length;i++)
		         	        {  
		         	           C[i].login();
		         	        } 
	                case 5:
	                	SMARTCITY SM=new SMARTCITY();
	        			SM.smart();
	        			break;
	                default:
	                	System.out.println("oops wrong input");
	                	break;
	                	
                        
	                }
				

	      }while(ch!=5);
	        
		}
			
       }

