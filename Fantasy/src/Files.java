
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;

	public class Files{
		public String directory;
		public File file;
		String file_name="";
		ArrayList<String> array=new ArrayList<String>();
		public Files() 
		{
			directory = System.getProperty("user.dir");
			file=new File(directory);
		}
		public File path(String file_name) 
		{
			file = new File(file_name);
			directory=""+file.getAbsoluteFile();
			return file;
		}
		public void readFile(String fileName) throws IOException
		{
			File f;
			f=path("Users.txt");
			if(f.exists())
			{
				FileReader fileReader = new FileReader(f);
		        BufferedReader in = new BufferedReader(fileReader);
		        String line;
		        String section="";
		        while((line = in.readLine())!= null)
		        {
		        	for(int i=0;i<line.length();i++)
		    		{
		    			if(line.charAt(i)!=',' && i<line.length()-1)
		    				section+=line.charAt(i);
		    			else if(i==line.length()-1)
		    			{
		    				section+=line.charAt(i);
		    				array.add(section);
		    			}
		    			else
		    			{
		    				array.add(section);
		    				section="";
		    			}
		    		}
		        }
		        	in.close();
		}
		}
		public void writeFile(UserInfo userinfo) throws IOException
		{
				BufferedWriter out=new BufferedWriter(new FileWriter(path("Users.txt"),true));
				out.write(userinfo.getName() + "," + userinfo.getEmail() + "," + userinfo.password + "," + userinfo.getFavourite_Premier_League_Team());
				out.newLine();
				out.close();
		}
		public void writeFile(PlayerInfo playerinfo) throws IOException
		{
			BufferedWriter out=new BufferedWriter(new FileWriter(path("Players.txt"),true));
			out.write(playerinfo.getName() + "," + playerinfo.getNationality() + "," + playerinfo.getClub()
			+ "," + playerinfo.getPosition() + "," + playerinfo.getDate_of_Birth() + "," + playerinfo.getHeight() + "cm");
			out.newLine();
			out.close();
		}
		public boolean check(String element) throws IOException
		{
			readFile("Users.txt");
		    if(array.contains(element))
	        {
				return true;
	        }
			return false;
		}
		public boolean check(String element1,String element2) throws IOException
		{
			readFile("Users.txt");
			for(int i=0;i<array.size();i++)
	    	{
				if(array.get(i).equals(element1))
	        	{
					if(array.get(i+1).equals(element2))
				    {
						return true;
				    }	
	        	}
	    	}
			return false;
			
		}
	}