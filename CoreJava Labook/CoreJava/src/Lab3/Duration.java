package Lab3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Duration {
	public static void main(String[] args)
	{
		//LocalDate d1 = LocalDate.of(1982, Month.DECEMBER, 25);
		LocalDate d2 = LocalDate.of(1998, Month.MAY, 31);				//3.4
		LocalDate today = LocalDate.now();                    		//3.3
		Period dur = Period.between(today, d2);
		int years = dur.getYears();
		int months = dur.getMonths();
		int days=dur.getDays();
		System.out.println("number of years: " + years);
		System.out.println("number of months: " + months);
		System.out.println("number of Days:"+days);
	}
	}
