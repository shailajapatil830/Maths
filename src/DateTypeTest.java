import java.time.LocalDate;


public class DateTypeTest {

	public static void main(String[] args) {

		int year = 1980;
		String name = "Shailaja";
		char form = 'B';
		float percentage = 84.50f;
		boolean canVote = true;
		LocalDate dateOfBirth = LocalDate.of(1980, 11, 8);
		System.out.println("Hello: " + name);
		System.out.println("Year: " + year);
		System.out.println("Form: " + form);
		double num = -84926626.9d;

		System.out.println("Number");
		System.out.println("Total Percentage: " + percentage);
		System.out.println("Can you vote: " + canVote);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Hello mrs Shailaja Patil");

		year = 1979;
		name = "Sunil";
		form = 'C';
		percentage = 99.50f;
		canVote = true;
		dateOfBirth = LocalDate.of(1979, 10, 3);
		System.out.println("Hello: " + name);
		System.out.println("Year: " + year);
		System.out.println("Form: " + form);
		System.out.println("Total Percentage: " + percentage);
		System.out.println("Can you vote: " + canVote);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Hello mr Sunil Patil");


	}

}
	
	


