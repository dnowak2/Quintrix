package filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVFile implements ReadFile
{
	public CSVFile()
	{
		
	}
	public void readFile(String filePath)
	{
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] values = line.split(cvsSplitBy);
                for(int i = 0; i < values.length; i++)
                {
                	System.out.println(values[i]);
                }
            }

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
