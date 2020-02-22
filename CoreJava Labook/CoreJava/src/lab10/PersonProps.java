package lab10;

import java.io.FileReader;
import java.util.Properties;

public class PersonProps {

	public static void main(String[] args) throws Exception {
		FileReader fr= new FileReader("C:\\Users\\Ashish Aggarwal\\workspace\\CoreJava\\src\\lab10\\PersonProps.properties");
		Properties p=new Properties();
		p.load(fr);
		System.out.println("VAlues after loading the properties object:\n\n"+p);
		System.out.println("\n\nvalues using getProperty ():\n");
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("phno"));
		System.out.println(p.getProperty("city"));
		System.out.println(p.getProperty("graduate"));
		
	}
}
