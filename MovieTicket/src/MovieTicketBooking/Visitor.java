package MovieTicketBooking;
import java.util.*;
public class Visitor {
	static Scanner sc=new Scanner(System.in);
	public static Map<String,String> m1=new LinkedHashMap<>();
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
	if(phoneNumber.length()!=9)
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
}
