import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println(now.plusDays(2));

		  // System.out.println(now.get(now.plusDays(10)));  
	}

}
