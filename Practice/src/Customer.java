
public class Customer 
{
	private String name;
	private double accountBalance;
	
	public Customer(String name, double money)
	{
		this.name = name;
		this.accountBalance = money;
	}
	public static double getAccountBalance(Customer customer)
	{
		return customer.accountBalance;
	}
}
