package filereader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;

public class PDFFile implements ReadFile
{
	public PDFFile()
	{
		
	}
	public void readFile(String filePath) 
	{
		try(PDDocument file = PDDocument.load(new File(filePath)))
		{		
			file.getClass();
			
			PDFTextStripperByArea stripper = new PDFTextStripperByArea();
		    stripper.setSortByPosition(true);
		
		    PDFTextStripper tStripper = new PDFTextStripper();
		
		    String pdfFileInText = tStripper.getText(file);
		    //System.out.println("Text:" + st);
		
			// split by whitespace
		    String lines[] = pdfFileInText.split("\\r?\\n");
		    for (String line : lines) {
		        System.out.println(line);
		    }
		}
		catch(Exception e)
		{
			System.out.println("Error occured");
		}
	}
	public void saveFile()
	{
		
	}
	
}
