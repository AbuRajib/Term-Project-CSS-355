package javaDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaCurrentDate {
	
	//LocalDate
	//LocalTime
	//LocalDateTime
	//DateTimeFormatter
	
	public static void main(String[] args) {
		
/*		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		String dtf=dt.format(df);
		System.out.println(dtf);
*/		
	
		
		System.out.printf("%s", new Date());
		System.out.println();
		System.out.printf("%tc", new Date());
		System.out.println();
		System.out.printf("%tF", new Date());
		System.out.println();
		System.out.printf("%tD", new Date());
		System.out.println();
		System.out.printf("%tT", new Date());
		System.out.println();
		System.out.printf("%tR", new Date());
		System.out.println();
		System.out.printf("%tB", new Date());
		System.out.println();
		System.out.printf("%ty", new Date());
		System.out.println();
		System.out.printf("%tA", new Date());
		System.out.println();
		System.out.printf("%tb", new Date());
		
		
	}

}
