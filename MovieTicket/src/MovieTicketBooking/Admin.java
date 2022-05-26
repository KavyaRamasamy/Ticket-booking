package MovieTicketBooking;
import java.util.*;
public class Admin{
	static Scanner sc=new Scanner(System.in);
	static ArrayList<String> movies=new ArrayList<>();
	static int totalTicket=10,ticketAmount=200;
	static int noOfSeats=0;
	public static void admin()
	{
	String userName="Admin";
	String password="Admin123";
	System.out.println("Enter the Admin UserName: ");
	String name=sc.next();
	sc.nextLine();
	System.out.println("Enter the Admin password: ");
	String pwd=sc.nextLine();
	if(name.equals(userName) && pwd.equals(password))
	{
		System.out.println("You are loggedin Successfully");
		int choice=0;
		while(choice!=4) {
		System.out.println("1) Add 2) update 3)delete 4)exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			break;
		default:
			System.out.print("Invalid Operations");
			break;	
		}
		}
		
	}
	else
	{
		System.out.print("Invalid Details");
	}
	}
	public static void add()
	{
		System.out.println("Enter NoOfMovies to be added:");
		int noOfMovies=sc.nextInt();
		for(int i=0;i<noOfMovies;i++)
		{
			movies.add(sc.next());
			sc.nextLine();
		}
	}
	public static void update()
	{
		System.out.println("Enter the NoOfMovies to be Updated:");
		int index=sc.nextInt();
		for(int i=0;i<index;i++)
		{
		movies.set(sc.nextInt(),sc.next());
		}
	}
	public static void delete()
	{
		System.out.print("Enter the NoOfMovies to be deleted:");
		int index=sc.nextInt();
		for(int i=0;i<index;i++)
		{
		movies.remove(sc.next());
		sc.nextLine();
		}
		//print();
	}
	public static void movieDetails()
	{
	System.out.println(movies);
	}
	public static void selectMovie()
	{
		String movieName=sc.nextLine();
		if(movies.contains(movieName))
		{
			noOfSeats=sc.nextInt();
			if(noOfSeats<=totalTicket)
			{
				System.out.println("Your Tickets are booked successfully");
			}
			else
			{
				System.out.println("There is no vacancy");
			}
		}
	}
	public static void payment()
	{
		int totalAmt=noOfSeats*ticketAmount;
		System.out.println("Total Amount:"+(totalAmt));
		System.out.println("Enter the amount to pay:");
		int amount=sc.nextInt();
		if(amount==totalAmt)
		{
			System.out.println("Payment SuccessFull");
		}
		else
		{
			System.out.println("Payment UnsuccessFull");
		}
	}
	
	

}
