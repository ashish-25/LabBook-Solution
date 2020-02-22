package Lab3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Zone {
	public static void main(String args[])
	{
		LocalDateTime today = LocalDateTime.now();
		 
		ZoneId id = ZoneId.of("Europe/Paris");
		ZoneId id1= ZoneId.of("Africa/Cairo");
		ZoneId id2= ZoneId.of("America/New_York");
		ZoneId id3= ZoneId.of("Australia/Sydney");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(today, id); 
		System.out.println(zonedDateTime);
		ZonedDateTime zonedDateTime1 = ZonedDateTime.of(today, id1); 
		System.out.println(zonedDateTime1);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(today, id2); 
		System.out.println(zonedDateTime2);
		ZonedDateTime zonedDateTime3 = ZonedDateTime.of(today, id3); 
		System.out.println(zonedDateTime3);
	}
}
