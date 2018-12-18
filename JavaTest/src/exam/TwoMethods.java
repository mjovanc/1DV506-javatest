package exam;

public class TwoMethods
{
	public static void main(String[] args)
	{
		String str1 = "abbx";
		String str2 = "aYbx";
		String str3 = "yyyy";
		String str4 = "ybbx";
		String str5 = "xxxyyyxxx";
		String str6 = "xylofon";
		
		int[] arr = {3, -7, -8, -12, 0, 2,-99};
		
		int lgNumber = findMax(arr);
		
		System.out.print("The maximum number of arr is: ");
		System.out.println(lgNumber);
		
		boolean containsXandY = containsXandY(str2);
		
		if (containsXandY)
		{
			System.out.println("Contains x and y");
		}
		else
		{
			System.out.println("NOT containing x and y");
		}
	}
	
	public static int findMax(int[] arr)
	{
		int largestNumber = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > largestNumber)
			{
				largestNumber = arr[i];
			}
		}
		
		return largestNumber;
	}
	
	public static boolean containsXandY(String str)
	{
		char xChar = 'x';
		char yChar = 'y';
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < str.length(); i++)
		{	
			if (str.charAt(i) == xChar)
			{
				x++;
			}
			else if (str.charAt(i) == yChar)
			{
				y++;
			}
		}
		
		if (x > 0 && y > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
