package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Numbers {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
		FileReader in =new FileReader("E:/CAP NOTES/numbers.txt");
		BufferedReader br=new BufferedReader(in);
		  int no=0;
		  String str=null;
		  while((str=br.readLine())!=null)
		  {
			    Scanner sc = new Scanner(str); 
			    sc.useDelimiter(",");
			  
			    while (sc.hasNext()) 
			    {
			    	no=Integer.parseInt(sc.next());
			    	if(no%2==0)
			      System.out.println(no); 
			    }
		  }
	}
}
