import java.io.IOException;
import java.util.Scanner;

public class Player {

	Files player_file=new Files();
	Scanner scan= new Scanner(System.in);
	public Player() {}
	public void addPlayer() throws IOException
	{
		System.out.println("Name : ");
		String name = scan.nextLine();
		System.out.println("Nationality : ");
		String nationality = scan.nextLine();
		System.out.println("Position : ");
		String position = scan.nextLine();
		System.out.println("Club : ");
		String club = scan.nextLine();
		System.out.println("Date_of_Birth : ");
		String Date_of_Birth = scan.nextLine();
		System.out.println("Height : ");
		double Height = scan.nextDouble();
		PlayerInfo playerinfo=new PlayerInfo(name,nationality,position,club,Date_of_Birth,Height);
		player_file.writeFile(playerinfo);
		System.out.println("You entered the player sucessfully" + '\n');
	}
	public void addSquad()
	{
		
	}
}
