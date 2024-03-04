package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAPIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2023, 12, 21);
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.plusYears(20));
		System.out.println(date2.minusYears(25));
		System.out.println(date1.isLeapYear());
		System.out.println(date1.withYear(1999));
		DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		String str5 = date1.format(formatter2);
		System.out.println(str5);
		
		
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		String myDate = date1.format(myFormatter);
		System.out.println(myDate);
	}

}
