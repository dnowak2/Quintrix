package filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class TXTFile implements ReadFile
{

	public TXTFile() {
		
	}
	public void readFile(String filePath)
	{
		BufferedReader br = null;
	       String line = "";
	       String cvsSplitBy = ",";

	       try {

	           br = new BufferedReader(new FileReader(filePath));
	           while ((line = br.readLine()) != null) 
	        	   System.out.println(line);
	       } 
	       catch (Exception e) 
	       {
	    	   System.out.println("Error occured");
	       }
	}
	public void saveFile()
	{
		
	}
	
}
