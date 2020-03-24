package filereader;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FileManager 
{
	private static final Pattern p = Pattern.compile("-?\\d+(\\.\\d+)?");
	private static Scanner input;
	private static CSVFile csv;
	private static PDFFile pdf;
	private static TXTFile txt;
	private static InputFile userInput;
	private static DataBaseFile dataBase;
	
	public static void main(String[] args) throws NumberFormatException
	{
		input = new Scanner(System.in);
		System.out.println("Welcome to File Reader");
		System.out.println("Select from the following menu:");
		System.out.println("1.CSV\n2.PDF\n3.TXT\n4.User Input\n5.Database");
		
		String menuOption = input.nextLine();
		System.out.println("Press enter after selection is made");
		while(!isValidInput(menuOption))
		{
			System.out.println("Invalid input, please try again");
			menuOption = input.nextLine();
			System.out.println("Press enter after selection is made");
		}
		
		select(Integer.parseInt(menuOption));
		input.close();
	}
	
	public static void select(int menuOp)
	{
		switch(menuOp){
		case 1:
			csv();
			break;
		case 2:
			pdf();
			break;
		case 3:
			txt();
			break;
		case 4:
			userInput();
			break;
		case 5:
			dataBase();
			break;
		default:
			System.out.println("Unexpected input, program terminated");
		}
	}
	
	public static String filePath;
	public static void csv(){
		csv = new CSVFile();
		filePath = "src/filereader/csvtestfile.csv";
		csv.readFile(filePath);
		csv.saveFile();
	}
	public static void pdf(){
		pdf = new PDFFile();
		filePath = "src/filereader/pdftestfile.pdf";
		pdf.readFile(filePath);
		pdf.saveFile();
	}
	public static void txt() {
		txt = new TXTFile();
		filePath = "src/filereader/txttestfile.txt";
		txt.readFile(filePath);
		txt.saveFile();
	}
	public static void userInput() {
		userInput = new InputFile();
		String in = input.nextLine();
		userInput.readFile(in);
		userInput.saveFile();
	}
	public static void dataBase() {
		dataBase = new DataBaseFile();
		String jdbcURL = "";
		dataBase.readFile(jdbcURL);
		dataBase.saveFile();
	}
	public static boolean isValidInput(String menuOption)
	{
		try {
			int option = Integer.parseInt(menuOption);
			if(option > 5 || option < 0)
				return false;
			else return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
