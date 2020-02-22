package Lab3;

import java.util.Scanner;

public class AlphOrder {
	private static boolean alpOrder(String str1)
	{
		for(int i=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)>str1.charAt(i+1))
			{
				return false;
			}
		}
			return true;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		if(alpOrder(str1))
			System.out.println("positive string");
		else
			System.out.println("negative string");
	}

}
