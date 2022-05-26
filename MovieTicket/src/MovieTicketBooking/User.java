package MovieTicketBooking;
import java.util.*;
public class User {
	static Scanner sc=new Scanner(System.in);
	public static Map<String,String> m1=new LinkedHashMap<>();
	public static void user()
	{
		System.out.println("1)signUp 2)login 3)exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			visitor();
			break;
		case 2:
			login();
			break;
		case 3:
			break;
		default:
			System.out.println("Invalid options");
		}
	}
	public static void visitor()
	{
		System.out.println("Enter the Name of the User:");
		String name=sc.next();
		System.out.println("Enter the DOB of the User:");
		String dob=sc.next();
		System.out.println("Enter the Gender of the User:");
		String gender=sc.next();
		System.out.println("Enter the Age of the User:");
		String age=sc.next();
		System.out.println("Enter the phone Number of the User:");
		String phoneNumber=sc.next();
		if(phoneNumber.length()!=10)
		{
			System.out.println("Invalid PhoneNumber");
		}
		sc.nextLine();
		System.out.println("Enter the Address of the User:");
		String address=sc.nextLine();
		System.out.println("Enter the NewPassWord of the User:");
		String newPassWord=sc.next();
		System.out.println("Enter the ConfirmPassword of the User:");
		m1.put(name,newPassWord);
		String confirmPassword=sc.next();
		if(newPassWord.equals(confirmPassword))
		{
			System.out.println("You are successfully Registered");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}	
	
public static void login()
{
	Login l=new Login();
	System.out.println("Enter the userName:");
	//String userName=sc.next();
	l.setName(sc.next());
	
	System.out.println("Enter the password:");
	//String password=sc.next();
	l.setPassword(sc.next());
	if(m1.containsKey(l.getName())) {
		String a=m1.get(l.getName());
		if(a.equals(l.getPassword())) {
			System.out.println("You are loggedin successfully");
		}
		else {
			System.out.println("Invalid username");
		}
	}
	int choice=0;
	while(choice!=3)
	{
		System.out.println("1)logout 2)bookTicket  3)makePayment 4)exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			logout();
			break;
		case 2:
			bookTicket();
			break;
		case 3:
			MakePayment.makePayment();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Invalid options");
		}
	}
}
public static void logout()
{
	System.out.println("You are logged out successfully");
}
public static void bookTicket()
{
	Admin.movieDetails();
	Admin.selectMovie();
}
}
