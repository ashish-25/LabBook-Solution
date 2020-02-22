package lab14;
interface SpaceChar{
String space(String n);
}
public class LamdaSapce {
public static void main(String[] args) {
	

	SpaceChar t= (str) -> {
		String sp="";
		char []ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			sp+=ar[i]+" ";
		}
		
		return sp;
		
	};
	System.out.println(t.space("Ashish"));
}
}
