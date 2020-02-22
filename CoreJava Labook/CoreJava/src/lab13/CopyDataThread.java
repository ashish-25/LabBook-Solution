package lab13;

import java.io.*;

public class CopyDataThread extends Thread {
	static //FileReader fr=new FileReader("E:\\CAP NOTES\\source.txt");
	//FileWriter fw=new FileWriter("E:\\CAP NOTES\\target.txt");
	BufferedReader br;
	static BufferedWriter bw;
	/*public CopyDataThread(FileReader f1,FileWriter w1)
	{
		br=new BufferedReader(f1);

		bw=new BufferedWriter(w1);
	}*/

	public CopyDataThread(FileReader f1, FileWriter w1) throws Exception {
		// TODO Auto-generated constructor stub
		br=new BufferedReader(f1);

		bw=new BufferedWriter(w1);
		int j=10;
		String line;
		while((line=br.readLine())!=null){
			char[] demo = line.toCharArray();
			for(int i=0;i<demo.length;i++){
				bw.write(demo[i]);
				if(i==j){
					System.out.println("10 characters are copied!");
					j+=10;
					Thread.sleep(5000);
				}
			}
		}
		br.close();
		bw.close();
	}

}
