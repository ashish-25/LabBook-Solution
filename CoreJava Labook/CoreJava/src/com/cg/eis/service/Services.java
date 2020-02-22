package com.cg.eis.service;
import java.io.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.pl.EmployeeServiceImpl;

interface EmployeeService
{
//	void display();
	public void scheme(Employee e) throws EmployeeException;
}

@SuppressWarnings("serial")
public class Services implements EmployeeService, Serializable {
	Employee e=new Employee();
	EmployeeServiceImpl esi=new EmployeeServiceImpl();
	
	@Override
	public void scheme(Employee e1) throws EmployeeException
	{
		e=e1;
		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the salary");
		e.setSalary(s.nextDouble());*/
			
			if(e.getSalary()<3000)
				throw new EmployeeException("Salary must be greater than 3000");
			else
			{
				if(e.getSalary()<5000)
				{
					e.setDesignation("Clerk");
					e.setInsuranceScheme("no Scheme");
				}
				else if(e.getSalary()>5000 && e.getSalary()<20000)
				{
					e.setDesignation("System Association");
					e.setInsuranceScheme("Scheme C");
				}
				else if(e.getSalary()>=20000 && e.getSalary()<40000)
				{
					e.setDesignation("Programmer");
					e.setInsuranceScheme("Scheme B");
				}
				else if(e.getSalary()>=40000)
				{
					e.setDesignation("Manager");
					e.setInsuranceScheme("Scheme A");
				}
				//display();
			}
			
			
		
	}
	public void AddObjectToFile(Employee emp) 
	{
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("E:/CAP NOTES/empdetails.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("OBJECT successfully written in file");
		oos.close();
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Employee ReadObjectFromFile()
	{
		try {
			FileInputStream fis=new FileInputStream("E:/CAP NOTES/empdetails.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();

			ois.close();
			fis.close();
	        return emp;
			//System.out.println(emp.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return null;	
		}
	}
/*	@Override
	public void display()
	{	
		System.out.println("employee Id:"+e.getId());
		System.out.println("Employee Name:"+e.getName());
		System.out.println("Employee Salary:"+e.getSalary());
		System.out.println("Designation:"+e.getDesignation());
		System.out.println("Insurance Scheme:"+e.getInsuranceScheme());
	}*/
}
