import java.util.*;

public class Recursion 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		int number = -1;
		// InputMismatchException checks for wrong data type, do... while filters out negative 
		// integers which will pass the exception catch
		do
		{
			try
			{
				System.out.println("Enter a positive integer");
				number = console.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("That wasn't an integer...");
			}
			finally
			{
				console.nextLine();
			}
		}
		while(number < 0);
		console.close();
		int fact = factorial(number);
		System.out.println(number + "! = " + fact);
	}
	// 0 is the base case for factorial. 0! = 1. build up from there using recursive function
	// seen in else block
	public static int factorial(int number)
	{
		if (number == 0)
		{
			return 1;
		}
		else
		{
			return number*factorial(number-1);
		}
	}
}
