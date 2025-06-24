package Swiggy_Food_Order_System;

import java.util.Scanner;

public class Swiggy {
	
    Account a;
	Hotel h;
	Scanner sc=new Scanner(System.in);
	public void login()
	{
		if(a==null)
		{
			System.out.println("enter name");
			String userName=sc.next();
			System.out.println("enter pswd");
			int pswd=sc.nextInt();
			System.out.println("enter address");
			String address=sc.next();
			System.out.println("enter cno");
			long cno=sc.nextLong();
		     a=new Account(userName,pswd,address,cno);
		      System.err.println("accout login ed.....");
		   
		}
		else
		{
			System.out.println("first make logout");
		}
	}
	public void logout()
	{
		if(a==null)
		{
			System.out.println("first make login");
		}
		else
		{
			a=null;
			System.err.println("logout.....................");
		}
		
	}
	public void addHotel()
	{
		if(a==null)
		{
			System.out.println("first make login......");
		}
		else
		{
			if(h==null)
			{
				System.out.println("1.veg 2.non veg");
				switch(sc.nextInt())
				{
				case 1:
					h=new Veg();
					System.out.println("you have choosed veg");
					break;
				case 2:
					h=new NonVeg();
					System.out.println("you have choosed non veg");
					break;
				}
			}
			else
			{
				System.out.println("already you choosed hotel");
			}
		}
		
	}
	public void removeHotel()
	{
		if(h==null)
		{
			System.out.println("please add hotel");
		}
		else
		{
			h=null;
			System.out.println("hotel is removed");
		}
	}
	public void orderfood()
	{
		if(a==null)
		{
			System.out.println("first make login");
		}
		else
		{
			if(h instanceof Veg)
			{
				Veg v=(Veg)h;
				for(;;)
				{
					System.err.println("1."+v.food1+"------"+v.priceNaan);
					System.err.println("2."+v.food2+"-------"+v.priceRoti);
				    System.err.println("3."+v.food3+"-------"+v.pricePannerButterMasala);
				    System.out.println("4.enough please brint my order");
				    switch(sc.nextInt())
				    {
				    case 1:
				    {
				    	System.out.println("enter how many naan u need");
				    	v.qtyNan=sc.nextInt();
				    	break;
				    }
				    case 2:
				    {
				    	System.out.println("enter how many roti u need");
				    	v.qtyRoti=sc.nextInt();
				    	break;
				    }
				    case 3:
				    {
				    	System.out.println("enter how many panner butter masala u need");
				    	v.qtyPannerButtterMasala=sc.nextInt();
				    	break;
				    }
				    case 4:
				    {
				    	return;
				    }
				    }
				}
			}
			else if(h instanceof NonVeg)
			{
				NonVeg nv=(NonVeg)h;
				for(;;)
				{
					System.err.println("1."+nv.food1+"------"+nv.priceCshawarma);
					System.err.println("2."+nv.food2+"-------"+nv.pricebriyanih);
				    System.err.println("3."+nv.food2+"-------"+nv.pricebriyanif);
				    System.err.println("4."+nv.food3+"-------"+nv.priceRoti);
				    System.err.println("5."+nv.food4+"-------"+nv.cgravyprice);
				    System.err.println("6."+nv.food5+"-------"+nv.mgravyprice);
				    System.out.println("7.enough please brint my order");
				    switch(sc.nextInt())
				    {
				    case 1:
				    {
				    	System.out.println("enter how many Cshawarma u need");
				    	nv.qtycShawarma=sc.nextInt();
				    	break;
				    }
				    case 2:
				    {
				    	System.out.println("enter how many briyanih u need");
				    	nv.qtybriyanihalf=sc.nextInt();
				    	break;
				    }
				    case 3:
				    {
				    	System.out.println("enter how many briyanif u need");
				    	nv.qtybriyanifull=sc.nextInt();
				    	break;
				    }
				    case 4:
				    {
				    	System.out.println("enter how many roti u need");
				    	nv.qtyRoti=sc.nextInt();
				    	break;
				    }
				    case 5:
				    {
				    	System.out.println("enter how many cgravyqty u need");
				    	nv.cgravyqty=sc.nextInt();
				    	break;
				    }
				    case 6:
				    {
				    	System.out.println("enter how many mgravyqty u need");
				    	nv.mgravyqty=sc.nextInt();
				    	break;
				    }
				    case 7:
				    {
				    	return;
				    }
				    }
				}
				
			}
		}
		
	}
	public void cancelFood()
	{
		if(h==null)
		{
			System.out.println("first order food");
		}
		else
		{
			h=null;
			System.out.println("order is cancelled");
		}
		
	}
	public void displayBill()
	{
		if(a==null)
		{
			System.out.println("please first make login");
		}
		else
		{
			if(h==null)
			{
				System.out.println("please first choose hotel");
			}
			else
			{
				if(h instanceof Veg)
			
			{
				Veg v1=(Veg)h;
				int sum=0;
				if(v1.qtyNan!=0)
				{
					System.out.println(v1.food1+" "+v1.qtyNan+" ="+v1.qtyNan*v1.priceNaan);
				   sum=(int) (sum+(v1.qtyNan*v1.priceNaan));
				}
				 if(v1.qtyRoti!=0)
				{
					System.out.println(v1.food2+" "+v1.qtyRoti+" ="+v1.qtyRoti*v1.priceRoti);
					   sum=(int) (sum+(v1.qtyRoti*v1.priceRoti));
				}
				 if(v1.qtyPannerButtterMasala!=0)
				{
					System.out.println(v1.food3+" "+v1.qtyPannerButtterMasala+" ="+v1.qtyPannerButtterMasala*v1.pricePannerButterMasala);
					   sum=(int) (sum+(v1.qtyPannerButtterMasala*v1.pricePannerButterMasala));
				}
				System.out.println("total ================"+sum);
				System.out.println("you have to pay "+sum);
				double money=sc.nextDouble();
				if(money>=sum)
				{
					System.out.println("your order is placed");
					h=null;
				}
				else
				{
					System.out.println("order is not confirmed");
				}
				
			}
		
		
		if(a==null)
		{
			System.out.println("please first make login");
		}
		else
		{
			if(h==null)
			{
				System.out.println("please first choose hotel");
			}
			else if(h instanceof NonVeg)
			{
				NonVeg v2=(NonVeg)h;
				int sum=0;
				if(v2.qtycShawarma!=0)
				{
					System.out.println(v2.food1+" "+v2.qtycShawarma+" ="+v2.qtycShawarma*v2.priceCshawarma);
				   sum=(int) (sum+(v2.qtycShawarma*v2.priceCshawarma));
				}
				 if(v2.qtybriyanihalf!=0)
				{
					System.out.println(v2.food2+" "+v2.qtybriyanihalf+" ="+v2.qtybriyanihalf*v2.pricebriyanih);
					   sum=(int) (sum+(v2.qtybriyanihalf*v2.pricebriyanih));
				}
				 if(v2.qtybriyanifull!=0)
					{
						System.out.println(v2.food2+" "+v2.qtybriyanifull+" ="+v2.qtybriyanifull*v2.pricebriyanif);
						   sum=(int) (sum+(v2.qtybriyanifull*v2.pricebriyanif));
					}
				 if(v2.qtyRoti!=0)
				{
					System.out.println(v2.food3+" "+v2.qtyRoti+" ="+v2.qtyRoti*v2.priceRoti);
					   sum=(int) (sum+(v2.qtyRoti*v2.priceRoti));
				}
				 if(v2.cgravyqty!=0)
					{
						System.out.println(v2.food3+" "+v2.cgravyqty+" ="+v2.cgravyqty*v2.cgravyprice);
						   sum=(int) (sum+(v2.cgravyqty*v2.cgravyprice));
					}
				 if(v2.mgravyqty!=0)
					{
						System.out.println(v2.food3+" "+v2.mgravyqty+" ="+v2.mgravyqty*v2.priceRoti);
						   sum=(int) (sum+(v2.mgravyqty*v2.mgravyprice));
					}
				System.out.println("total ================"+sum);
				System.out.println("you have to pay "+sum);
				double money=sc.nextDouble();
				if(money>=sum)
				{
					System.out.println("your order is placed");
					h=null;
				}
				else
				{
					System.out.println("order is not confirmed");
				}
				
			}
		}
		}
		}
		
		
	}
    public void exit()
    {
    	
    }
    public static void main(String[] args) 
    {
    	Swiggy s=new Swiggy ();
    	for(;;)
    	{
    		
    	System.out.println("1.login 2.logout 3.addhotel 4.order food 5.cancel food 6.display bill 7.exit 8.remove hotel");
    	  switch(s.sc.nextInt())
    	  {
    	  case 8:
    		  s.removeHotel();
    		  break;
    	  case 1:
    		  s.login();
    		  break;
    	  case 2:
    		  s.logout();
    		  break;
    	  case 3:
    		  s.addHotel();
    		  break;
    	  case 4:
    		  s.orderfood();
    		  break;
    	  case 5:
    		  s.cancelFood();
    		  break;
    	  case 6:
    		  s.displayBill();
    		  break;
    	  case 7:
    		  System.err.println("application is closed");
    		  return;
    		  
    		  
    		  
    	  }
    	}
		
	}

}
