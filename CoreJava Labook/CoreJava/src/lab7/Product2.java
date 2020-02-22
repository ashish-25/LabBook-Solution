package lab7;

import java.util.ArrayList;

public class Product2 {
	public static void main(String[] args)
	{
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("patanjali");
		ar.add("jhonsons");
		ar.add("Azure");
		ar.add("panteen");
		ar.add("park avenue");
		System.out.println("elements before sorting:"+ar);
		ar.sort(null);
		System.out.println("elements after Sorting:"+ar);
	}

}
