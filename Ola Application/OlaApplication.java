package Ola_Application;

public class OlaApplication {
	public static void main(String[] args)
	{
		Ola o=new Ola();
		for(;;)
		{
			System.out.println("1.make a ride 2.cancel a ride 3.make a payment 4.exit");
	       	switch(o.sc.nextInt())
	       	{
	       	case 1:
	       		o.makeARide();;
	       		break;
	       	case 2:
	       		o.cancelARide();
	       		break;
	       	case 3:
	       		o.makeAPayment();
	       		break;
	       	case 4:
	       		
	       		return;
	       	}
		}
		
	}

}
