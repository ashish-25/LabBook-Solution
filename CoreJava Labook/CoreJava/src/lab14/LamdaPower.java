package lab14;

import java.util.function.BiFunction;


public class LamdaPower {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	BiFunction<Double,Double,Double>  z;
	z=(x,y)->Math.pow(x,y);
	System.out.println(z.apply(10.0, 2.0));

	}
	
}
