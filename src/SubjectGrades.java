import java.util.Scanner;

public class SubjectGrades {
	
	private static final int percentage = 0;

	public static void main(String[] args) {
		
		System.out.println("Please check students grades");
				Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter English marks");
		int englishMarks = input.nextInt();
		
		System.out.println("Please enter maths marks");
		int mathsMarks = input.nextInt();
		
		int total = englishMarks + mathsMarks;
		System.out.println("Your total is: " + total);
		
		float percentage = (englishMarks + mathsMarks) / 2f;
		System.out.println("Your percentage: " + percentage);
		
		
		if(percentage > 80) {
			System.out.println("You got ditingusion:" + percentage);
		}
		else if(percentage > 60) {
			System.out.println("You got firstClass: " + percentage);
		}
					
		else if(percentage > 40) {
			System.out.println("You got secondClass: " + percentage);
		}
	
		else if(percentage < 40) {
			System.out.println("You got failResult: " + percentage);
		}
		
		
	}
	
}
