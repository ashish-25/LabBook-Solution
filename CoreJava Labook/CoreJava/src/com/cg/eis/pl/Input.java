package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;


public class Input {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws Exception
	{
		Employee[] e1=new Employee[10];
		Services ser=new Services();
		EmployeeServiceImpl esi2=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employes");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			
			e1[i]=new Employee();
			System.out.println("Enter Employee id:");
			int empid=sc.nextInt();
			e1[i].setId(empid);
			
			System.out.println("Enter Employee Name:");
			String dummy=sc.nextLine();
			String n=sc.nextLine();
			e1[i].setName(n);
			
			System.out.println("Enter the salary");
			e1[i].setSalary(sc.nextDouble());
			
			ser.scheme(e1[i]);
			esi2.addEmployee(e1[i]);
			/*ser.AddObjectToFile(e1[i]);
			e1[i]=(Employee)ser.ReadObjectFromFile();
			System.out.println("=======object Reterving from file=============");
			System.out.println("EMPLOYEE id:"+e1[i].getId());
			System.out.println("EMPLOYEE name:"+e1[i].getName());
			System.out.println("EMPLOYEE salary:"+e1[i].getSalary());
			System.out.println("EMPLOYEE Designation:"+e1[i].getDesignation());
			System.out.println("EMPLOYEE Scheme:"+e1[i].getInsuranceScheme());
			*/
		}
		
	
		esi2.DisplayHash();
		
		System.out.println("------enter the id to delete the details---------");
		int del=sc.nextInt();
		esi2.deleteEmployee(del);
		esi2.DisplayHash();
		
		/*System.out.println("---------Enter the scheme---------");
		String dumm=sc.nextLine();
		String sch=sc.nextLine();
		//esi2.SchDis(sch);
*/	
		}
	
}
