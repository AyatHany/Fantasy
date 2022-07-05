
public class PlayerInfo {

	public String name;
	public String nationality;
	public String position;
	public String club = "";
	public String Date_of_Birth;
	public double Height;
	public PlayerInfo() 
	{
		this.name="";
		this.nationality="";
		this.position="";
		this.club="";
		this.Date_of_Birth="";
		this.Height=0.0;
	}
	public PlayerInfo(String name,String nationality,String position,String club,String Date_of_Birth,double Height)
	{
		this.name=name;
		this.nationality=nationality;
		this.position=position;
		this.club=club;
		this.Date_of_Birth=Date_of_Birth;
		this.Height=Height;
	}
	public String getName()
	{
		return this.name;
	}
	public String getNationality()
	{
		return this.nationality;
	}
	public String getPosition()
	{
		return this.position;
	}
	public String getClub()
	{
		return this.club;
	}
	public String getDate_of_Birth()
	{
		return this.Date_of_Birth;
	}
	public double getHeight()
	{
		return this.Height;
	}

}
