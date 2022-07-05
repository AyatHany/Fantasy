import java.io.IOException;
import java.util.Scanner;

public class User {
	Files user_file=new Files();
	Scanner scan= new Scanner(System.in);
	public User() {}
	public void SignedInUser() throws IOException
	{
		System.out.println("Name : ");
		String name = scan.nextLine();
		System.out.println("E-mail : ");
		String email = scan.nextLine();
		System.out.println("Password : ");
		String password = scan.nextLine();
		System.out.println("Your Favourite Premier League Team : ");
		String favourite_premier_league_team = scan.nextLine();
		UserInfo userinfo=new UserInfo(name,email,password,favourite_premier_league_team);
		System.out.println(userinfo.getName());
		if(user_file.file.exists())
		{
				if(user_file.check(userinfo.email))
				{
					System.out.println("Faild.There is an account with this mail." + '\n');
				}
				else
				{
					user_file.writeFile(userinfo);
				    System.out.println("You signed in sucessfully" + '\n');
				}
		}
		else
		{
			user_file.file.createNewFile();
			user_file.writeFile(userinfo);
			System.out.println("You signed in sucessfully" + '\n');
		}
		
	}
	public void LogedInUser() throws IOException 
	{
		System.out.println("E-mail : ");
		String Email = scan.nextLine();
		System.out.println("Password : ");
		String Password = scan.nextLine();
		if(user_file.check(Email,Password))
		{
			System.out.println("You loged in sucessfully" + '\n');
		}
		else 
		{
			System.out.println("Faild.You may entered wrong password or you do not have an account" + '\n');
		}
		}
}
