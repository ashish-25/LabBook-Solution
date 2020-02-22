package lab5;

abstract class Account1 extends Person {

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
	abstract void withdraw(double amt);
	
	void display()
	{
		
		System.out.println("Account no:"+AccNo);
		System.out.println("balance:"+balance);
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person accHolder = new Person();
		Savings sa=new Savings();
		accHolder.setName("Smith");
		accHolder.setAge((float) 20.0);
		sa.getAccNo();
		sa.setBalance(2000);
		sa.deposit(2000);
		//sa.withdraw(3600);
		accHolder.dis();
		sa.display();
		accHolder.setName("Kathy");
		accHolder.setAge((float)45.0);
		sa.getAccNo();
		sa.setBalance(3000);
		sa.withdraw(2000);
		sa.getBalance();
		//sa.withdraw(1000);
		accHolder.dis();
		
		Current c=new Current();
		sa.getBalance();
		sa.display();
		c.withdraw(1000);

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
class Savings extends Account1
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
class Current extends Account1
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