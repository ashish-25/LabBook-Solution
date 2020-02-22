package lab14;

interface Power{
	double pow(int x,int y);
}
public class Lamda1 {

	public static void main(String[] args) {

		Power p=(x,y)->Math.pow(x,y);
		double x=p.pow(10, 3);
		System.out.print(x)  ;
		
	}
}
   