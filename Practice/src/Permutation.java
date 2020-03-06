import java.util.Scanner;

public class Permutation 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		String userInput2 = input.nextLine();
		
		System.out.println(isPermutation(userInput,userInput2));
		input.close();
	}
	static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
}
