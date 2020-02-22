package Lab3;

import java.util.Scanner;

public class Strop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strop s=new Strop();
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("select any string opertaion");
		System.out.println("1.Concatenate String\n2.Repalce\n3.Remove Duplicates\n4.UpperCase\n5.exit\nEnter Your Choice:");
		
		
		switch(sc.nextInt())
		{
		case 1: s.ConStr();
				break;
		case 2: s.ReplaceOdd();
				break;
		case 3:s.RemoveDup();
				break;
		case 4: s.Uppercase();
				break;
		case 5:System.out.println("Successful exit"); 
			System.exit(0);
		}
		}
	}

	@SuppressWarnings("resource")
	private void ConStr()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a string");
		String str1 =s1.nextLine();
		System.out.println("enter another string");
		String str2=s1.nextLine();
		String str3=str1.concat(str2);
		System.out.println("concatenate string is:"+str3);
		
	}
	@SuppressWarnings("resource")
	private void Uppercase() 
	{
		// TODO Auto-generated method stub
		Scanner s3=new Scanner(System.in);
		System.out.println("enter a string");
		String str5=s3.nextLine();
		String word="";
		for(int i=0;i<str5.length();i++)
		{
			char ch=str5.charAt(i);	
			if(i%2==0)			
				ch=Character.toUpperCase(ch);
			word=word+ch;
		}
		System.out.println(word);
	}
	private void RemoveDup() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String st=s.nextLine();
		String result = "";
	    for (int i = 0; i < st.length(); i++)
	    {
	        if(!result.contains(String.valueOf(st.charAt(i))))
	        {
	            result += String.valueOf(st.charAt(i));
	        }
	    }
		System.out.println(result);
	}
	private void ReplaceOdd() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str4=s2.nextLine();
		for(int i=0;i<str4.length();i++)
		{
			if(i%2!=0)
			{
				str4 = str4.substring(0,i-1) + "#" + str4.substring(i, str4.length());
			}
		}
		System.out.println(str4);
		
	}

}
