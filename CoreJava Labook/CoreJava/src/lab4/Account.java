package lab4;

@SuppressWarnings("serial")
class MyException extends Exception
{
	public MyException(String s){
		super(s);
	}
}

public class Account extends Person {

	long AccNo=1000;
	double balance;
		
	public long getAccNo() {
		this.AccNo+=100;
		return AccNo;
	}

	public void setAccNo(long accNo) {
		AccNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amt)
	{	
		balance+=amt;
	}
	public void withdraw(double amt)
	{
		if(balance>500){
		if(amt>balance)
			System.out.println("*********insufficient bal***********");
		else{
			balance-=amt;
		}
		}
		else
			System.out.println("************minimum balance***********");
		
	}
	
	void display()
	{
		
		System.out.println("Account no:"+AccNo);
		System.out.println("balance:"+balance);
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person accHolder = new Person();
		Account a1=new Account();
		accHolder.setName("Smith");
		accHolder.setAge((float) 10.0);
		a1.getAccNo();
		a1.setBalance(2000);
		a1.deposit(2000);
		try{
			if(accHolder.age<15)
				throw new MyException("Age should be more than 15");
			else{
		accHolder.dis();
		a1.display();
			}
			}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
			
		}
		//--------------------------------------
		Savings sa=new Savings();
		accHolder.setName("Kathy");
		accHolder.setAge((float)45.0);
		sa.getAccNo();
		sa.setBalance(3000);
		sa.withdraw(2000);
		sa.getBalance();
		try{
			if(accHolder.age<15)
				throw new MyException("Age should be more than 15");
			else{
				accHolder.dis();
				sa.display();
				}
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught:"+e);
			
		}
		
		Current c=new Current();
		c.withdraw(500);
		
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	

}
class Person
{
	String name;
	Float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getAge() {
		return age;
	}
	public void setAge(Float age) {
		this.age = age;
	}
	void dis()
	{
		System.out.println("Account Holder Details:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
}
class Savings extends Account
{
	final int minbal=500;
	public void withdraw(double amt)
	{
		double bal=balance;
		
		if(amt>bal)
			System.out.println("*********insufficient bal*****in Savings******");
		else if((bal-=amt)>minbal){
			balance-=amt;
		}
		
		else
			System.out.println("************minimum balance*in savings**********");
	}
	
}
 class Current extends Account
{
	int overdraftLimit=1000;
	public void withdraw(double amt)
	{
		if(amt>overdraftLimit)
			System.out.println("false");
		else 
				System.out.println("true");;
	}
}