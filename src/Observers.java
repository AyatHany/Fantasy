
import java.io.IOException;

public abstract class Observers {
	
	Files update_file=new Files();
	public void Update(String name,String file,int point) throws IOException
	{
		
	}
		/*int ind=-1;
		int inde=-1;
		ind=week_file.search("Players.txt",name);//index bta3 el player w mnha el points bta3o hykon ind+7
		if(ind>=0)
		{
			String playerName=week_file.array.get(ind);
			String points=week_file.array.get(ind+7);
			int Point=Integer.parseInt(points);
			if(Point==0 && point<0)
			{
				Point=0;
			}
			else
			{
				Point+=point;
			}
			String newpoints=String.valueOf(Point);
			String newLine=week_file.array.get(ind) + "," + week_file.array.get(ind+1) + "," + week_file.array.get(ind+2) 
			+ "," + week_file.array.get(ind+3) + "," + week_file.array.get(ind+4)+ "," + week_file.array.get(ind+5) + "," + week_file.array.get(ind+6) + "," + newpoints;
			week_file.writeFile("Players.txt",playerName, newLine);//update Players file
			week_file.writeFile(playerName,newLine);//update Users files
			inde=week_file.search(fileWeek,playerName);//index bta3 el player w mnha el points bta3o hykon ind+1
			if(inde>=0)
			{
				String player_points=week_file.array.get(inde+7);
				int poin=Integer.parseInt(player_points);
				if(poin==0 && point<0)
				{
					poin=0;
				}
				else
				{
					poin+=point;
				}
				String Line=week_file.array.get(inde) + "," + week_file.array.get(inde+1) + "," + week_file.array.get(inde+2) 
				+ "," + week_file.array.get(inde+3) + "," + week_file.array.get(inde+4)+ "," + week_file.array.get(inde+5) + "," + week_file.array.get(inde+6) + "," + poin;
				week_file.writeFile(fileWeek,playerName, Line);//update week file
				System.out.println("You did sucessfully" + '\n');
			}
			else
			{
				System.out.println("You may entered the name of the player wrong" + '\n');
			}
		}
		else
		{
			System.out.println("You may entered the name of the player wrong or entered name of player that is not in the system.");
		}*/
	/*public void writeFile(String fileName,String playerName,String newLine) throws IOException//by8yr fe file el players b3d ma by7ot el points el gdeda byktb fe file el week
	{
		BufferedWriter out = new BufferedWriter(new FileWriter(path(fileName),true));
		String lineFromWeekFile=null;
		lineFromWeekFile=readLinebyLine(fileName,playerName);
		boolean check=lineFromWeekFile.equals("Not Found");
		if(check==false)
		{
			replace(fileName,playerName,newLine);
		}
	}
	public void writeFile(String playerName,String newLine) throws IOException//by8yr fe file el users b3d ma by7ot el points el gdeda
	{
		readFile("Users.txt");
		for(int i=0;i<array.size();i+=6)
		{
			String fileName=array.get(i) + ".txt";
			BufferedWriter out = new BufferedWriter(new FileWriter(path(fileName),true));
			String lineFromWeekFile=null;
			lineFromWeekFile=readLinebyLine(fileName,playerName);
			if(lineFromWeekFile.equals("Not Found"))
			{
				continue;
			}
			else
			{
				replace(fileName,playerName,newLine);
			}
		}
	}*/

}
