package exam;

import java.util.Scanner;

public class Triangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Mata in ett positivt heltal: ");
		int number = in.nextInt();
		
		if (number < 0)
		{
			System.err.println("You didn't enter a positive integer!");
		}
		else
		{
			for (int i = 0; i < number; i++)
			{
				for (int k = 0 - i; k < number / 2; k++)
				{
					System.out.print(" ");
				}
				
				for (int j = number - i; j > 0; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
	}
}
