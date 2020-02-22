package lab13;

import java.io.*;

public class FileProgram extends Thread{

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		FileReader f1=new FileReader("E:\\CAP NOTES\\source.txt");
		FileWriter w1= new FileWriter("E:\\CAP NOTES\\target.txt");
		//cdt.CopyDataThread(f1,w1);
		CopyDataThread cdt=new CopyDataThread(f1,w1);
	}

}
