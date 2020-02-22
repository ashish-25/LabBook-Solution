package Lab2;

//import java.util.Scanner;

public class Pos_Neg {

	
	public static void main(String[] args)
	{
		//Pos_Neg p=new Pos_Neg();
//		Scanner sc= new Scanner(System.in);
//		int no;
//		System.out.println("enter any number:");
//		no=sc.nextInt();
//		if(no>0)
//			System.out.println("the given no:" +no+" is positive");
//		else if(no<0)
//			System.out.println("the given no:"+no+" is negative");
//		else 
//			System.out.println("given no: 0");
		int a=Integer.parseInt(args[0]);
		if(a>0)
			System.out.println("positive");
		else if(a<0)
			System.out.println("negative");
	}
}
