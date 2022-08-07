import java.util.Scanner;
public class Login {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String username;
		System.out.println("Enter The USerName:");
		username=sc.next();
		String passw;
		System.out.println("Enter The PassWord");
		passw=sc.next();
		if((username.equals("Admin")) && (passw.equals("Admin")))
		{
			System.out.println("User Credentials Are Correct");
		}
		else if(username.equals("Admin"))
		{
			System.out.println("Invalid Password");
		}
		else if(passw.equals("Admin"))
		{
			System.out.println("Invalid Username");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
}
