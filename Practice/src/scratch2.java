import java.util.*;
import java.util.Arrays;

public class scratch2 
{	
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5,6};
		int k = 2;
		System.out.print(Arrays.toString(arrayRotator(array, k)));
	}
	public static int[] arrayRotator(int[] array, int k)
	{
		int temp = array[array.length-1];
		for(int i = array.length - 1; i > 0; i--)
		{
			array[i] = array[i-1];
		}
		array[0] = temp;
		k--;
		if(k != 0)
			arrayRotator(array,k);
		return array;
	}
	
}
