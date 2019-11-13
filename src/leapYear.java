import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		
		System.out.println("Please find the leap year");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the year");
		int year = input.nextInt();
	
		
		if(year % 4 == 0)  {
			System.out.println(year + " is a leap year ");
			
		}
		else {
			System.out.println(year + " is not leap year");
		}
		
		
	}
	

}
