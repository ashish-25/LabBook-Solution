package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class ReaderWriter {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []args) throws Exception
	{
		
		FileReader re=new FileReader("E:/CAP NOTES/test.txt");
		FileWriter wr=new FileWriter("E:/CAP NOTES/out.txt");
	   
		BufferedReader br=new BufferedReader(re); 
		ArrayList ar=new ArrayList();
		String str;
	    while((str =br.readLine())!=null)
	    {
	    	System.out.println(str);
	    	StringBuilder sb=new StringBuilder(str);
		    sb.reverse();
		    ar.add(sb.toString());
	    } 
	    BufferedWriter bufferedWriter = new BufferedWriter(wr);
		    PrintWriter pr=new PrintWriter(bufferedWriter);
		    Iterator i=ar.iterator();
		    while(i.hasNext())
		    {
		    pr.println(i.next());
		    }
		    // bufferedWriter.write(str);;
		    bufferedWriter.close();
		    pr.close();
		    re.close();
		    wr.close();
	    
	 }
	}



