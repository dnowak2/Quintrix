import java.util.List;
import java.util.*;
import static org.junit.Assert.*;

public class DataReading 
{
	private List<Customer> customers;
	
	public void initialize()
	{
		customers = new ArrayList<Customer>();
	}
	// first make sure the list isn't empty- no need to test an empty list
	public void testEmpty()
	{
		assertTrue(customers.isEmpty());
	}
	// further tests of the customer objects would go here, maybe add "getter" to customer class
	// to grab the customer data like accountBalance, we could check to make sure balance >0
	// before proceeding with whatever test was to be done
	public boolean hasMoney()
	{
		boolean hasmoney = true;
		for(int i = 0; i < customers.size(); i++)
		{
			if(Customer.getAccountBalance(customers.get(i)) == 0)
				hasmoney = false;
		}
		return hasmoney;
	}
	
}
