package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	@Test
	public void testFname() {
		System.out.println("inside test case");
		PersonDetails pd=new PersonDetails("Manoj","Rao",Gender.MALE,"669696");
		assertEquals("Manoj",pd.getFname());
		}
	//@Test
	public void TestGender()
	{
		PersonDetails pd=new PersonDetails("Manoj","Rao",Gender.MALE,"669696");
		assertEquals("MALE",pd.getGender());
	}
	@Test
	public void TestLname()
	{
		PersonDetails pd= new PersonDetails("Manoj","Rao",Gender.MALE,"669696");
		assertEquals("Rao",pd.getLname());
	}
	@Test 
	public void Testphno()
	{
		PersonDetails pd= new PersonDetails("Manoj","Rao",Gender.MALE,"669696");
		assertEquals("669696",pd.getPhno());
	}
	@SuppressWarnings("unused")
	@Test
	public void testException()throws MyException
	{
		PersonDetails pd= new PersonDetails("","",Gender.MALE,"669696");
	}
	
}

