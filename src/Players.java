
import java.io.IOException;

public class Players extends Observers
{

	private Events event;
	public Players(Events event) {
		this.event = event;
		this.event.register(this);
	}
 
	public void Update(String name,String file,int point) throws IOException
	{
		int ind=-1;
		ind=update_file.search("Players.txt",name);//index bta3 el player w mnha el points bta3o hykon ind+7
		if(ind>=0)
		{
			String playerName=update_file.array.get(ind);
			String points=update_file.array.get(ind+7);
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
			String newLine=update_file.array.get(ind) + "," + update_file.array.get(ind+1) + "," + update_file.array.get(ind+2) 
			+ "," + update_file.array.get(ind+3) + "," + update_file.array.get(ind+4)+ "," + update_file.array.get(ind+5) + "," + update_file.array.get(ind+6) + "," + newpoints;
			//update_file.writeFile("Players.txt",playerName, newLine);//update Players file
			//BufferedWriter out = new BufferedWriter(new FileWriter(update_file.path("Players.txt"),true));
			String lineFromWeekFile=null;
			lineFromWeekFile=update_file.readLinebyLine("Players.txt",playerName);
			boolean check=lineFromWeekFile.equals("Not Found");
			if(check==false)
			{
				update_file.replace("Players.txt",playerName,newLine);
			}
		}
	}
	public void unSubscribe() {
		this.event.remove(this);
	}
}
