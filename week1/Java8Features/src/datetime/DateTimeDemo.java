package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(1947, 8, 15);
		System.out.println(date2);
		
		String str = "1991-06-19";
		LocalDate date3 = LocalDate.parse(str);
		System.out.println(date3);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str4 = "12-01-2024";
		LocalDate date = LocalDate.parse(str4, formatter);
		System.out.println(date);
		
		System.out.println(date2.getDayOfYear());
	}

}
