package MovieTicketBooking;
import java.util.*;
public class Mainn {
	public void process() {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=3)
		{
		System.out.println("1)Admin 2)User 3)Exit");
			choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				Admin.admin();
				//System.out.print("Admin");
				break;
			case 2:
				User.user();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.print("Invalid Option");
				
		}
		}
	}
public static void main(String args[])
{
	Mainn obj1=new Mainn();
	obj1.process();
}
}
