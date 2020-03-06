package unittestproject;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		
	}
	public Calculator()
	{
		boolean error = false;
		do
		{
			double operand1, operand2;
			char operation;
			Scanner input = new Scanner(System.in);
			try 
			{
				System.out.println("Enter initial number:");
				operand1 = input.nextDouble();
				System.out.println("Enter an operation (+,-,*, or /):");
				operation = input.next().charAt(0);
				System.out.println("Enter second number:");
				operand2 = input.nextDouble();
				calculate(operand1, operation, operand2);
				input.close();
			} 
			catch (Exception e)
			{
				error = true;
				System.out.println("Error in input, try again");
				
			}
		} while(error);
	}
	public double calculate(double operand1, char operation, double operand2)
	{
		double answer = 0.0;
		switch(operation)
		{
			case '+':
				answer = add(operand1, operand2);
				break;
			case '-':
				answer = subtract(operand1, operand2);
				break;
			case '*':
			case 'x':
				answer = multiply(operand1, operand2);
				break;
			case '/':
				if(operand2 == 0)
				{
					System.out.println("Cannot divide by 0");
					break;
				}
				answer = divide(operand1, operand2);
				break;
			default:
				System.out.println("enter a valid operation");
		}
		System.out.println(String.format("%f %c %f = %f", operand1, operation, operand2, answer));
		return answer;
	}
	
	public double add(double operand1, double operand2)
	{
		return operand1+operand2;
	}
	public double subtract(double operand1, double operand2)
	{
		return operand1-operand2;
	}
	public double multiply(double operand1, double operand2)
	{
		return operand1*operand2;
	}
	public double divide(double operand1, double operand2)
	{
		return operand1 / operand2;
	}
}
