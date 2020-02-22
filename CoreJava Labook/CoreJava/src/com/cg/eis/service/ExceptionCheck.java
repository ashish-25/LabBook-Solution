package com.cg.eis.service;

import org.junit.Test;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class ExceptionCheck {

	@Test
	public void test() throws EmployeeException
	{
		Employee e=new Employee();
		e.setSalary(2500);
		//fail("Not yet implemented");
	}

}
