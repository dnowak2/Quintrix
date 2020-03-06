import java.util.*;
import java.util.Arrays;

public class scratch 
{
	public static void main(String[] args)
	{
		int[] numbers2 = new int[] {1,2,3,4,5,3,2,1};
		int[] numbers3 = new int[] {1,2,2,3,7,5,4,8};
		int[] numbers = new int[] {1,14,25,36,4,3,2,1};
		System.out.print(isMountainArray(numbers));
	}
	public static boolean isMountainArray(int[] numbers)
	{
		boolean peak = false;
		for(int index = 1; index < numbers.length; index++)
		{
			if(peak)
			{
				if(numbers[index] == numbers[index -1])
					return false;
				if(numbers[index] > numbers[index - 1])
					return false;
				if(numbers[index] < numbers[index - 1])
					continue;
			}
			else
			{
				if(numbers[index] == numbers[index -1])
					return false;
				if(numbers[index] > numbers[index - 1])
					continue;
				if(numbers[index] < numbers[index - 1])
					peak = true;
			}
		}
		return true;
	}
	public static boolean isMountain(int[] dummy) 
	{
		int i;
		int len = dummy.length;
		for (i = 1; i < len && dummy[i - 1] < dummy[i]; i++)
			;
		if (1 == i || i == len)
			return false;
		for (; i < len && dummy[i - 1] > dummy[i]; i++)
			;
		return i == len;
	}
}