package Ola_Application;

import java.util.Scanner;

public class Ola {
	Cab c;
	Scanner sc=new Scanner(System.in);
	public void makeARide()
	{
		
	  System.out.println("1.Mini 2.prime 3.sweden");
	  switch(sc.nextInt())
	  {
	  case 1:
	  {
		  System.out.println("enter starting point");
		  String x=sc.next();
		  System.out.println("enter Ending point");
		  String y=sc.next();
		  System.out.println("enter km");
		  int km=sc.nextInt();
		  
		  c=new Mini(x,y,km);
		  System.err.println("please wait cab is coming........ ");
		  break;
	  }
	  case 2:
	  {
		  System.out.println("enter starting point");
		  String x=sc.next();
		  System.out.println("enter Ending point");
		  String y=sc.next();
		  System.out.println("enter km");
		  int km=sc.nextInt();
		  
		  c=new Prime(x,y,km);
		  System.err.println("please wait cab is coming........ ");
		  break;
	  }
	  case 3:
	  {
		  System.out.println("enter starting point");
		  String x=sc.next();
		  System.out.println("enter Ending point");
		  String y=sc.next();
		  System.out.println("enter km");
		  int km=sc.nextInt();
		  
		  c=new Sweden(x,y,km);
		  System.err.println("please wait cab is coming........ ");
		  break;
	  }
	  }
	  
	  
	}
	public void cancelARide()
	{
	    c=null;
	    System.out.println("cab is cancelled");
	}
	public void makeAPayment()
	{
		if(c instanceof Mini)
		{
			Mini m=(Mini)c;
			System.out.println("from ="+m.from);
			System.out.println("To ="+m.to);
			System.out.println("Money ="+m.km*m.price);
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
			    System.out.println("payment sucessful");	
			}
			else
			{
				System.out.println("user you have to walk");
			}
		}
		else if(c instanceof Prime)
		{
			Prime m=(Prime)c;
			System.out.println("from ="+m.from);
			System.out.println("To ="+m.to);
			System.out.println("Money ="+m.km*m.price);
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
			    System.out.println("payment sucessful");	
			}
			else
			{
				System.out.println("user you have to walk");
			}
			
		}
		else if(c instanceof Sweden)
		{
			Sweden m=(Sweden)c;
			System.out.println("from ="+m.from);
			System.out.println("To ="+m.to);
			System.out.println("Money ="+m.km*m.price);
			double pay=sc.nextDouble();
			if(pay>=m.km*m.price)
			{
			    System.out.println("payment sucessful");	
			}
			else
			{
				System.out.println("user you have to walk");
			}
		}
	}


}
