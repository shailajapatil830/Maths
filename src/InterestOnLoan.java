import java.util.Scanner;

public class InterestOnLoan {
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to iterest calculator");
		
					
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of years you want to borrow");
		int year = input.nextInt();
		
		System.out.println("Please enter Loan amount you want to borrow");	
		float loanAmount = input.nextFloat();
		
		float interestPercentage;
		if (year > 5) {
			interestPercentage = 10.0f;			
		}
		else {
			interestPercentage = 8.0f;
		}
		
		System.out.println("you will be charged interest at percentage: " + interestPercentage);
		
		float interestAmount = loanAmount/100*interestPercentage;		
		System.out.println("your interest Amount will be:" + interestAmount);
		
		
		
	
		
		
	}
	

}
