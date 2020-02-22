package Lab2;

public class Personal_Details {

	String Fname="Divya";
	String Lname="Bharati";
	String Gender="F";
	int age=20;
	double weight=85.55;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personal_Details p=new Personal_Details();
		System.out.println("Personal Details:");
		System.out.println("-----------------------");
		System.out.println(" First Name:"+p.Fname);
		System.out.println("last name:"+p.Lname);
		System.out.println("Gender:"+p.Gender);
		System.out.println("Age:"+p.age);
		System.out.println("Weight:"+p.weight);
	}

}
