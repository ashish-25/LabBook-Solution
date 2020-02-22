package Lab2;

@SuppressWarnings("serial")
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class PersonMain {

	public static void main(String args[]) throws Exception
	{
		PersonDetails p=new PersonDetails("MotHadi Shaik Reshma(ESHI)","BANU",Gender.FEMALE,"8042650");
		PersonDetails p1=new PersonDetails();
	/*	System.out.println("Person Details:");
		System.out.println("---------------------------------");
		System.out.println("First Name:"+p1.getFname());
		System.out.println("Last Name:"+p1.getLname());
		System.out.println("Gender:"+p1.getGender());
		System.out.println("phone no:"+p1.getPhno());
		System.out.println("--------------------------");
		System.out.println("First Name:"+p.getFname());
		System.out.println("Last Name:"+p.getLname());
		System.out.println("Gender:"+p.getGender());
		System.out.println("phone no:"+p.getPhno());
	
	*/
		try{
			if(p.getFname()=="" && p.getLname()=="")
			{
				
				throw new MyException("Invalid Name");
			}
			else
			{
				p.display();
				p1.display();
				
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
			
		}
	
	}
}
