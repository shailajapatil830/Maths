import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number to check prime or not");
		int number = input.nextInt();
		
		int divideBy;		
		for(divideBy = 2; divideBy < number; divideBy++) {
			
			if(number % divideBy == 0) {
				System.out.println("Number is not prime because it is divisible by: " + divideBy);
				break;
			}
		}
		
		if(divideBy == number) {
			
			System.out.print("Number is prime");
		}
			
	}
 
}
