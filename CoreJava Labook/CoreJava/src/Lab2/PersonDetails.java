package Lab2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


enum Gender
{
	MALE,FEMALE;
}
public class PersonDetails {
	Gender g;
	
	String Fname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getGender() {
	return getGender();
	}
	
	String Lname;
	
	String phno;
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	PersonDetails()
	{
		Fname= "Ashish";
		Lname="Aggarwal";
		g=Gender.MALE;
	}
	void display() throws Exception
	{
		
		System.out.println("Person Details:");
		System.out.println("---------------------------------");
		System.out.println("First Name:"+getFname());
		System.out.println("Last Name:"+getLname());
		String fn= FullName(Fname,Lname);
		System.out.println("Full Name:"+fn);
		System.out.println("Gender:"+g);
		System.out.println("phone no:"+getPhno());
		System.out.println("--------------------------");
		int age=CalculateAge();
		System.out.println("Age is:"+age);
		}
	PersonDetails(String firstname,String lastname,Gender g,String phno)
	{
		this.Fname=firstname;
		this.Lname=lastname;
		this.g=g;
		this.phno=phno;
	}
	@SuppressWarnings("resource")
	public static  int CalculateAge() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the DOB");
		String Dob=sc.nextLine();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birth =LocalDate.parse(Dob, formatter);
		LocalDate today = LocalDate.now();                    		//3.3
		Period dur = Period.between(birth,today);
	        return dur.getYears();

	}
	public static String FullName(String Fname,String Lname)
	{
		return Fname.concat( Lname);
	}
	
}
