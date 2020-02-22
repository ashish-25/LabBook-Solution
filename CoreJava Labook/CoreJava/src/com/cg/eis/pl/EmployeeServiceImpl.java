package com.cg.eis.pl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl {
	//Employee emp=new Employee();
	//HashMap<String,Employee> list = new HashMap<String,Employee>();  
	
	public void addEmployee(Employee e)	{
		//list.put(e.getName(),e);
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","ashish");
		//Statement stmt=con.createStatement();
		//create table EmployeeDetails(empid number(10)primary key,empname varchar2(20),salary number(10,2),designation varchar2(20),insurancescheme varchar2(10));
		String sql="insert into EmployeeDetails (empid,empname,salary,designation,insurancescheme)values (?,?,?,?,?)" ;
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setInt(1,e.getId());
		stmt.setString(2,e.getName());
		stmt.setDouble(3,e.getSalary());
		stmt.setString(4,e.getDesignation());
		stmt.setString(5,e.getInsuranceScheme());
		stmt.execute();
		} catch ( Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 
	}
	public void DisplayHash()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","ashish");
		Statement stmt=con.createStatement();
		String sql="Select * from employeedetails";
		ResultSet rs=stmt.executeQuery(sql);

		System.out.println("Employee  Details:");
		System.out.println("----------------------");
		System.out.println("EmpID\tEMP NAME\tSALARY\tDESIGNATION\tINSURANCE SCHEME");
		while(rs.next())
		{
			int empid=rs.getInt(1);
		String empname=rs.getString(2);
		double salary=rs.getDouble(3);
		String designation=rs.getString(4);
		String scheme=rs.getString(5);
		System.out.println(empid+"\t"+empname+"\t\t"+salary+"\t"+designation+"\t"+scheme);
		}
		stmt.close();
		rs.close();
		con.close();
		}
		catch(Exception e)
		{
		System.out.println("Error :"+e.getMessage());
		}
		/*Set<Entry<String,Employee>> set=list.entrySet();
		Iterator<Entry<String,Employee>> it=set.iterator();
		System.out.println("Employee Details:");
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			emp = (Employee) me.getValue();
			
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getDesignation()+"\t"+emp.getSalary()+"\t"+emp.getInsuranceScheme());
		}
		//OR
		for(Map.Entry<String, Employee> entry:list.entrySet()){    
	        String key=entry.getKey();  
	        Employee e2=entry.getValue();  
	        System.out.println("Employee Details:");  
	        System.out.println(e2.getId()+" \t"+key+"\t"+e2.getSalary()+"\t"+e2.getDesignation()+"\t"+ e2.getInsuranceScheme());   
	    }*/    
	}
	//@SuppressWarnings("rawtypes")
	public boolean deleteEmployee(int id)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","ashish");
			String sql="delete from employeedetails where empid=?" ;
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,id);
			stmt.executeUpdate();
			} catch ( Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		/*Set<Entry<String, Employee>> set = list.entrySet();
		Iterator<Entry<String, Employee>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry me = (Map.Entry)it.next();
			Employee e = (Employee) me.getValue();
			if(e.getId() == id){
				list.remove(me.getKey());
				return true;
			}
		}
			*/
		return true;
	
		
}
	/*@SuppressWarnings("rawtypes")
	public void SchDis(String sch)
	{
		Set<Entry<String, Employee>> set = list.entrySet();
		Iterator<Entry<String, Employee>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			Employee emp = (Employee) me.getValue();
			if((emp.getInsuranceScheme()).equalsIgnoreCase(sch))
			{
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getDesignation()+"\t"+emp.getSalary()+"\t"+emp.getInsuranceScheme());
			}
		}
	
	}

	public void SortHash()
	{
		
		
	}*/
}
