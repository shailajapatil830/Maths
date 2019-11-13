import java.util.Scanner;

public class PassOrFail {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter number to check passOrFail");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
								
		if(number > 67) {
			
			System.out.println("You are pass because you got " + number);
		}
		else {
			
			System.out.println("You are fail because you got " + number);
		}			
		
 }			
		
}

