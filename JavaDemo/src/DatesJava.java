import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Local time
		LocalTime obj = LocalTime.now();
		System.out.println(obj);
		
		//Local Date
		LocalDate objDate=LocalDate.now();
		System.out.println(objDate);
		
		//Local date and time
		LocalDateTime obj2=LocalDateTime.now();
		System.out.println("Before formate :"+ obj2);
		
		// Date time formatter
		DateTimeFormatter obj3=DateTimeFormatter.ofPattern("E,MMM dd yyyy hh:mm:ss");
		String formattedDate=obj2.format(obj3);
		System.out.println(formattedDate);
	}

}
