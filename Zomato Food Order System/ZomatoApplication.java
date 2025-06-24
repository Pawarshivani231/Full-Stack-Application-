package Zomato_Food_Order_System;

import java.util.Scanner;

public class ZomatoApplication
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Zomato z=new Zomato();
		for(;;)
		{
			System.out.println("1.create account 2.choose hotel 3.make a order 4.show the bill 5.exit");
			switch(sc.nextInt())
			{
			case 1:
				z.createAccount();
				break;
			case 2:
				z.choosehotel();
				break;
			case 3:
				z.makeAOrder();
				break;
			case 4:
				z.bill();
				break;
			case 5:
			}
		}
		
	}


}
