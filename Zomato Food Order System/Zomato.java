package Zomato_Food_Order_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Zomato 
{
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	Hotel h;
	int order;
	
	public void createAccount()
	{
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		Account a=new Account(name,address);
		al.add(a);
		System.out.println("account is added");
		System.out.println("1.continue 2.stop");
		if(sc.nextInt()==1)
			choosehotel();
	}
	public void choosehotel()
	{
		System.out.println("enter name");
		String name=sc.next();
		for(int i=0;i<al.size();i++)
		{
			Object obj=al.get(i);
			Account a=(Account)obj;
			if(name.equals(a.name))
			{
				System.out.println("1.a1 hotel 2.a2 hotel 3.a3 hotel");
				switch(sc.nextInt())
				{
				case 1:
					h=new A1Hotel();
					System.out.println("a1 hotel is choosed ");
				     return;
				case 2:
					h=new A2Hotel();
					System.out.println("a2 hotel is choosed");
					return;
				case 3:
					h=new A3Hotel();
					System.out.println("a3 hotel is choosed");
					return;
					
					default:
						return;
				}
			}
			
		}
		System.out.println("user name is not found");
		
	}
	public void makeAOrder()
	{
		
		boolean control=false;
		if(h instanceof A1Hotel)
		{
			order=0;
			A1Hotel a1=(A1Hotel)h;
			do
			{
			    System.err.println("1."+a1.food1+"  "+a1.food1price1);	
			    System.err.println("2."+a1.food2+"  "+a1.food1price2);	
			    System.err.println("3."+a1.food3+"  "+a1.food1price3);	
			    System.err.println("4."+a1.food4+"  "+a1.food1price4);	
			    System.err.println("5."+a1.food5+"  "+a1.food1price5);	
			    System.err.println("6."+a1.food6+"  "+a1.food1price6);	
			    System.err.println("7."+a1.food7+"  "+a1.food1price7);	
			    System.err.println("8."+a1.food8+"  "+a1.food1price8);	
			    switch(sc.nextInt())
			    {
			    case 1:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty1=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    case 2:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty2=sc.nextInt();
			    	  order++;
			    	break;
			    case 3:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty3=sc.nextInt();
			    	  order++;
			    	break;
			    case 4:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty4=sc.nextInt();
			    	  order++;
			    	break;
			    case 5:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty5=sc.nextInt();
			    	  order++;
			    	break;
			    case 6:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty6=sc.nextInt();
			    	  order++;
			    	break;
			    case 7:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty7=sc.nextInt();
			    	  order++;
			    	break;
			    case 8:
			    	System.out.println("plese enter qty"+(char)2);
			    	a1.qty8=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    }
			  
			  
			 System.out.println("1.you wanna order 2.stop"); 
			 if(sc.nextInt()==1)
				 control=true;
			 else
				 control=false;
			}
			while(control);
		}
		else if(h instanceof A2Hotel)
		{
			A2Hotel a2=(A2Hotel)h;
			do
			{
			    System.err.println("1."+a2.food1+"  "+a2.food1price1);	
			    System.err.println("2."+a2.food2+"  "+a2.food1price2);	
			    System.err.println("3."+a2.food3+"  "+a2.food1price3);	
			    System.err.println("4."+a2.food4+"  "+a2.food1price4);	
			    System.err.println("5."+a2.food5+"  "+a2.food1price5);	
			    System.err.println("6."+a2.food6+"  "+a2.food1price6);	
			    System.err.println("7."+a2.food7+"  "+a2.food1price7);	
			    System.err.println("8."+a2.food8+"  "+a2.food1price8);	
			    switch(sc.nextInt())
			    {
			    case 1:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty1=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    case 2:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty2=sc.nextInt();
			    	  order++;
			    	break;
			    case 3:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty3=sc.nextInt();
			    	  order++;
			    	break;
			    case 4:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty4=sc.nextInt();
			    	  order++;
			    	break;
			    case 5:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty5=sc.nextInt();
			    	  order++;
			    	break;
			    case 6:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty6=sc.nextInt();
			    	  order++;
			    	break;
			    case 7:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty7=sc.nextInt();
			    	  order++;
			    	break;
			    case 8:
			    	System.out.println("plese enter qty"+(char)2);
			    	a2.qty8=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    }
			  
			  
			 System.out.println("1.you wanna order 2.stop"); 
			 if(sc.nextInt()==1)
				 control=true;
			 else
				 control=false;
			}
			while(control);
		
		}
		else if(h instanceof A3Hotel)
		{
			A3Hotel a3=(A3Hotel)h;
			do
			{
			    System.err.println("1."+a3.food1+"  "+a3.food1price1);	
			    System.err.println("2."+a3.food2+"  "+a3.food1price2);	
			    System.err.println("3."+a3.food3+"  "+a3.food1price3);	
			    System.err.println("4."+a3.food4+"  "+a3.food1price4);	
			    System.err.println("5."+a3.food5+"  "+a3.food1price5);	
			    System.err.println("6."+a3.food6+"  "+a3.food1price6);	
			    System.err.println("7."+a3.food7+"  "+a3.food1price7);	
			    System.err.println("8."+a3.food8+"  "+a3.food1price8);	
			    switch(sc.nextInt())
			    {
			    case 1:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty1=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    case 2:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty2=sc.nextInt();
			    	  order++;
			    	break;
			    case 3:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty3=sc.nextInt();
			    	  order++;
			    	break;
			    case 4:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty4=sc.nextInt();
			    	  order++;
			    	break;
			    case 5:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty5=sc.nextInt();
			    	  order++;
			    	break;
			    case 6:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty6=sc.nextInt();
			    	  order++;
			    	break;
			    case 7:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty7=sc.nextInt();
			    	  order++;
			    	break;
			    case 8:
			    	System.out.println("plese enter qty"+(char)2);
			    	a3.qty8=sc.nextInt();
			    	  order++;
			    	break;
			    	
			    }
			  
			  
			 System.out.println("1.you wanna order 2.stop"); 
			 if(sc.nextInt()==1)
				 control=true;
			 else
				 control=false;
			}
			while(control);
		}
		
	}
	public void bill()
	{
	{
		 double sum=0;
		int list=0;
	    if(order==0)
	    	System.out.println("please order some food");
	    else
	    {
	    	if(h instanceof A1Hotel)
	    	{
	    	 	A1Hotel a1=(A1Hotel)h;
	    	 	if(a1.qty1!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food1+"  "+a1.food1price1+"  "+a1.qty1+" = "+a1.qty1*a1.food1price1);
	    	 	     sum=sum+a1.qty1*a1.food1price1;
	    	 	}
	    	 	if(a1.qty2!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food2+"  "+a1.food1price2+"  "+a1.qty2+" = "+a1.qty2*a1.food1price2);
	    	 		 sum=sum+a1.qty2*a1.food1price2;
	    	 	}
	    	 	if(a1.qty3!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food3+"  "+a1.food1price3+"  "+a1.qty3+" = "+a1.qty3*a1.food1price3);
	    	 		 sum=sum+a1.qty3*a1.food1price3;
	    	 	}
	    	 	if(a1.qty4!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food4+"  "+a1.food1price4+"  "+a1.qty4+" = "+a1.qty4*a1.food1price4);
	    	 		 sum=sum+a1.qty4*a1.food1price4;
	    	 	}
	    	 	if(a1.qty5!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food5+"  "+a1.food1price5+"  "+a1.qty5+" = "+a1.qty5*a1.food1price5);
	    	 		 sum=sum+a1.qty5*a1.food1price5;
	    	 	}
	    	 	if(a1.qty6!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food6+"  "+a1.food1price6+"  "+a1.qty6+" = "+a1.qty6*a1.food1price6);
	    	 		 sum=sum+a1.qty6*a1.food1price6;
	    	 	}
	    	 	if(a1.qty7!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food7+"  "+a1.food1price7+"  "+a1.qty7+" = "+a1.qty7*a1.food1price7);
	    	 		 sum=sum+a1.qty7*a1.food1price7;
	    	 	}
	    	 	if(a1.qty8!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a1.food8+"  "+a1.food1price8+"  "+a1.qty8+" = "+a1.qty8*a1.food1price8);
	    	 		 sum=sum+a1.qty8*a1.food1price8;
	    	 	}
	    	 	System.out.println("_________________________________________________");
	    	 	
	    	 	System.out.println("                          "+sum);
	    	 	
	    	 	
	    	}
	    	else if(h instanceof A2Hotel)
	    	{
	    		A2Hotel a2=(A2Hotel)h;
	    	 	if(a2.qty1!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food1+"  "+a2.food1price1+"  "+a2.qty1+" = "+a2.qty1*a2.food1price1);
	    	 	     sum=sum+a2.qty1*a2.food1price1;
	    	 	}
	    	 	if(a2.qty2!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food2+"  "+a2.food1price2+"  "+a2.qty2+" = "+a2.qty2*a2.food1price2);
	    	 		 sum=sum+a2.qty2*a2.food1price2;
	    	 	}
	    	 	if(a2.qty3!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food3+"  "+a2.food1price3+"  "+a2.qty3+" = "+a2.qty3*a2.food1price3);
	    	 		 sum=sum+a2.qty3*a2.food1price3;
	    	 	}
	    	 	if(a2.qty4!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food4+"  "+a2.food1price4+"  "+a2.qty4+" = "+a2.qty4*a2.food1price4);
	    	 		 sum=sum+a2.qty4*a2.food1price4;
	    	 	}
	    	 	if(a2.qty5!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food5+"  "+a2.food1price5+"  "+a2.qty5+" = "+a2.qty5*a2.food1price5);
	    	 		 sum=sum+a2.qty5*a2.food1price5;
	    	 	}
	    	 	if(a2.qty6!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food6+"  "+a2.food1price6+"  "+a2.qty6+" = "+a2.qty6*a2.food1price6);
	    	 		 sum=sum+a2.qty6*a2.food1price6;
	    	 	}
	    	 	if(a2.qty7!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food7+"  "+a2.food1price7+"  "+a2.qty7+" = "+a2.qty7*a2.food1price7);
	    	 		 sum=sum+a2.qty7*a2.food1price7;
	    	 	}
	    	 	if(a2.qty8!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a2.food8+"  "+a2.food1price8+"  "+a2.qty8+" = "+a2.qty8*a2.food1price8);
	    	 		 sum=sum+a2.qty8*a2.food1price8;
	    	 	}
	    	 	System.out.println("_________________________________________________");
	    	 	
	    	 	System.out.println("                          "+sum);
	    	 		
	    	}
	    	else if(h instanceof A3Hotel)
	    	{
	    		A3Hotel a3=(A3Hotel)h;
	    	 	if(a3.qty1!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food1+"  "+a3.food1price1+"  "+a3.qty1+" = "+a3.qty1*a3.food1price1);
	    	 	     sum=sum+a3.qty1*a3.food1price1;
	    	 	}
	    	 	if(a3.qty2!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food2+"  "+a3.food1price2+"  "+a3.qty2+" = "+a3.qty2*a3.food1price2);
	    	 		 sum=sum+a3.qty2*a3.food1price2;
	    	 	}
	    	 	if(a3.qty3!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food3+"  "+a3.food1price3+"  "+a3.qty3+" = "+a3.qty3*a3.food1price3);
	    	 		 sum=sum+a3.qty3*a3.food1price3;
	    	 	}
	    	 	if(a3.qty4!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food4+"  "+a3.food1price4+"  "+a3.qty4+" = "+a3.qty4*a3.food1price4);
	    	 		 sum=sum+a3.qty4*a3.food1price4;
	    	 	}
	    	 	if(a3.qty5!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food5+"  "+a3.food1price5+"  "+a3.qty5+" = "+a3.qty5*a3.food1price5);
	    	 		 sum=sum+a3.qty5*a3.food1price5;
	    	 	}
	    	 	if(a3.qty6!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food6+"  "+a3.food1price6+"  "+a3.qty6+" = "+a3.qty6*a3.food1price6);
	    	 		 sum=sum+a3.qty6*a3.food1price6;
	    	 	}
	    	 	if(a3.qty7!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food7+"  "+a3.food1price7+"  "+a3.qty7+" = "+a3.qty7*a3.food1price7);
	    	 		 sum=sum+a3.qty7*a3.food1price7;
	    	 	}
	    	 	if(a3.qty8!=0)
	    	 	{
	    	 		System.err.println(++list+" ."+a3.food8+"  "+a3.food1price8+"  "+a3.qty8+" = "+a3.qty8*a3.food1price8);
	    	 		 sum=sum+a3.qty8*a3.food1price8;
	    	 	}
	    	 	System.out.println("_________________________________________________");
	    	 	
	    	 	System.out.println("                          "+sum);
	    	}
	    	
	    }
	}
	}
}


